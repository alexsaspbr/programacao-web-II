package br.com.ada.programacaowebii.aula.controller.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClienteVO {

    @NotBlank(message = "O nome não pode ser em branco.")
    private String nome;
    @Pattern(regexp="\\d{11}", message = "ATENÇÃO: Deve ser informado 11 dígitos!")
    private String cpf;
    //TODO - @Pattern(regexp="", message = "")
    private LocalDate dataNascimento;
    
}
