package br.com.ada.programacaowebii.aula.data.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World!";
    }


}
