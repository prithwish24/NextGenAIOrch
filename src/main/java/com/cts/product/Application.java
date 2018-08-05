package com.cts.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages={"com.cts.product"})
public class Application extends WebMvcAutoConfiguration {
	public static final Logger LOG = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		LOG.info("Application initializing...");
		new SpringApplicationBuilder(Application.class)
			.bannerMode(Banner.Mode.CONSOLE)
			.logStartupInfo(true)
			.run(args);
	}

}
