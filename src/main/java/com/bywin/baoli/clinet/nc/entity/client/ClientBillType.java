
package com.bywin.baoli.clinet.nc.entity.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>billType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="billType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billhead" type="{}billheadType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billType", propOrder = {
    "billhead"
})
public class ClientBillType {

    @XmlElement(required = true)
    protected ClientBillheadType billhead;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * 获取billhead属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClientBillheadType }
     *     
     */
    public ClientBillheadType getBillhead() {
        return billhead;
    }

    /**
     * 设置billhead属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClientBillheadType }
     *     
     */
    public void setBillhead(ClientBillheadType value) {
        this.billhead = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
