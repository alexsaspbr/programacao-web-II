package br.com.ada.programacaowebii.aula.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Random;

@Service
public class RickAndMortyService {

    private Random r = new Random();
    private String baseUrl = "https://rickandmortyapi.com/api/character";

    public String getPersonagemPorNomeAlunoRestTemplate(String nome){

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<PersonagensDTO> retorno = restTemplate.getForEntity(
                baseUrl,
                PersonagensDTO.class);

        return retorno.getBody().getResults().get(r.nextInt(retorno.getBody().getResults().size())).getName();

    }

    public String getPersonagemPorNomeAlunoWebClient(String nome){

        WebClient client = WebClient.create();
        PersonagensDTO personagens =
                client.get()
                        .uri(baseUrl)
                        .retrieve()
                        .bodyToMono(PersonagensDTO.class)
                        .block();

        return personagens.getResults().get(r.nextInt(personagens.getResults().size())).getName();

    }


}
