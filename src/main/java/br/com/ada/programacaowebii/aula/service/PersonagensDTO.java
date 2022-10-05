package br.com.ada.programacaowebii.aula.service;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PersonagensDTO {

    private InfoDTO info;
    private List<ResutDTO> results;

}
