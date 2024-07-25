
package com.bywin.baoli.clinet.nc.entity.contract;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.xml.bind.annotation.*;


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
 *       &lt;attribute name="businessunitcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="filename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="groupcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isexchange" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orgcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="receiver" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@Data
@Accessors(chain = true)
public class ContractUfinterfaceType {

    @XmlElement(required = true)
    protected ContractBillType bill;
    @XmlAttribute(name = "account")
    protected String account;
    @XmlAttribute(name = "billtype")
    protected String billtype;
    @XmlAttribute(name = "businessunitcode")
    protected String businessunitcode;
    @XmlAttribute(name = "filename")
    protected String filename;
    @XmlAttribute(name = "groupcode")
    protected String groupcode;
    @XmlAttribute(name = "isexchange")
    protected String isexchange;
    @XmlAttribute(name = "orgcode")
    protected String orgcode;
    @XmlAttribute(name = "receiver")
    protected String receiver;
    @XmlAttribute(name = "replace")
    protected String replace;
    @XmlAttribute(name = "roottag")
    protected String roottag;
    @XmlAttribute(name = "sender")
    protected String sender;


}
