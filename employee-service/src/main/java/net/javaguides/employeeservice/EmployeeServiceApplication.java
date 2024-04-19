package net.javaguides.employeeservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

//http://localhost:8080/swagger-ui/index.html
@OpenAPIDefinition(
		info = @Info(
				title = "Employee Service Rest APIs",
				description = "Employee Service Rest APIs document",
				version = "1.0",
				contact = @Contact(
						name = "Rohit Soni",
						email = "rs003747@gmail.com",
						url = "https://github.com/Rohitsoni1237"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://github.com/Rohitsoni1237"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Employee-Service doc",
				url = "https://github.com/Rohitsoni1237"
		)
)
@SpringBootApplication
@EnableFeignClients
@ImportAutoConfiguration({FeignAutoConfiguration.class})
public class EmployeeServiceApplication {

	@Bean
	public WebClient webClient(){
		return WebClient.builder().build();
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
