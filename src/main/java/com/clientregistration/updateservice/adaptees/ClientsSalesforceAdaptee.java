package com.clientregistration.updateservice.adaptees;

import com.clientregistration.updateservice.entities.salesforce.RequestSalesforce;
import com.clientregistration.updateservice.entities.salesforce.ResponseSalesforce;
import com.clientregistration.updateservice.interfaces.IClientProviderAdaptee;
import com.clientregistration.updateservice.utilities.RequestAPI;


public class ClientsSalesforceAdaptee implements IClientProviderAdaptee{

	public ClientsSalesforceAdaptee() {}
	
	@Override
	public ResponseSalesforce UpdateClient(RequestSalesforce request) {
		// TODO Auto-generated method stub
		RequestAPI requestAPI = new RequestAPI();
		return requestAPI.enviarPeticiónPut(request);
	}

}
