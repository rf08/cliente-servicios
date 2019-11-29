
package WS1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WS1 package. 
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

    private final static QName _GenerarPromedio_QNAME = new QName("http://WS/", "GenerarPromedio");
    private final static QName _GenerarPromedioResponse_QNAME = new QName("http://WS/", "GenerarPromedioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WS1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenerarPromedio }
     * 
     */
    public GenerarPromedio createGenerarPromedio() {
        return new GenerarPromedio();
    }

    /**
     * Create an instance of {@link GenerarPromedioResponse }
     * 
     */
    public GenerarPromedioResponse createGenerarPromedioResponse() {
        return new GenerarPromedioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarPromedio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "GenerarPromedio")
    public JAXBElement<GenerarPromedio> createGenerarPromedio(GenerarPromedio value) {
        return new JAXBElement<GenerarPromedio>(_GenerarPromedio_QNAME, GenerarPromedio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarPromedioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "GenerarPromedioResponse")
    public JAXBElement<GenerarPromedioResponse> createGenerarPromedioResponse(GenerarPromedioResponse value) {
        return new JAXBElement<GenerarPromedioResponse>(_GenerarPromedioResponse_QNAME, GenerarPromedioResponse.class, null, value);
    }

}
