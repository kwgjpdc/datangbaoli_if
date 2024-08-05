package com.bywin.baoli.web;


import cn.hutool.core.util.StrUtil;
import com.bywin.baoli.clinet.nc.NcServiceClient;
import com.bywin.baoli.clinet.nc.dto.NcDto;
import com.bywin.baoli.clinet.nc.xmlgenerate.BankAccountGenerator;
import com.bywin.baoli.clinet.nc.xmlgenerate.BussGenerator;
import com.bywin.baoli.clinet.nc.xmlgenerate.FundRepayVoucherGenerator;
import com.bywin.baoli.clinet.nc.xmlgenerate.SupplierGenerator;
import lombok.extern.slf4j.Slf4j;
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
 * @author 朱宝
 * @version 1.0
 * @description: 财务NCweb接口
 * @date 2024/7/31 下午3:09
 */
@Slf4j
@RestController
@RequestMapping("/nc")
public class NcController {

    @Resource
    NcServiceClient ncServiceClient;

    /**
     * 财务NC
     */
    @Value("${finance.nc.api.cim}")
    private String ncUrl;

    @Value("${nc.dict.sender}")
    private String sender;


    @PostMapping("/send/xml")
    public Object creditAssessment(HttpServletRequest request, @RequestBody NcDto ncDto) {

        String token = request.getHeader("token");
        Object js = null;
        if (StrUtil.isBlank(token)) {
            throw new RuntimeException("token不可为空");
        }
        switch (ncDto.getNcType()) {
            //合同
            case "A":
                //处理合同xml
                String strXml = BussGenerator.getStrXml(ncDto.getCode(), ncDto.getName(), ncDto.getBillId(), ncDto.getDefdoc(), ncDto.getReplace());
                log.info("合同XML:{}", strXml);
                js = ncServiceClient.sendXml(strXml, ncUrl, token);
                break;
            //银行账户
            case "B":
                String clientXml = BankAccountGenerator.getStrXml(ncDto.getCode(), ncDto.getName(), ncDto.getBillId(), ncDto.getReplace());
                log.info("银行账户XML:{}", clientXml);
                js = ncServiceClient.sendXml(clientXml, ncUrl, token);
                break;
            //供应商
            case "C":
                String supplierXml = SupplierGenerator.getStrXml(ncDto.getCode(), ncDto.getName(), ncDto.getBillId(), ncDto.getReplace());
                log.info("供应商XML:{}", supplierXml);
                js = ncServiceClient.sendXml(supplierXml, ncUrl, token);
                break;
            //凭证
            case "D":
                String voucherXml = FundRepayVoucherGenerator.getGetRepayVoucherXmlStr(ncDto.getBchkzje(), ncDto.isPayInterest(),
                        ncDto.getAccType(), ncDto.getArgs(), ncDto.getStrPrepareDate(), ncDto.getDCGroup());
                log.info("凭证XML:{}", voucherXml);
                js = ncServiceClient.sendXml(voucherXml, ncUrl, token);
                break;
            //客户
            case "E":
//                    String voucherXml = generateVoucherXml();
//                    log.info("凭证XML:{}", voucherXml);
//                    js = ncServiceClient.sendXml(voucherXml, ncUrl, token);
                break;
            default:
                log.error("请检查ncType值是否正确");
                break;
        }
        return js;
    }

}


