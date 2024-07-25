package com.bywin.baoli.web;
import com.bywin.baoli.clinet.nc.entity.supplier.SupplierBillType;

import com.bywin.baoli.clinet.nc.entity.client.ClientBillheadType;
import com.bywin.baoli.clinet.nc.entity.client.ClientBillType;

import cn.hutool.core.util.XmlUtil;
import com.bywin.baoli.clinet.nc.entity.client.ClientObjectFactory;
import com.bywin.baoli.clinet.nc.entity.client.ClientUfinterfaceType;
import com.bywin.baoli.clinet.nc.entity.contract.ContractBillType;
import com.bywin.baoli.clinet.nc.entity.contract.ContractBillheadType;

import cn.hutool.core.util.StrUtil;
import com.bywin.baoli.clinet.nc.NcServiceClient;
import com.bywin.baoli.clinet.nc.dto.NcContractDto;
import com.bywin.baoli.clinet.nc.entity.contract.ContractObjectFactory;
import com.bywin.baoli.clinet.nc.entity.contract.ContractUfinterfaceType;
import com.bywin.baoli.clinet.nc.entity.supplier.SupplierBillheadType;
import com.bywin.baoli.clinet.nc.entity.supplier.SupplierObjectFactory;
import com.bywin.baoli.clinet.nc.entity.supplier.SupplierUfinterfaceType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;

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
    public Object creditAssessment(HttpServletRequest request, @RequestBody NcContractDto nc) {

        String token = request.getHeader("token");
        Object js = null;
        if (StrUtil.isNotBlank(token)) {
            switch (nc.getNcType()) {
                //合同
                case "A":
                    //处理合同xml
                    String xmlStr = generateContractsXml();
                    log.info("合同XML:{}", xmlStr);
                    js = ncServiceClient.sendXml(xmlStr, ncUrl, token);
                    //客户
                case "B":
                    String clientXml = generateClientXml();
                    js = ncServiceClient.sendXml(clientXml, ncUrl, token);
                    //凭证格式
                case "C":
                    String supplierXml = generateSupplierXml();
                    js = ncServiceClient.sendXml(supplierXml, ncUrl, token);
                default:
                    log.error("请检查ncType值是否正确");
                    break;
            }
        } else {
            log.error("信用评估,token不可为空");
            throw new RuntimeException("token不可为空");
        }
        return js;
    }

    /**
     * 生成合同XML
     */
    public String generateContractsXml() {
        ContractObjectFactory objectFactory = new ContractObjectFactory();

        ContractUfinterfaceType contractUfinterfaceType = objectFactory.createUfinterfaceType();
        contractUfinterfaceType.setAccount("develop");
        contractUfinterfaceType.setBilltype("defdoc");
        contractUfinterfaceType.setBusinessunitcode("058702056");
        contractUfinterfaceType.setFilename("");
        contractUfinterfaceType.setGroupcode("1");
        contractUfinterfaceType.setIsexchange("Y");
        contractUfinterfaceType.setOrgcode("058702056");
        contractUfinterfaceType.setReceiver("058702056");
        contractUfinterfaceType.setReplace("Y");
        contractUfinterfaceType.setRoottag("rootorg");
        contractUfinterfaceType.setSender("DTZC");

        ContractBillType contractBillType = objectFactory.createBillType();
        contractBillType.setId("123123");


        ContractBillheadType contractBillheadType = objectFactory.createBillheadType();
        contractBillheadType.setPkDefdoclist("zlht");
        contractBillheadType.setPkDefdoc("");
        contractBillheadType.setPkGroup("1");
        contractBillheadType.setPkOrg("058702056");
        contractBillheadType.setCode("test");
        contractBillheadType.setName("test");
        contractBillheadType.setShortname("test");
        contractBillheadType.setMnecode("");
        contractBillheadType.setPid("");
        contractBillheadType.setMemo("test");

        contractUfinterfaceType.setBill(contractBillType);
        contractBillType.setBillhead(contractBillheadType);
        //对象转XML
        Document document = XmlUtil.beanToXml(contractUfinterfaceType);
        String strXml = XmlUtil.toStr(document);
        return strXml;
    }


    /**
     * 生成客户XML
     *
     * @return
     */
    public String generateClientXml() {
        ClientObjectFactory clientFactory = new ClientObjectFactory();

        ClientUfinterfaceType ufinterfaceType = clientFactory.createUfinterfaceType();
        ufinterfaceType.setAccount("develop");
        ufinterfaceType.setBilltype("customer");
        ufinterfaceType.setBusinessunitcode("1");
        ufinterfaceType.setFilename("");
        ufinterfaceType.setGroupcode("1");
        ufinterfaceType.setIsexchange("Y");
        ufinterfaceType.setOrgcode("1");
        ufinterfaceType.setReceiver("1");
        ufinterfaceType.setReplace("Y");
        ufinterfaceType.setRoottag("");
        ufinterfaceType.setSender("DTZC");

        ClientBillType billType = clientFactory.createBillType();
        billType.setId("1qaz1qaz");

        ClientBillheadType billheadType = clientFactory.createBillheadType();
        billheadType.setPkGroup("1");
        billheadType.setPkOrg("1");
        billheadType.setCode("01qaz");
        billheadType.setName("用友测试0");
        billheadType.setShortname("客户简称");
        billheadType.setMnecode("");
        billheadType.setPkCustclass("12");
        billheadType.setPkAreacl("");
        billheadType.setIssupplier("N");
        billheadType.setPkSupplier("");
        billheadType.setCustprop("0");
        billheadType.setPkFinanceorg("");
        billheadType.setTaxpayerid("");
        billheadType.setPkCustomerMain("");
        billheadType.setTrade("");
        billheadType.setIsfreecust("N");
        billheadType.setRegisterfund("");
        billheadType.setLegalbody("");
        billheadType.setEcotypesincevfive("");
        billheadType.setPkCusttaxes("");
        billheadType.setCorpaddress("");
        billheadType.setUrl("www.ufida.com.cn");
        billheadType.setTel1("111");
        billheadType.setTel2("1111");
        billheadType.setTel3("11111");
        billheadType.setFax1("a");
        billheadType.setFax2("a");
        billheadType.setEmail("a");
        billheadType.setPkCountry("CN");
        billheadType.setPkTimezone("P0800");
        billheadType.setPkFormat("ZH-CN");
        billheadType.setMemo("");
        billheadType.setFrozenflag("N");
        billheadType.setEnablestate("2");

        billType.setBillhead(billheadType);
        ufinterfaceType.setBill(billType);
        //对象转XML
        Document document = XmlUtil.beanToXml(ufinterfaceType);
        String strXml = XmlUtil.toStr(document);
        return strXml;
    }


    /**
     * 生成供应商XML
     *
     * @return
     */
    public String generateSupplierXml() {
        SupplierObjectFactory supplierFactory = new SupplierObjectFactory();
        SupplierUfinterfaceType ufinterfaceType = supplierFactory.createUfinterfaceType();
        ufinterfaceType.setAccount("develop");
        ufinterfaceType.setBilltype("supplier");
        ufinterfaceType.setFilename("");
        ufinterfaceType.setGroupcode("1");
        ufinterfaceType.setIsexchange("Y");
        ufinterfaceType.setReplace("Y");
        ufinterfaceType.setRoottag("");
        ufinterfaceType.setSender("DTZC");

        SupplierBillType billType = supplierFactory.createBillType();
        billType.setId("123123123123");

        SupplierBillheadType billheadType = supplierFactory.createBillheadType();
        billheadType.setPkGroup("1");
        billheadType.setPkOrg("1");
        billheadType.setCode("acc");
        billheadType.setName("abc");
        billheadType.setShortname("a");
        billheadType.setEname("a");
        billheadType.setMnecode("a");
        billheadType.setTrade("");
        billheadType.setPkSupplierMain("");
        billheadType.setSupprop("0");
        billheadType.setPkAreacl("");
        billheadType.setPkSupplierclass("12");
        billheadType.setIscustomer("Y");
        billheadType.setCorcustomer("acc");
        billheadType.setIsfreecust("N");
        billheadType.setIsoutcheck("N");
        billheadType.setPkFinanceorg("");
        billheadType.setTaxpayerid("");
        billheadType.setRegisterfund("0.00000000");
        billheadType.setLegalbody("");
        billheadType.setEcotypesincevfive("");
        billheadType.setPkSuptaxes("");
        billheadType.setZipcode("");
        billheadType.setUrl("a");
        billheadType.setMemo("");
        billheadType.setTel1("");
        billheadType.setTel2("");
        billheadType.setTel3("");
        billheadType.setFax1("");
        billheadType.setFax2("");
        billheadType.setEmail("");
        billheadType.setPkCountry("CN");
        billheadType.setPkTimezone("P0800");
        billheadType.setPkFormat("ZH-CN");
        billheadType.setEnablestate("2");

        ufinterfaceType.setBill(billType);
        billType.setBillhead(billheadType);
        //对象转XML
        Document document = XmlUtil.beanToXml(ufinterfaceType);
        String strXml = XmlUtil.toStr(document);
        return strXml;
    }

}


