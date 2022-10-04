package br.com.ada.programacaowebii.aula.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClienteDTO {

    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

}