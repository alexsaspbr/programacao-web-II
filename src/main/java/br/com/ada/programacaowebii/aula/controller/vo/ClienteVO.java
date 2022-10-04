package br.com.ada.programacaowebii.aula.controller.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

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
