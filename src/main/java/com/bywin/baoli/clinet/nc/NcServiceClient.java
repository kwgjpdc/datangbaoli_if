package com.bywin.baoli.clinet.nc;

import cn.hutool.core.util.XmlUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import com.bywin.baoli.aspect.WebLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * 财务NC服务
 */
@Service
public class NcServiceClient {

    private static Logger log = LoggerFactory.getLogger(NcServiceClient.class);

    @WebLog(description = "财务NC发送XML", urlPath = "/service/XChangeServlet?account=001&groupcode=1")
    public Object sendXml(String xml, String creditAssessmentURL, String token) {
        JSONObject js = null;
        String result2 = HttpRequest.post(creditAssessmentURL)
                .header("content-type", "application/xml")
                .header("token", token)//头信息，多个头信息多次调用此方法即可
                .body(xml)//xml内容
                .timeout(20000)//超时，毫秒
                .execute().body();
        //获取返回结果中的XML
        Document document = XmlUtil.parseXml(result2);
        return result2;
    }
}
