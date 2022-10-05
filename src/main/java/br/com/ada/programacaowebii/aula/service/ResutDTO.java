package br.com.ada.programacaowebii.aula.service;

import lombok.Data;

import java.util.List;

@Data
public class ResutDTO {

    private Long id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private OriginDTO origin;
//    private LocationDTO location;
    private String image;
    private List<String> apisode;

}
