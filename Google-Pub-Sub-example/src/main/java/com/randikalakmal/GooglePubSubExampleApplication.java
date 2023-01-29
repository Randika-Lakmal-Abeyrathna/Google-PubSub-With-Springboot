package com.randikalakmal;

import com.randikalakmal.config.PubSubConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(PubSubConfiguration.class)
public class GooglePubSubExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GooglePubSubExampleApplication.class, args);
	}

}
