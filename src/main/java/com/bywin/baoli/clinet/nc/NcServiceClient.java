package com.bywin.baoli.clinet.nc;

import cn.hutool.core.util.ReUtil;
import cn.hutool.core.util.XmlUtil;
import cn.hutool.http.HttpRequest;
import com.bywin.baoli.common.res.Result;
import com.bywin.baoli.common.res.ResultCode;
import com.bywin.baoli.common.res.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;

/**
 * 财务NC服务
 */
@Slf4j
@Service
public class NcServiceClient {


    public Result sendXml(String xml, String creditAssessmentURL, String token) {
        String result2 = HttpRequest.post(creditAssessmentURL)
                .header("content-type", "application/xml")
                .header("token", token)//头信息，多个头信息多次调用此方法即可
                .body(xml)//xml内容
                .execute().body();
        //获取返回结果中的XML
        Document document = XmlUtil.parseXml(result2);
        log.info("xml{}", result2);
        // 使用 DOM API 获取 resultdescription 元素
        NodeList nodeList = document.getElementsByTagName("resultdescription");
        NodeList resultcode = document.getElementsByTagName("resultcode");
        // 检查是否找到了 resultdescription 元素
        if (nodeList.getLength() > 0 && resultcode.getLength() > 0) {
            Node resultDescriptionNode = nodeList.item(0);
            Node resultNodeCode = resultcode.item(0);
            // 获取元素的文本内容
            String resultDescriptionText = resultDescriptionNode.getTextContent();
            String code = resultNodeCode.getTextContent();
            if (code.equals("1")) {
               return  ResultUtil.success(ResultCode.SUCCESS, resultDescriptionText);
            } else {
                return ResultUtil.failure(Integer.valueOf(500), resultDescriptionText);
            }
        }
        return ResultUtil.failure(500, "发送失败");
    }
}
