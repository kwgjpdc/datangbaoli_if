package com.bywin.baoli.clinet.nc.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Map;

@Data
public class NcDto {

    private String ncType;

    //组织编码
    public String orgCode;
    //根据表名(NC_EXCHANGE_SUPPLIER)获取最大流水号
    public String billId;
    //
    public String code;
    //合同名称或供应商名称
    public String name;
    //
    public String replace;

    public String defdoc;


    public BigDecimal bchkzje;
    public boolean isPayInterest;
    public String accType;
    public Map<String, String> args;
    public String strPrepareDate;
    public String DCGroup;


}
