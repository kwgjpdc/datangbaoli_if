
package com.bywin.baoli.clinet.nc.entity.contract;

import lombok.Data;

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
 *         &lt;element name="pk_defdoclist" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_defdoc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_group" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pk_org" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shortname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mnecode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billheadType", propOrder = {
        "pkDefdoclist",
        "pkDefdoc",
        "pkGroup",
        "pkOrg",
        "code",
        "name",
        "shortname",
        "mnecode",
        "pid",
        "memo"
})
@Data
public class ContractBillheadType {

    @XmlElement(name = "pk_defdoclist", required = true)
    protected String pkDefdoclist;
    @XmlElement(name = "pk_defdoc", required = true)
    protected String pkDefdoc;
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
    @XmlElement(required = true)
    protected String pid;
    @XmlElement(required = true)
    protected String memo;


}
