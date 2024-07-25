
package com.bywin.baoli.clinet.nc.entity.client;

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
public class ClientObjectFactory {

    private final static QName _Ufinterface_QNAME = new QName("", "ufinterface");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xml
     * 
     */
    public ClientObjectFactory() {
    }

    /**
     * Create an instance of {@link ClientUfinterfaceType }
     * 
     */
    public ClientUfinterfaceType createUfinterfaceType() {
        return new ClientUfinterfaceType();
    }

    /**
     * Create an instance of {@link ClientBillType }
     * 
     */
    public ClientBillType createBillType() {
        return new ClientBillType();
    }

    /**
     * Create an instance of {@link ClientBillheadType }
     * 
     */
    public ClientBillheadType createBillheadType() {
        return new ClientBillheadType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientUfinterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ufinterface")
    public JAXBElement<ClientUfinterfaceType> createUfinterface(ClientUfinterfaceType value) {
        return new JAXBElement<ClientUfinterfaceType>(_Ufinterface_QNAME, ClientUfinterfaceType.class, null, value);
    }

}
