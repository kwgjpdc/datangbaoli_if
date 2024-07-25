package com.bywin.baoli.clinet.rm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 客户信息同步参数
 */
@NoArgsConstructor
@Data
public class SciDto {


    @JsonProperty("accessToken")
    private String accessToken;
    @JsonProperty("params")
    private List<ParamsDTO> params;

    @NoArgsConstructor
    @Data
    public static class ParamsDTO {
        @JsonProperty("serialNo")
        private Integer serialNo;
        @JsonProperty("orgAddress")
        private String orgAddress;
        @JsonProperty("orgEnAddress")
        private String orgEnAddress;
        @JsonProperty("parentSerialNo")
        private String parentSerialNo;
        @JsonProperty("lxdh")
        private String lxdh;
        @JsonProperty("customerMainInfo")
        private CustomerMainInfoDTO customerMainInfo;

        @NoArgsConstructor
        @Data
        public static class CustomerMainInfoDTO {
            @JsonProperty("id")
            private String id;
            @JsonProperty("customerNo")
            private String customerNo;
            @JsonProperty("bizCustomerNo")
            private String bizCustomerNo;
            @JsonProperty("customerName")
            private String customerName;
            @JsonProperty("isGroupCustomer")
            private String isGroupCustomer;
            @JsonProperty("customerEnName")
            private String customerEnName;
            @JsonProperty("customerStatus")
            private String customerStatus;
            @JsonProperty("customerType")
            private String customerType;
        }
    }
}
