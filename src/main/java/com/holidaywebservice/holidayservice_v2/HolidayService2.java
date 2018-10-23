
package com.holidaywebservice.holidayservice_v2;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * Web service that calculates holiday dates. (Version 2.0.1)
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HolidayService2", targetNamespace = "http://www.holidaywebservice.com/HolidayService_v2/", wsdlLocation = "http://www.holidaywebservice.com//HolidayService_v2/HolidayService2.asmx?wsdl")
public class HolidayService2
    extends Service
{

    private final static URL HOLIDAYSERVICE2_WSDL_LOCATION;
    private final static WebServiceException HOLIDAYSERVICE2_EXCEPTION;
    private final static QName HOLIDAYSERVICE2_QNAME = new QName("http://www.holidaywebservice.com/HolidayService_v2/", "HolidayService2");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.holidaywebservice.com//HolidayService_v2/HolidayService2.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HOLIDAYSERVICE2_WSDL_LOCATION = url;
        HOLIDAYSERVICE2_EXCEPTION = e;
    }

    public HolidayService2() {
        super(__getWsdlLocation(), HOLIDAYSERVICE2_QNAME);
    }

    public HolidayService2(WebServiceFeature... features) {
        super(__getWsdlLocation(), HOLIDAYSERVICE2_QNAME, features);
    }

    public HolidayService2(URL wsdlLocation) {
        super(wsdlLocation, HOLIDAYSERVICE2_QNAME);
    }

    public HolidayService2(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HOLIDAYSERVICE2_QNAME, features);
    }

    public HolidayService2(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HolidayService2(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HolidayService2Soap
     */
    @WebEndpoint(name = "HolidayService2Soap")
    public HolidayService2Soap getHolidayService2Soap() {
        return super.getPort(new QName("http://www.holidaywebservice.com/HolidayService_v2/", "HolidayService2Soap"), HolidayService2Soap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HolidayService2Soap
     */
    @WebEndpoint(name = "HolidayService2Soap")
    public HolidayService2Soap getHolidayService2Soap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.holidaywebservice.com/HolidayService_v2/", "HolidayService2Soap"), HolidayService2Soap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HOLIDAYSERVICE2_EXCEPTION!= null) {
            throw HOLIDAYSERVICE2_EXCEPTION;
        }
        return HOLIDAYSERVICE2_WSDL_LOCATION;
    }

}