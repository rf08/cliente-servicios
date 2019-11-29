
package WS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WS package. 
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

    private final static QName _InsetarResponse_QNAME = new QName("http://WS/", "insetarResponse");
    private final static QName _Insetar_QNAME = new QName("http://WS/", "insetar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsetarResponse }
     * 
     */
    public InsetarResponse createInsetarResponse() {
        return new InsetarResponse();
    }

    /**
     * Create an instance of {@link Insetar }
     * 
     */
    public Insetar createInsetar() {
        return new Insetar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsetarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "insetarResponse")
    public JAXBElement<InsetarResponse> createInsetarResponse(InsetarResponse value) {
        return new JAXBElement<InsetarResponse>(_InsetarResponse_QNAME, InsetarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insetar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "insetar")
    public JAXBElement<Insetar> createInsetar(Insetar value) {
        return new JAXBElement<Insetar>(_Insetar_QNAME, Insetar.class, null, value);
    }

}
