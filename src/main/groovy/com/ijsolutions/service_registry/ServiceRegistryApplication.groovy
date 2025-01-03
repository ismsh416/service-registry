package com.ijsolutions.service_registry

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class ServiceRegistryApplication {

	static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication, args)
	}

}
