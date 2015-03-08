package org.astonbitecode.osgi.wabConsumer.jsf;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.astonbitecode.osgi.wabConsumer.service.ConsumerService;

@ManagedBean(name = "welcomeBean")
@ViewScoped
public class WelcomeBean implements Serializable {
	private String serviceMessage;
	
	@PostConstruct
	public void initBean() {
		serviceMessage = getConsumerService().invokeBlueprintService();
	}
	
	@ManagedProperty(value = "#{consumerService}")
	private ConsumerService consumerService;

	public ConsumerService getConsumerService() {
		return consumerService;
	}

	public void setConsumerService(ConsumerService consumerService) {
		this.consumerService = consumerService;
	}

	public String getServiceMessage() {
		return serviceMessage;
	}
}
