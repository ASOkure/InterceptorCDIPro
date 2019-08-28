package com.aksam.javaeeapp;
import java.util.Random;


import javax.inject.Inject;

import org.jboss.logging.Logger;



public class IssnGenerator implements NumberGenerator {
	@Inject
	private Logger logger;
	
	@Loggable
	public String generateNumber() {
	String issn = "8-" + Math.abs(new Random().nextInt());
	logger.info("Generated ISBN : " + issn);
	return issn;
	}
}
