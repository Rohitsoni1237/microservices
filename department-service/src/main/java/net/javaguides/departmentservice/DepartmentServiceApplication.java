package net.javaguides.departmentservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//http://localhost:8080/swagger-ui/index.html
@OpenAPIDefinition(
		info = @Info(
				title = "Department Service Rest APIs",
				description = "Department Service Rest APIs document",
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
				description = "Department-Service doc",
				url = "https://github.com/Rohitsoni1237"
		)
)
@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
