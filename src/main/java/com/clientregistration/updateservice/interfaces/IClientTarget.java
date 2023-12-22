package com.clientregistration.updateservice.interfaces;

import com.clientregistration.updateservice.entities.salesforce.RequestSalesforce;
import com.clientregistration.updateservice.entities.salesforce.ResponseSalesforce;

public interface IClientTarget {

	ResponseSalesforce updateClientResponse();
	void updateClient(RequestSalesforce request);

}
