package br.com.ada.programacaowebii.aula.controller.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClienteVO {

    @NotBlank(message = "O nome não pode ser em branco.")
    private String nome;
    @Pattern(regexp="\\d{11}", message = "ATENÇÃO: Deve ser informado 11 dígitos!")
    private String cpf;
    @PastOrPresent(message = "Data de nascimento inválida!")
    private LocalDate dataNascimento;
}
