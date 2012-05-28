
package net.bluedash.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.bluedash.ws package. 
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
public class ObjectFactory {

    private final static QName _HelloResponse_QNAME = new QName("http://bluedash.net/ws", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.bluedash.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloRequest }
     * 
     */
    public HelloRequest createHelloRequest() {
        return new HelloRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bluedash.net/ws", name = "helloResponse")
    public JAXBElement<String> createHelloResponse(String value) {
        return new JAXBElement<String>(_HelloResponse_QNAME, String.class, null, value);
    }

}
