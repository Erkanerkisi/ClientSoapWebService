package com.ws.ClientWebService;

import java.util.List;
import java.util.stream.Collectors;

import com.erkan.springwebservice.endpoints.ProductEndpoint;
import com.erkan.springwebservice.endpoints.ProductEndpointService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ProductEndpointService productService = new ProductEndpointService();
		ProductEndpoint pService = productService.getProductEndpointPort();

		//pService.getProducts().stream().forEach(p -> p.getName());
		
		pService.getProducts().stream().map(x -> x.getCode()).forEach(System.out::println);;
        
        

	}
}
