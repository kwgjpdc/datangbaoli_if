package com.bywin.baoli.clinet.finance.dto;

import lombok.Data;

/**
 * 付款DTO
 */
@Data
public class paymentDto {
    /**
     * 推送付款请求接口：业务ID，放款批次，开户行，户名，户号，金额
     * 付款结果查询接口：业务ID，放款批次
     */
    //业务id
    private String businessId;
    //放款批次
    private String batchNo;
    //开户行
    private String bankName;
    //户名
    private String accountName;
    //户号
    private String accountNo;
    //金额
    private String amount;


}
