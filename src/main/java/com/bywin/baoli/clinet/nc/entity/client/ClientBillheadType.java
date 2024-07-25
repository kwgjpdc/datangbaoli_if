
package com.bywin.baoli.clinet.nc.entity.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>billheadType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="billheadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pk_group" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_org" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shortname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mnecode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_custclass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_areacl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="issupplier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_supplier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custprop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_financeorg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxpayerid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_customer_main" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isfreecust" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="registerfund" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legalbody" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ecotypesincevfive" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_custtaxes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="corpaddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tel1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tel2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tel3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fax1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fax2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_timezone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="frozenflag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enablestate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billheadType", propOrder = {
    "pkGroup",
    "pkOrg",
    "code",
    "name",
    "shortname",
    "mnecode",
    "pkCustclass",
    "pkAreacl",
    "issupplier",
    "pkSupplier",
    "custprop",
    "pkFinanceorg",
    "taxpayerid",
    "pkCustomerMain",
    "trade",
    "isfreecust",
    "registerfund",
    "legalbody",
    "ecotypesincevfive",
    "pkCusttaxes",
    "corpaddress",
    "url",
    "tel1",
    "tel2",
    "tel3",
    "fax1",
    "fax2",
    "email",
    "pkCountry",
    "pkTimezone",
    "pkFormat",
    "memo",
    "frozenflag",
    "enablestate"
})
public class ClientBillheadType {

    @XmlElement(name = "pk_group", required = true)
    protected String pkGroup;
    @XmlElement(name = "pk_org", required = true)
    protected String pkOrg;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String shortname;
    @XmlElement(required = true)
    protected String mnecode;
    @XmlElement(name = "pk_custclass", required = true)
    protected String pkCustclass;
    @XmlElement(name = "pk_areacl", required = true)
    protected String pkAreacl;
    @XmlElement(required = true)
    protected String issupplier;
    @XmlElement(name = "pk_supplier", required = true)
    protected String pkSupplier;
    @XmlElement(required = true)
    protected String custprop;
    @XmlElement(name = "pk_financeorg", required = true)
    protected String pkFinanceorg;
    @XmlElement(required = true)
    protected String taxpayerid;
    @XmlElement(name = "pk_customer_main", required = true)
    protected String pkCustomerMain;
    @XmlElement(required = true)
    protected String trade;
    @XmlElement(required = true)
    protected String isfreecust;
    @XmlElement(required = true)
    protected String registerfund;
    @XmlElement(required = true)
    protected String legalbody;
    @XmlElement(required = true)
    protected String ecotypesincevfive;
    @XmlElement(name = "pk_custtaxes", required = true)
    protected String pkCusttaxes;
    @XmlElement(required = true)
    protected String corpaddress;
    @XmlElement(required = true)
    protected String url;
    @XmlElement(required = true)
    protected String tel1;
    @XmlElement(required = true)
    protected String tel2;
    @XmlElement(required = true)
    protected String tel3;
    @XmlElement(required = true)
    protected String fax1;
    @XmlElement(required = true)
    protected String fax2;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(name = "pk_country", required = true)
    protected String pkCountry;
    @XmlElement(name = "pk_timezone", required = true)
    protected String pkTimezone;
    @XmlElement(name = "pk_format", required = true)
    protected String pkFormat;
    @XmlElement(required = true)
    protected String memo;
    @XmlElement(required = true)
    protected String frozenflag;
    @XmlElement(required = true)
    protected String enablestate;

    /**
     * 获取pkGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkGroup() {
        return pkGroup;
    }

    /**
     * 设置pkGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkGroup(String value) {
        this.pkGroup = value;
    }

    /**
     * 获取pkOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkOrg() {
        return pkOrg;
    }

    /**
     * 设置pkOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkOrg(String value) {
        this.pkOrg = value;
    }

    /**
     * 获取code属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取shortname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * 设置shortname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortname(String value) {
        this.shortname = value;
    }

    /**
     * 获取mnecode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnecode() {
        return mnecode;
    }

    /**
     * 设置mnecode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnecode(String value) {
        this.mnecode = value;
    }

    /**
     * 获取pkCustclass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkCustclass() {
        return pkCustclass;
    }

    /**
     * 设置pkCustclass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkCustclass(String value) {
        this.pkCustclass = value;
    }

    /**
     * 获取pkAreacl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkAreacl() {
        return pkAreacl;
    }

    /**
     * 设置pkAreacl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkAreacl(String value) {
        this.pkAreacl = value;
    }

    /**
     * 获取issupplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssupplier() {
        return issupplier;
    }

    /**
     * 设置issupplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssupplier(String value) {
        this.issupplier = value;
    }

    /**
     * 获取pkSupplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkSupplier() {
        return pkSupplier;
    }

    /**
     * 设置pkSupplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkSupplier(String value) {
        this.pkSupplier = value;
    }

    /**
     * 获取custprop属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustprop() {
        return custprop;
    }

    /**
     * 设置custprop属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustprop(String value) {
        this.custprop = value;
    }

    /**
     * 获取pkFinanceorg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkFinanceorg() {
        return pkFinanceorg;
    }

    /**
     * 设置pkFinanceorg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkFinanceorg(String value) {
        this.pkFinanceorg = value;
    }

    /**
     * 获取taxpayerid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxpayerid() {
        return taxpayerid;
    }

    /**
     * 设置taxpayerid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxpayerid(String value) {
        this.taxpayerid = value;
    }

    /**
     * 获取pkCustomerMain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkCustomerMain() {
        return pkCustomerMain;
    }

    /**
     * 设置pkCustomerMain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkCustomerMain(String value) {
        this.pkCustomerMain = value;
    }

    /**
     * 获取trade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrade() {
        return trade;
    }

    /**
     * 设置trade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrade(String value) {
        this.trade = value;
    }

    /**
     * 获取isfreecust属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsfreecust() {
        return isfreecust;
    }

    /**
     * 设置isfreecust属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsfreecust(String value) {
        this.isfreecust = value;
    }

    /**
     * 获取registerfund属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterfund() {
        return registerfund;
    }

    /**
     * 设置registerfund属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterfund(String value) {
        this.registerfund = value;
    }

    /**
     * 获取legalbody属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalbody() {
        return legalbody;
    }

    /**
     * 设置legalbody属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalbody(String value) {
        this.legalbody = value;
    }

    /**
     * 获取ecotypesincevfive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcotypesincevfive() {
        return ecotypesincevfive;
    }

    /**
     * 设置ecotypesincevfive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcotypesincevfive(String value) {
        this.ecotypesincevfive = value;
    }

    /**
     * 获取pkCusttaxes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkCusttaxes() {
        return pkCusttaxes;
    }

    /**
     * 设置pkCusttaxes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkCusttaxes(String value) {
        this.pkCusttaxes = value;
    }

    /**
     * 获取corpaddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpaddress() {
        return corpaddress;
    }

    /**
     * 设置corpaddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpaddress(String value) {
        this.corpaddress = value;
    }

    /**
     * 获取url属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置url属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * 获取tel1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel1() {
        return tel1;
    }

    /**
     * 设置tel1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel1(String value) {
        this.tel1 = value;
    }

    /**
     * 获取tel2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel2() {
        return tel2;
    }

    /**
     * 设置tel2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel2(String value) {
        this.tel2 = value;
    }

    /**
     * 获取tel3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel3() {
        return tel3;
    }

    /**
     * 设置tel3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel3(String value) {
        this.tel3 = value;
    }

    /**
     * 获取fax1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax1() {
        return fax1;
    }

    /**
     * 设置fax1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax1(String value) {
        this.fax1 = value;
    }

    /**
     * 获取fax2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax2() {
        return fax2;
    }

    /**
     * 设置fax2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax2(String value) {
        this.fax2 = value;
    }

    /**
     * 获取email属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置email属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * 获取pkCountry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkCountry() {
        return pkCountry;
    }

    /**
     * 设置pkCountry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkCountry(String value) {
        this.pkCountry = value;
    }

    /**
     * 获取pkTimezone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkTimezone() {
        return pkTimezone;
    }

    /**
     * 设置pkTimezone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkTimezone(String value) {
        this.pkTimezone = value;
    }

    /**
     * 获取pkFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkFormat() {
        return pkFormat;
    }

    /**
     * 设置pkFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkFormat(String value) {
        this.pkFormat = value;
    }

    /**
     * 获取memo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置memo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * 获取frozenflag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrozenflag() {
        return frozenflag;
    }

    /**
     * 设置frozenflag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrozenflag(String value) {
        this.frozenflag = value;
    }

    /**
     * 获取enablestate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnablestate() {
        return enablestate;
    }

    /**
     * 设置enablestate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnablestate(String value) {
        this.enablestate = value;
    }

}
