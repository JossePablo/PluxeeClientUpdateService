package com.clientregistration.updateservice.utilities;

import java.util.Arrays;
import java.util.concurrent.Future;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.clientregistration.updateservice.entities.salesforce.RequestSalesforce;
import com.clientregistration.updateservice.entities.salesforce.Response;
import com.clientregistration.updateservice.entities.salesforce.ResponseSalesforce;

public class RequestAPI {

	RestTemplate restTemplate;
	
	public ResponseSalesforce enviarPeticiónPut(RequestSalesforce request) {
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity <RequestSalesforce> entity = new HttpEntity<RequestSalesforce>(request, headers);
	    //return (Future<ResponseSalesforce>) restTemplate.exchange("http://localhost:8080/products", HttpMethod.PUT, entity, ResponseSalesforce.class).getBody();
	    ResponseSalesforce responseSalesforce = new ResponseSalesforce();
	    Response response = new Response();
	    response.setMessage("Successful");
	    response.setStatus("200");
	    response.setStatusCode("200");
	    responseSalesforce.setResponse(response);
	    responseSalesforce.setCustomer(request.getCustomer());
	    responseSalesforce.setOpportunity(request.getOpportunity());
	    responseSalesforce.setSalesAgreement(request.getSalesAgreement());
	    return responseSalesforce;
	}
}
