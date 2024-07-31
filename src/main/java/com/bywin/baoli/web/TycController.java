package com.bywin.baoli.web;


import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import com.bywin.baoli.aspect.WebLog;
import com.bywin.baoli.clinet.rm.dto.CasDto;
import com.bywin.baoli.clinet.tyc.TycServiceClient;
import com.bywin.baoli.clinet.tyc.dto.TycVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 朱宝
 * @version 1.0
 * @description: 天眼查相关接口
 * @date 2024/7/31 下午3:41
 */
@RestController
@RequestMapping("/tyc")
public class TycController {

    private static Logger log = LoggerFactory.getLogger(TycController.class);

    @Autowired
    TycServiceClient tycServiceClient;
    @Value("${tyc.Authorization}")
    private String tycToken;

    @Value("${tyc.api1}")
    private String tycApi1;

    /**
     * @description:天眼查查询企业基本信息
     * @param: keyWord
     * @return:json
     * @author 朱宝
     * @date: 2024/7/31 下午4:21
     */
    @GetMapping("/baseInfo")
    @WebLog(description = "天眼查查询企业基本信息", urlPath = "https://open.api.tianyancha.com/services/open/ic/baseinfo/normal")
    public JSONObject baseInfo(@RequestParam(value = "keyWord") String keyWord) {
        JSONObject js = null;
        if (StrUtil.isNotBlank(tycToken)) {
            js = tycServiceClient.tycApi(keyWord, tycApi1, tycToken);
        } else {
            log.error("天眼查token不可为空");
            throw new RuntimeException("token不可为空");
        }
        return js;
    }

}
