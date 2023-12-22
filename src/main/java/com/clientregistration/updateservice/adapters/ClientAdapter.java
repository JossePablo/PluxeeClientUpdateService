package com.clientregistration.updateservice.adapters;

import com.clientregistration.updateservice.entities.salesforce.RequestSalesforce;
import com.clientregistration.updateservice.entities.salesforce.ResponseSalesforce;
import com.clientregistration.updateservice.interfaces.IClientProviderAdaptee;
import com.clientregistration.updateservice.interfaces.IClientTarget;

public class ClientAdapter implements IClientTarget{

	private IClientProviderAdaptee _clientAdaptee;
	private ResponseSalesforce responseSalesforce;
	
	public ClientAdapter(IClientProviderAdaptee adaptee) {
		this._clientAdaptee = adaptee;
	}
	
	@Override
	public void updateClient(RequestSalesforce request) {
		this.responseSalesforce = this._clientAdaptee.UpdateClient(request);
	}

	@Override
	public ResponseSalesforce updateClientResponse() {
		return this.responseSalesforce;
	}


}
