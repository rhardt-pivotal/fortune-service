package io.pivotal.fortune;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class FortuneServiceDuplicate {

	Logger logger = LoggerFactory
			.getLogger(FortuneServiceDuplicate.class);


	FortuneRepository fortuneRepo;


	public String getFortune(){

		Fortune fortune = fortuneRepo.findRandomFortune();
		logger.debug("Got {}", fortune.toString());
		return fortune.getText();
	}

	public String getDefaultFortune(){
		logger.debug("Default fortune used");
		logger.debug("Default fortune used");
		logger.debug("Default fortune used");
		logger.debug("Default fortune used");
		logger.debug("Default fortune used");
		logger.debug("Default fortune used");
		logger.debug("Default fortune used");
		logger.debug("Default fortune used");
		logger.debug("Default fortune used");
		logger.debug("Default fortune used");
		logger.debug("Default fortune used");
		logger.debug("Default fortune used");
		logger.debug("Default fortune used");
		logger.debug("Default fortune used");
		logger.debug("Default fortune used");
		logger.debug("Default fortune used");
		logger.debug("Default fortune used");
		logger.debug("Default fortune used");
		logger.debug("Default fortune used");
		logger.debug("Default fortune used");
		return "The fortuneteller will be back soon.";
	}

}
