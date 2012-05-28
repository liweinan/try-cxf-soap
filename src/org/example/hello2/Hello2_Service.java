package org.example.hello2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2012-05-28T19:30:54.121+08:00
 * Generated source version: 2.6.0
 * 
 */
@WebServiceClient(name = "hello2", 
                  wsdlLocation = "src/hello2.wsdl",
                  targetNamespace = "http://www.example.org/hello2/") 
public class Hello2_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/hello2/", "hello2");
    public final static QName Hello2SOAP = new QName("http://www.example.org/hello2/", "hello2SOAP");
    static {
        URL url = Hello2_Service.class.getResource("src/hello2.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(Hello2_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "src/hello2.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public Hello2_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Hello2_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Hello2_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns Hello2
     */
    @WebEndpoint(name = "hello2SOAP")
    public Hello2 getHello2SOAP() {
        return super.getPort(Hello2SOAP, Hello2.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Hello2
     */
    @WebEndpoint(name = "hello2SOAP")
    public Hello2 getHello2SOAP(WebServiceFeature... features) {
        return super.getPort(Hello2SOAP, Hello2.class, features);
    }

}
