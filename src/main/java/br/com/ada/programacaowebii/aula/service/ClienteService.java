package br.com.ada.programacaowebii.aula.service;

import br.com.ada.programacaowebii.aula.model.Cliente;
import br.com.ada.programacaowebii.aula.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente criarCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }


}
