package com.clientregistration.updateservice.controllers;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clientregistration.updateservice.adaptees.ClientsSalesforceAdaptee;
import com.clientregistration.updateservice.adapters.ClientAdapter;
import com.clientregistration.updateservice.entities.salesforce.RequestSalesforce;
import com.clientregistration.updateservice.entities.salesforce.ResponseSalesforce;

@RestController
public class ClientController {

	@PutMapping("/updateClient")
	public ResponseSalesforce updateClient(@RequestBody RequestSalesforce request) {
		ClientsSalesforceAdaptee clientSalesforceAdaptee = new ClientsSalesforceAdaptee();
		ClientAdapter clientAdapter = new ClientAdapter(clientSalesforceAdaptee);
		clientAdapter.updateClient(request);
		return clientAdapter.updateClientResponse();
	}
}