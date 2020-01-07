package web.spring.controller;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextProvider implements ApplicationContextAware{
	//Singleton Pattern
	private ApplicationContext app;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		app = applicationContext; 
	}
	
	public ApplicationContext getApplicationContext() {
		return app;
	}

}
