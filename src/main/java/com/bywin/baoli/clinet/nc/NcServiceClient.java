package com.bywin.baoli.clinet.nc;

import cn.hutool.http.HttpException;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONException;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.bywin.baoli.aspect.WebLog;
import com.bywin.baoli.clinet.nc.dto.NcContractDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 财务NC服务
 */
@Service
public class NcServiceClient {

    private static Logger log = LoggerFactory.getLogger(NcServiceClient.class);
    @WebLog(description = "凭证信息发送", urlPath = "/rms/rwfs/blGeneralAuditCheck.json")
    public JSONObject sendXml(NcContractDto nc, String creditAssessmentURL, String token) {
        JSONObject js = null;
        try {
            String jsonStr = JSONUtil.toJsonStr(nc);
            String result2 = HttpRequest.post(creditAssessmentURL)
                    .header("token", token)//头信息，多个头信息多次调用此方法即可
                    .body(jsonStr)//表单内容
                    .timeout(20000)//超时，毫秒
                    .execute().body();
            js = JSONUtil.parseObj(result2);
        } catch (JSONException e) {
            log.error("Json解析异常");
            throw new RuntimeException(e);
        } catch (HttpException e) {
            log.error("第三方接口请求异常{}", creditAssessmentURL);
            throw new RuntimeException(e);
        }
        return js;
    }
}
