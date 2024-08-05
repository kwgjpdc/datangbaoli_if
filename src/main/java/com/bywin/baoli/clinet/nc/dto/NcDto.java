package com.bywin.baoli.clinet.nc.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Map;

@Data
public class NcDto {
    //要生成的XML类型
    private String ncType;
    //以下为合同所需字段
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //组织编码
    public String orgCode;
    //租赁合同=zlht  融资合同=rzht
    public String pkDefdoclist;
    //数据库___根据表名(NC_EXCHANGE_SUPPLIER)获取最大流水号
    public String billId;
    //所属集团,最大长度为20
    public String pkGroup;
    //所属组织
    public String pkOrg;
    //档案名称
    public String name;
    //档案编码
    public String code;
    //简称
    public String shortname;
    //助记码
    public String mnecode;
    //上级档案
    public String pid;
    //备注
    public String memo;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String replace;

    public String defdoc;


    public BigDecimal bchkzje;

    public boolean isPayInterest;

    public String accType;

    public Map<String, String> args;

    public String strPrepareDate;

    public String DCGroup;


}
