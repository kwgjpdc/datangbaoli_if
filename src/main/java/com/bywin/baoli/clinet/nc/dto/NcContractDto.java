package com.bywin.baoli.clinet.nc.dto;

import lombok.Data;

/**
 * 财务NC 合同Dto
 */
@Data
public class NcContractDto {

    /**
     * 租赁合同=zlht  融资合同=rzht
     */
    private String pk_defdoclist;

    /**
     * 所属集团,最大长度为20
     */
    private String pk_group;

    /**
     * -所属组织,最大长度为20
     */
    private String pk_org;

    /**
     档案编码,最大长度为40
     */
    private String code;

    /**
     档案名称,最大长度为200
     */
    private String name;

    /**
     简称,最大长度为200
     */
    private String shortname;

    /**
     备注,最大长度为200
     */
    private String memo;


}
