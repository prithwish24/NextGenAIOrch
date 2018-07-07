package com.cts.product.rental;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {
	public static final Logger LOG = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		LOG.info("Application initializing...");
		new SpringApplicationBuilder(Application.class)
			.bannerMode(Banner.Mode.CONSOLE)
			.logStartupInfo(true)
			.run(args);
	}

}
