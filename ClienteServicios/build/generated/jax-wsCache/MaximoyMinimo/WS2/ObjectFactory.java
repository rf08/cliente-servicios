
package WS2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WS2 package. 
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

    private final static QName _MaxyMinResponse_QNAME = new QName("http://WS/", "MaxyMinResponse");
    private final static QName _MaxyMin_QNAME = new QName("http://WS/", "MaxyMin");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WS2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MaxyMinResponse }
     * 
     */
    public MaxyMinResponse createMaxyMinResponse() {
        return new MaxyMinResponse();
    }

    /**
     * Create an instance of {@link MaxyMin }
     * 
     */
    public MaxyMin createMaxyMin() {
        return new MaxyMin();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaxyMinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "MaxyMinResponse")
    public JAXBElement<MaxyMinResponse> createMaxyMinResponse(MaxyMinResponse value) {
        return new JAXBElement<MaxyMinResponse>(_MaxyMinResponse_QNAME, MaxyMinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaxyMin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "MaxyMin")
    public JAXBElement<MaxyMin> createMaxyMin(MaxyMin value) {
        return new JAXBElement<MaxyMin>(_MaxyMin_QNAME, MaxyMin.class, null, value);
    }

}
