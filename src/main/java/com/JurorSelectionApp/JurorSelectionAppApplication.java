package com.JurorSelectionApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JurorSelectionAppApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(JurorSelectionAppApplication.class, args);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(JurorSelectionAppApplication.class);
	}

}
