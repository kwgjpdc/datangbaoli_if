
package com.bywin.baoli.clinet.nc.entity.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ufinterfaceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ufinterfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bill" type="{}billType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="account" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="billtype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="filename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="groupcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isexchange" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="replace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="roottag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ufinterfaceType", propOrder = {
    "bill"
})
public class SupplierUfinterfaceType {

    @XmlElement(required = true)
    protected SupplierBillType bill;
    @XmlAttribute(name = "account")
    protected String account;
    @XmlAttribute(name = "billtype")
    protected String billtype;
    @XmlAttribute(name = "filename")
    protected String filename;
    @XmlAttribute(name = "groupcode")
    protected String groupcode;
    @XmlAttribute(name = "isexchange")
    protected String isexchange;
    @XmlAttribute(name = "replace")
    protected String replace;
    @XmlAttribute(name = "roottag")
    protected String roottag;
    @XmlAttribute(name = "sender")
    protected String sender;

    /**
     * 获取bill属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierBillType }
     *     
     */
    public SupplierBillType getBill() {
        return bill;
    }

    /**
     * 设置bill属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierBillType }
     *     
     */
    public void setBill(SupplierBillType value) {
        this.bill = value;
    }

    /**
     * 获取account属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置account属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * 获取billtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilltype() {
        return billtype;
    }

    /**
     * 设置billtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilltype(String value) {
        this.billtype = value;
    }

    /**
     * 获取filename属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * 设置filename属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * 获取groupcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupcode() {
        return groupcode;
    }

    /**
     * 设置groupcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupcode(String value) {
        this.groupcode = value;
    }

    /**
     * 获取isexchange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsexchange() {
        return isexchange;
    }

    /**
     * 设置isexchange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsexchange(String value) {
        this.isexchange = value;
    }

    /**
     * 获取replace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplace() {
        return replace;
    }

    /**
     * 设置replace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplace(String value) {
        this.replace = value;
    }

    /**
     * 获取roottag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoottag() {
        return roottag;
    }

    /**
     * 设置roottag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoottag(String value) {
        this.roottag = value;
    }

    /**
     * 获取sender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * 设置sender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

}
