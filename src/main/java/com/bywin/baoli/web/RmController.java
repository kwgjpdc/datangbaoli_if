package com.bywin.baoli.web;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import com.bywin.baoli.clinet.rm.RmServiceClient;
import com.bywin.baoli.clinet.rm.dto.CasDto;
import com.bywin.baoli.clinet.rm.dto.CisDto;
import com.bywin.baoli.clinet.rm.dto.SciDto;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 风控接口
 */
@Slf4j
@RestController
@RequestMapping("/rm")
public class RmController {

    @Resource
    RmServiceClient rmServiceClient;

    /**
     * 信用评估URL
     */
    @Value("${api.rm.cas}")
    private String casUrl;

    /**
     * 客户信息同步URL
     */
    @Value("${api.rm.cim}")
    private String cimUrl;

    /**
     * 授信信息同步URL
     */
    @Value("${api.rm.cis}")
    private String cisUrl;


    /**
     * 信用评估(调用第三方接口参数以及响应)<br>
     * 黑名单判断：check_type=”1”，统一社会信用代码<br>
     * 准入审查判断：check_type=”2”，统一社会信用代码，所属企业<br>
     * 信用评级判断：check_type=”3”，统一社会信用代码，所属企业<br>
     * 黑名单+准入审查+信用评级 整体判断：check_type=”4”，统一社会信用代码，所属企业<br>
     * 判断用户是否存在 check_type=” 5 ”,统一社会信用代码，所属企业<br>
     * <p>
     * {
     * "resultCode": 0, // 0表示请求成功，-1表示请求失败<br>
     * "message": "当前客户准入审查不通过！",//审查不通过提示信息<br>
     * "checkFlag": false  //false审核不通过，true 审核通过<br>
     * }
     * 信用评估
     *
     * @param request
     * @param casDto
     * @return
     */
    @PostMapping("/credit/assessment")
    public JSONObject creditAssessment(HttpServletRequest request, @RequestBody CasDto casDto) {
        String token = request.getHeader("token");
        if (StrUtil.isBlank(token)) {
            throw new RuntimeException("token不可为空");
        }
        JSONObject js = rmServiceClient.creditAssessment(casDto, casUrl, token);
        return js;
    }

    /**
     * 同步客户信息至风控系统
     *
     * @param request
     * @param custDto
     * @return
     */
    @PostMapping("/customer/sync")
    public JSONObject CustomerInformationSynchronization(HttpServletRequest request, @RequestBody SciDto custDto) {
        String token = request.getHeader("token");
        if (StrUtil.isBlank(token)) {
            throw new RuntimeException("token不可为空");
        }
        JSONObject entries = rmServiceClient.customerInfoSync(custDto, cimUrl, token);
        return entries;
    }


    /**
     * 客户授信信息同步
     *
     * @param request
     * @param cisDTO
     * @return
     */
    @PostMapping("/cis/sync")
    public JSONObject cisSync(HttpServletRequest request, @RequestBody CisDto cisDTO) {
        String token = request.getHeader("token");
        if (StrUtil.isBlank(token)) {
            throw new RuntimeException("token不可为空");
        }
        JSONObject entries = rmServiceClient.csiSync(cisDTO, cisUrl, token);
        return entries;
    }
}


