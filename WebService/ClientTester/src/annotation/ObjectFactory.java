
package annotation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the annotation package.
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

    private final static QName _AddEmployeeToDept_QNAME = new QName("http://annotation/", "addEmployeeToDept");
    private final static QName _AddEmployeeToDeptResponse_QNAME =
        new QName("http://annotation/", "addEmployeeToDeptResponse");
    private final static QName _GetDeptInfo_QNAME = new QName("http://annotation/", "getDeptInfo");
    private final static QName _GetDeptInfoResponse_QNAME = new QName("http://annotation/", "getDeptInfoResponse");
    private final static QName _GetMyDepts_QNAME = new QName("http://annotation/", "getMyDepts");
    private final static QName _GetMyDeptsResponse_QNAME = new QName("http://annotation/", "getMyDeptsResponse");
    private final static QName _SetMyDepts_QNAME = new QName("http://annotation/", "setMyDepts");
    private final static QName _SetMyDeptsResponse_QNAME = new QName("http://annotation/", "setMyDeptsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: annotation
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddEmployeeToDept }
     *
     */
    public AddEmployeeToDept createAddEmployeeToDept() {
        return new AddEmployeeToDept();
    }

    /**
     * Create an instance of {@link AddEmployeeToDeptResponse }
     *
     */
    public AddEmployeeToDeptResponse createAddEmployeeToDeptResponse() {
        return new AddEmployeeToDeptResponse();
    }

    /**
     * Create an instance of {@link GetDeptInfo }
     *
     */
    public GetDeptInfo createGetDeptInfo() {
        return new GetDeptInfo();
    }

    /**
     * Create an instance of {@link GetDeptInfoResponse }
     *
     */
    public GetDeptInfoResponse createGetDeptInfoResponse() {
        return new GetDeptInfoResponse();
    }

    /**
     * Create an instance of {@link GetMyDepts }
     *
     */
    public GetMyDepts createGetMyDepts() {
        return new GetMyDepts();
    }

    /**
     * Create an instance of {@link GetMyDeptsResponse }
     *
     */
    public GetMyDeptsResponse createGetMyDeptsResponse() {
        return new GetMyDeptsResponse();
    }

    /**
     * Create an instance of {@link SetMyDepts }
     *
     */
    public SetMyDepts createSetMyDepts() {
        return new SetMyDepts();
    }

    /**
     * Create an instance of {@link SetMyDeptsResponse }
     *
     */
    public SetMyDeptsResponse createSetMyDeptsResponse() {
        return new SetMyDeptsResponse();
    }

    /**
     * Create an instance of {@link Emp }
     *
     */
    public Emp createEmp() {
        return new Emp();
    }

    /**
     * Create an instance of {@link Dept }
     *
     */
    public Dept createDept() {
        return new Dept();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployeeToDept }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddEmployeeToDept }{@code >}
     */
    @XmlElementDecl(namespace = "http://annotation/", name = "addEmployeeToDept")
    public JAXBElement<AddEmployeeToDept> createAddEmployeeToDept(AddEmployeeToDept value) {
        return new JAXBElement<AddEmployeeToDept>(_AddEmployeeToDept_QNAME, AddEmployeeToDept.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployeeToDeptResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddEmployeeToDeptResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://annotation/", name = "addEmployeeToDeptResponse")
    public JAXBElement<AddEmployeeToDeptResponse> createAddEmployeeToDeptResponse(AddEmployeeToDeptResponse value) {
        return new JAXBElement<AddEmployeeToDeptResponse>(_AddEmployeeToDeptResponse_QNAME,
                                                          AddEmployeeToDeptResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptInfo }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDeptInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://annotation/", name = "getDeptInfo")
    public JAXBElement<GetDeptInfo> createGetDeptInfo(GetDeptInfo value) {
        return new JAXBElement<GetDeptInfo>(_GetDeptInfo_QNAME, GetDeptInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptInfoResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDeptInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://annotation/", name = "getDeptInfoResponse")
    public JAXBElement<GetDeptInfoResponse> createGetDeptInfoResponse(GetDeptInfoResponse value) {
        return new JAXBElement<GetDeptInfoResponse>(_GetDeptInfoResponse_QNAME, GetDeptInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMyDepts }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMyDepts }{@code >}
     */
    @XmlElementDecl(namespace = "http://annotation/", name = "getMyDepts")
    public JAXBElement<GetMyDepts> createGetMyDepts(GetMyDepts value) {
        return new JAXBElement<GetMyDepts>(_GetMyDepts_QNAME, GetMyDepts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMyDeptsResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMyDeptsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://annotation/", name = "getMyDeptsResponse")
    public JAXBElement<GetMyDeptsResponse> createGetMyDeptsResponse(GetMyDeptsResponse value) {
        return new JAXBElement<GetMyDeptsResponse>(_GetMyDeptsResponse_QNAME, GetMyDeptsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMyDepts }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetMyDepts }{@code >}
     */
    @XmlElementDecl(namespace = "http://annotation/", name = "setMyDepts")
    public JAXBElement<SetMyDepts> createSetMyDepts(SetMyDepts value) {
        return new JAXBElement<SetMyDepts>(_SetMyDepts_QNAME, SetMyDepts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMyDeptsResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetMyDeptsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://annotation/", name = "setMyDeptsResponse")
    public JAXBElement<SetMyDeptsResponse> createSetMyDeptsResponse(SetMyDeptsResponse value) {
        return new JAXBElement<SetMyDeptsResponse>(_SetMyDeptsResponse_QNAME, SetMyDeptsResponse.class, null, value);
    }

}
