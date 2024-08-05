package com.bywin.baoli.clinet.rm;

import cn.hutool.core.codec.Base64;
import cn.hutool.http.HttpException;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONException;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.bywin.baoli.clinet.rm.dto.CasDto;
import com.bywin.baoli.clinet.rm.dto.CisDto;
import com.bywin.baoli.clinet.rm.dto.SciDto;
import com.bywin.baoli.utils.DESUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


/**
 * 大唐风控远程接口调用
 */
@Slf4j
@Service
public class RmServiceClient {


    /**
     * 信用评估
     *
     * @param casDto              类型
     * @param creditAssessmentURL URL
     * @param token               授权token
     * @return
     */
    public JSONObject creditAssessment(CasDto casDto, String creditAssessmentURL, String token) {
        JSONObject js = null;
        try {
            String jsonStr = JSONUtil.toJsonStr(casDto);
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

    /**
     * @param custPo
     * @param customerInfoSyncURL
     * @param token
     * @return
     */
    public JSONObject customerInfoSync(SciDto custPo, String customerInfoSyncURL, String token) {
        JSONObject js = null;
        try {
            //获取需要加密的参数
            String customerNo = custPo.getParams().get(0).getCustomerMainInfo().getCustomerNo();
            String strCustomerNo = encrypt(customerNo);
            custPo.setAccessToken(strCustomerNo);
            String jsonStr = JSONUtil.toJsonStr(custPo);
            //参数加密
            log.info("加密后的json参数:{}", jsonStr);
            String result2 = HttpRequest.post(customerInfoSyncURL)
                    .header("token", token)//头信息，多个头信息多次调用此方法即可
                    .body(jsonStr)//表单内容
                    .execute().body();
            js = JSONUtil.parseObj(result2);
        } catch (JSONException e) {
            log.error("Json解析异常");
            throw new RuntimeException(e);
        } catch (HttpException e) {
            log.error("第三方接口请求异常{}", customerInfoSyncURL);
            throw new RuntimeException(e);
        }
        return js;
    }

    public String encrypt(String data) {
        try {
            return DESUtils.encrypt(Base64.encode(data), "jkdj!@#$%");
        } catch (Exception e) {
            log.error("DESUtils加密异常");
            throw new RuntimeException(e);
        }
    }

    public JSONObject csiSync(CisDto cisDto, String cisURL, String token) {
        JSONObject js = null;
        try {
            //获取需要加密的参数
            String uniformCreditCode = cisDto.getParams().get(0).getUniformCreditCode();
            String strCode = encrypt(uniformCreditCode);
            cisDto.setAccessToken(strCode);
            String jsonStr = JSONUtil.toJsonStr(cisDto);
            //参数加密
            log.info("加密后的json参数:{}", jsonStr);
            String result2 = HttpRequest.post(cisURL)
                    .header("token", token)//头信息，多个头信息多次调用此方法即可
                    .body(jsonStr)//表单内容
                    .timeout(20000)//超时毫秒
                    .execute().body();
            js = JSONUtil.parseObj(result2);
        } catch (JSONException e) {
            log.error("Json解析异常");
            throw new RuntimeException(e);
        } catch (HttpException e) {
            log.error("第三方接口请求异常{}", cisURL);
            throw new RuntimeException(e);
        }
        return js;
    }

}

