package br.com.ada.programacaowebii.aula.service;

import lombok.Data;

@Data
public class InfoDTO {

    private Long cont;
    private Long pages;
    private String next;
    private String prev;

}
