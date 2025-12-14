package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootDeployExternalApacheWarApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDeployExternalApacheWarApplication.class, args);
		System.out.println("Running on port 8080 ...");
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootDeployExternalApacheWarApplication.class); // main class
    }

	/*
	 * Steps: 
	 * 1. Add 'war' packaging, spring-boot-starter-tomcat - scope, <finalName> in pom.xml
	 * 2. Extend SpringBootServletInitializer & override SpringApplicationBuilder in main class
	 * 3. Generate build/war file: Run as -> maven build -> clean package -> Apply
	 * 4. Download compilable Apache version.
	 * 5. Paste war file in apache/webapp/
	 * 6. Run: startup.bat in cmd
	 */

}
