
package com.bywin.baoli.clinet.nc.entity.supplier;

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
 *         &lt;element name="ename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mnecode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_supplier_main" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="supprop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_areacl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_supplierclass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iscustomer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="corcustomer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isfreecust" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isoutcheck" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_financeorg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxpayerid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="registerfund" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legalbody" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ecotypesincevfive" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_suptaxes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zipcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tel1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tel2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tel3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fax1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fax2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_timezone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_format" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "ename",
    "mnecode",
    "trade",
    "pkSupplierMain",
    "supprop",
    "pkAreacl",
    "pkSupplierclass",
    "iscustomer",
    "corcustomer",
    "isfreecust",
    "isoutcheck",
    "pkFinanceorg",
    "taxpayerid",
    "registerfund",
    "legalbody",
    "ecotypesincevfive",
    "pkSuptaxes",
    "zipcode",
    "url",
    "memo",
    "tel1",
    "tel2",
    "tel3",
    "fax1",
    "fax2",
    "email",
    "pkCountry",
    "pkTimezone",
    "pkFormat",
    "enablestate"
})
public class SupplierBillheadType {

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
    protected String ename;
    @XmlElement(required = true)
    protected String mnecode;
    @XmlElement(required = true)
    protected String trade;
    @XmlElement(name = "pk_supplier_main", required = true)
    protected String pkSupplierMain;
    @XmlElement(required = true)
    protected String supprop;
    @XmlElement(name = "pk_areacl", required = true)
    protected String pkAreacl;
    @XmlElement(name = "pk_supplierclass", required = true)
    protected String pkSupplierclass;
    @XmlElement(required = true)
    protected String iscustomer;
    @XmlElement(required = true)
    protected String corcustomer;
    @XmlElement(required = true)
    protected String isfreecust;
    @XmlElement(required = true)
    protected String isoutcheck;
    @XmlElement(name = "pk_financeorg", required = true)
    protected String pkFinanceorg;
    @XmlElement(required = true)
    protected String taxpayerid;
    @XmlElement(required = true)
    protected String registerfund;
    @XmlElement(required = true)
    protected String legalbody;
    @XmlElement(required = true)
    protected String ecotypesincevfive;
    @XmlElement(name = "pk_suptaxes", required = true)
    protected String pkSuptaxes;
    @XmlElement(required = true)
    protected String zipcode;
    @XmlElement(required = true)
    protected String url;
    @XmlElement(required = true)
    protected String memo;
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
     * 获取ename属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEname() {
        return ename;
    }

    /**
     * 设置ename属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEname(String value) {
        this.ename = value;
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
     * 获取pkSupplierMain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkSupplierMain() {
        return pkSupplierMain;
    }

    /**
     * 设置pkSupplierMain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkSupplierMain(String value) {
        this.pkSupplierMain = value;
    }

    /**
     * 获取supprop属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupprop() {
        return supprop;
    }

    /**
     * 设置supprop属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupprop(String value) {
        this.supprop = value;
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
     * 获取pkSupplierclass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkSupplierclass() {
        return pkSupplierclass;
    }

    /**
     * 设置pkSupplierclass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkSupplierclass(String value) {
        this.pkSupplierclass = value;
    }

    /**
     * 获取iscustomer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIscustomer() {
        return iscustomer;
    }

    /**
     * 设置iscustomer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIscustomer(String value) {
        this.iscustomer = value;
    }

    /**
     * 获取corcustomer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorcustomer() {
        return corcustomer;
    }

    /**
     * 设置corcustomer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorcustomer(String value) {
        this.corcustomer = value;
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
     * 获取isoutcheck属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoutcheck() {
        return isoutcheck;
    }

    /**
     * 设置isoutcheck属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoutcheck(String value) {
        this.isoutcheck = value;
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
     * 获取pkSuptaxes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkSuptaxes() {
        return pkSuptaxes;
    }

    /**
     * 设置pkSuptaxes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkSuptaxes(String value) {
        this.pkSuptaxes = value;
    }

    /**
     * 获取zipcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * 设置zipcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipcode(String value) {
        this.zipcode = value;
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
