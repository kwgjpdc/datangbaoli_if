package com.bywin.baoli.clinet.nc;

import cn.hutool.core.util.XmlUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import com.bywin.baoli.aspect.WebLog;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * 财务NC服务
 */
@Slf4j
@Service
public class NcServiceClient {


    @WebLog(description = "财务NC发送XML", urlPath = "/service/XChangeServlet?account=001&groupcode=1")
    public String sendXml(String xml, String creditAssessmentURL, String token) {
        String result2 = HttpRequest.post(creditAssessmentURL)
                .header("content-type", "application/xml")
                .header("token", token)//头信息，多个头信息多次调用此方法即可
                .body(xml)//xml内容
                .timeout(20000)//超时，毫秒
                .execute().body();
        //获取返回结果中的XML
        Document document = XmlUtil.parseXml(result2);
        log.info("xml{}", result2);
        // 使用 DOM API 获取 resultdescription 元素
        NodeList nodeList = document.getElementsByTagName("resultdescription");
        NodeList resultcode = document.getElementsByTagName("resultcode");
        String resultDescriptionText = null;
        // 检查是否找到了 resultdescription 元素
        if (nodeList.getLength() > 0 && resultcode.getLength() > 0) {
            Node resultDescriptionNode = nodeList.item(0);
            // 获取元素的文本内容
             resultDescriptionText = resultDescriptionNode.getTextContent();
        }
        return resultDescriptionText;
    }
}
