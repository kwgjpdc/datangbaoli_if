
package com.bywin.baoli.clinet.nc.entity.contract;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.xml.bind.annotation.*;


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
@Data
@Accessors(chain = true)
public class ContractBillType {

    @XmlElement(required = true)
    protected ContractBillheadType billhead;
    @XmlAttribute(name = "id")
    protected String id;

}
