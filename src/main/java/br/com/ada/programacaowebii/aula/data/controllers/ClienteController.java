package br.com.ada.programacaowebii.aula.data.controllers;

import br.com.ada.programacaowebii.aula.domain.usecases.CriaCliente;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    private CriaCliente criaCliente;

    public ClienteController(CriaCliente criaCliente) {
        this.criaCliente = criaCliente;
    }

}
