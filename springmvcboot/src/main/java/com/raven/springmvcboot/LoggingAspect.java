package com.raven.springmvcboot;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before("execution(public * com.raven.springmvcboot.AlienController.getAliens())")
	public void log() {
		LOGGER.info("getAliens method called");
	}
	@After("execution(public * com.raven.springmvcboot.AlienController.getAliens())")
	public void logAfter() {
		LOGGER.info("after getAliens method called");
	}
	@AfterReturning("execution(public * com.raven.springmvcboot.AlienController.getAliens())")
	public void logAfterReturning() {
		LOGGER.info("logAfterReturning getAliens method called");
	}
	@AfterThrowing("execution(public * com.raven.springmvcboot.AlienController.getAliens())")
	public void logAfterThrowing() {
		LOGGER.info("logAfterThrowing getAliens method called");
	}

}
