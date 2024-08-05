package com.bywin.baoli.web;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import com.bywin.baoli.clinet.finance.dto.paymentDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 财务NC接口
 */
@Slf4j
@RestController
@RequestMapping("/finance")
public class FinanceController {

    @PostMapping("/payment")
    public JSONObject creditAssessment(@RequestBody paymentDto pay) {
        JSONObject js = new JSONObject();

        if (ObjectUtil.isNotNull(pay)) {
            String businessId = pay.getBusinessId();
            String batchNo = pay.getBatchNo();
            String bankName = pay.getBankName();
            String accountName = pay.getAccountName();
            String accountNo = pay.getAccountNo();
            String amount = pay.getAmount();
            log.info("付款信息：" + businessId + " " + batchNo + " " + bankName + " " + accountName + " " + accountNo + " " + amount);
            js.set("code", "200");
            js.set("msg", "付款成功");
            return js;
        } else {
            js.set("code", "500");
            js.set("msg", "参数不可为空");
            return js;
        }
    }

    /**
     * 查询付款信息
     *
     * @param pay
     * @return
     */
    @PostMapping("/getPaymentInfo")
    public JSONObject getPaymentInfo(@RequestBody paymentDto pay) {
        JSONObject js = new JSONObject();
        String businessId = pay.getBusinessId();
        if (StrUtil.isNotBlank(businessId)) {
            js.set("code", "200");
            js.set("msg", "付款信息查询成功");
            paymentDto p = new paymentDto();
            p.setBusinessId(pay.getBusinessId());
            p.setBatchNo("6222351406228098763");
            p.setBankName("中国工商银行");
            p.setAccountName("张三");
            p.setAccountNo("6222804173494476561");
            p.setAmount("548545451.568");
            js.set("data", p);
        } else {
            js.set("code", "500");
            js.set("msg", "businessId不可为空");
        }
        return js;
    }


}






