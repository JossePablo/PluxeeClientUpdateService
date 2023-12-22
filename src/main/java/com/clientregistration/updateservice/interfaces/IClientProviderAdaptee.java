package com.clientregistration.updateservice.interfaces;

import com.clientregistration.updateservice.entities.salesforce.RequestSalesforce;
import com.clientregistration.updateservice.entities.salesforce.ResponseSalesforce;

public interface IClientProviderAdaptee {

	ResponseSalesforce UpdateClient(RequestSalesforce request);
}
