package com.pattern.program;

interface BusinessService{
	public void doProcessing();
}

class EjbServices implements BusinessService{

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking Ejb Service");
		
	}	
}
class JmsService implements BusinessService{

	@Override
	public void doProcessing() {
		System.out.println("Processing task by Jms Services .");
		
	}	
}

class BusinessLookUp{
	public BusinessService getBusinessService(String serviceType) {
		
		if(serviceType.equalsIgnoreCase("Ejb")) {
			return new EjbServices();
		}
		else {
			return new JmsService();
		}
	}
}

class BusinessDelegate{
	private BusinessLookUp lookupService = new BusinessLookUp();
	private BusinessService businessService;
	private String serviceType;
	
	public void setServiceType(String serviceType) {
		this.serviceType=serviceType;
	}
	
	public void doTask() {
		businessService= lookupService.getBusinessService(serviceType);
		businessService.doProcessing();
	}
}

class Client {
	BusinessDelegate businessService;
	
	public Client(BusinessDelegate businessService) {
		this.businessService= businessService;
	}
	public void doTask() {
		businessService.doTask();
	}
}

public class BusinessDelegatePattern {
	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");
		
		Client client = new Client(businessDelegate);
		client.doTask();
		
		businessDelegate.setServiceType("JMS");
		client.doTask();
	}

}
