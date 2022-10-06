package br.com.ada.programacaowebii.aula;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Conta Bancária API"))
@SecurityScheme(
		name = "conta-bancaria-api",
		scheme = "basic",
		type = SecuritySchemeType.HTTP,
		in = SecuritySchemeIn.HEADER
)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
