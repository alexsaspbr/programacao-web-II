package br.com.ada.programacaowebii.aula.controller;

import br.com.ada.programacaowebii.aula.service.RickAndMortyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AlunoController {

    @Autowired
    RickAndMortyService service;

    @PostMapping("/aluno")
    public ResponseEntity<String> retornaPersonagem(@RequestBody String nome){

        String personagem = service.getPersonagemPorNomeAlunoWebClient(nome);
        return ResponseEntity.ok(personagem);

    }

}
