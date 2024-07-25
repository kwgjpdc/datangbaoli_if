
package com.bywin.baoli.clinet.nc.entity.supplier;

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
public class SupplierObjectFactory {

    private final static QName _Ufinterface_QNAME = new QName("", "ufinterface");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xml
     * 
     */
    public SupplierObjectFactory() {
    }

    /**
     * Create an instance of {@link SupplierUfinterfaceType }
     * 
     */
    public SupplierUfinterfaceType createUfinterfaceType() {
        return new SupplierUfinterfaceType();
    }

    /**
     * Create an instance of {@link SupplierBillType }
     * 
     */
    public SupplierBillType createBillType() {
        return new SupplierBillType();
    }

    /**
     * Create an instance of {@link SupplierBillheadType }
     * 
     */
    public SupplierBillheadType createBillheadType() {
        return new SupplierBillheadType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierUfinterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ufinterface")
    public JAXBElement<SupplierUfinterfaceType> createUfinterface(SupplierUfinterfaceType value) {
        return new JAXBElement<SupplierUfinterfaceType>(_Ufinterface_QNAME, SupplierUfinterfaceType.class, null, value);
    }

}
