package br.com.ada.programacaowebii.aula.domain.usecases;

import br.com.ada.programacaowebii.aula.domain.entities.Cliente;
import br.com.ada.programacaowebii.aula.domain.repositories.ClienteRepository;

public class CriaCliente {

    private final ClienteRepository clienteRepository;

    public CriaCliente(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void executa(Cliente cliente) {
        this.clienteRepository.criarCliente(cliente);
    }


}
