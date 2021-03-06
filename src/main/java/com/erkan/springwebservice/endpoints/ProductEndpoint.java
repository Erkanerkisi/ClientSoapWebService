
package com.erkan.springwebservice.endpoints;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductEndpoint", targetNamespace = "http://endpoints.SpringWebService.erkan.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductEndpoint {


    /**
     * 
     * @return
     *     returns java.util.List<com.erkan.springwebservice.endpoints.Product>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProducts", targetNamespace = "http://endpoints.SpringWebService.erkan.com/", className = "com.erkan.springwebservice.endpoints.GetProducts")
    @ResponseWrapper(localName = "getProductsResponse", targetNamespace = "http://endpoints.SpringWebService.erkan.com/", className = "com.erkan.springwebservice.endpoints.GetProductsResponse")
    public List<Product> getProducts();

    /**
     * 
     * @param arg0
     * @return
     *     returns com.erkan.springwebservice.endpoints.Product
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProduct", targetNamespace = "http://endpoints.SpringWebService.erkan.com/", className = "com.erkan.springwebservice.endpoints.GetProduct")
    @ResponseWrapper(localName = "getProductResponse", targetNamespace = "http://endpoints.SpringWebService.erkan.com/", className = "com.erkan.springwebservice.endpoints.GetProductResponse")
    public Product getProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
