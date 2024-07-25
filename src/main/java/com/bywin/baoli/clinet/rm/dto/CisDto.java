package com.bywin.baoli.clinet.rm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 授信信息同步
 */
@NoArgsConstructor
@Data
public class CisDto {

    @JsonProperty("accessToken")
    private String accessToken;
    @JsonProperty("params")
    private List<ParamsDTO> params;

    @NoArgsConstructor
    @Data
    public static class ParamsDTO {
        @JsonProperty("uuid")
        private Object uuid;
        @JsonProperty("uniformCreditCode")
        private String uniformCreditCode;
        @JsonProperty("quotaType")
        private String quotaType;
        @JsonProperty("totalCreditAmount")
        private String totalCreditAmount;
        @JsonProperty("usedValue")
        private String usedValue;
        @JsonProperty("beginDate")
        private String beginDate;
        @JsonProperty("endDate")
        private String endDate;
        @JsonProperty("orgCode")
        private String orgCode;
        @JsonProperty("remark")
        private String remark;
    }
}
