package com.bywin.baoli.web;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import com.bywin.baoli.clinet.nc.NcServiceClient;
import com.bywin.baoli.clinet.nc.dto.NcContractDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 财务NC接口
 */
@RestController
@RequestMapping("/nc")
public class NcController {
    private static Logger log = LoggerFactory.getLogger(NcController.class);

    @Resource
    NcServiceClient ncServiceClient;

    /**
     * 财务NC
     */
    @Value("${finance.nc.api.cim}")
    private String ncUrl;


    @PostMapping("/send/xml")
    public JSONObject creditAssessment(HttpServletRequest request, @RequestBody NcContractDto nc) {

        String token = request.getHeader("token");
        JSONObject js = null;
        if (StrUtil.isNotBlank(token)) {
            js = ncServiceClient.sendXml(nc, ncUrl, token);
        } else {
            log.error("信用评估,token不可为空");
            throw new RuntimeException("token不可为空");
        }
        return js;
    }

}


