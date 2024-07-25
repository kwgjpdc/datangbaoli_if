
package com.bywin.baoli.clinet.nc.entity.contract;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ContractObjectFactory {

    private final static QName _Ufinterface_QNAME = new QName("", "ufinterface");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xml
     * 
     */
    public ContractObjectFactory() {
    }

    /**
     * Create an instance of {@link ContractUfinterfaceType }
     * 
     */
    public ContractUfinterfaceType createUfinterfaceType() {
        return new ContractUfinterfaceType();
    }

    /**
     * Create an instance of {@link ContractBillType }
     * 
     */
    public ContractBillType createBillType() {
        return new ContractBillType();
    }

    /**
     * Create an instance of {@link ContractBillheadType }
     * 
     */
    public ContractBillheadType createBillheadType() {
        return new ContractBillheadType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractUfinterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ufinterface")
    public JAXBElement<ContractUfinterfaceType> createUfinterface(ContractUfinterfaceType value) {
        return new JAXBElement<ContractUfinterfaceType>(_Ufinterface_QNAME, ContractUfinterfaceType.class, null, value);
    }

}
