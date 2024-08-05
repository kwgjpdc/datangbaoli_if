package com.bywin.baoli.web;


import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import com.bywin.baoli.aspect.WebLog;
import com.bywin.baoli.clinet.tyc.TycServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


/**
 * @author 朱宝
 * @version 1.0
 * @description: 天眼查相关接口
 * @date 2024/7/31 下午3:41
 */
@Slf4j
@RestController
@RequestMapping("/tyc")
public class TycController {


    @Autowired
    TycServiceClient tycServiceClient;
    @Value("${tyc.Authorization}")
    private String tycToken;

    @Value("${tyc.api1}")
    private String tycApi1;
    @Value("${tyc.api2}")
    private String tycApi2;

    /**
     * @description:天眼查查询企业基本信息
     * @param: keyWord
     * @return:json
     * @author 朱宝
     * @date: 2024/7/31 下午4:21
     */
    @GetMapping("/baseInfo")
    @WebLog(description = "天眼查查询企业基本信息", urlPath = "https://open.api.tianyancha.com/services/open/ic/baseinfo/normal")
    public Object baseInfo(@RequestParam(value = "keyWord") String keyWord) {
        JSONObject entries = tycServiceClient.tycApi(keyWord, tycApi1, tycToken);
        Object result = entries.get("result");
        return result;
    }

    @GetMapping("/baseInfoIncludeUsers")
    @WebLog(description = "企业基本信息（含主要人员）", urlPath = "https://open.api.tianyancha.com/services/open/ic/baseinfo/normal")
    public Object baseInfoIncludeUsers(@RequestParam(value = "keyWord") String keyWord) {
        JSONObject js = tycServiceClient.tycApi(keyWord, tycApi2, tycToken);
        Object result = js.get("result");
        return result;
    }

}
