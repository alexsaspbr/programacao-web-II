package br.com.ada.programacaowebii.aula.data.datasources;

import br.com.ada.programacaowebii.aula.data.models.ClienteModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteDataSourcesLocalImpl implements ClienteDataSourcesLocal {

    private ClienteJpaRepository clienteJpaRepository;

    public ClienteDataSourcesLocalImpl(ClienteJpaRepository clienteJpaRepository) {
        this.clienteJpaRepository = clienteJpaRepository;
    }

    @Override
    public void criarCliente(ClienteModel cliente) {
        this.clienteJpaRepository.save(cliente);
    }

}
