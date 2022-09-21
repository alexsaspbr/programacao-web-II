package br.com.ada.programacaowebii.aula.data.repositories;

import br.com.ada.programacaowebii.aula.data.datasources.ClienteDataSourcesLocal;
import br.com.ada.programacaowebii.aula.data.models.ClienteModel;
import br.com.ada.programacaowebii.aula.domain.entities.Cliente;
import br.com.ada.programacaowebii.aula.domain.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteRepositoryImpl implements ClienteRepository {

    private ClienteDataSourcesLocal clienteDataSourcesLocal;

    public ClienteRepositoryImpl(ClienteDataSourcesLocal clienteDataSourcesLocal) {
        this.clienteDataSourcesLocal = clienteDataSourcesLocal;
    }

    @Override
    public void criarCliente(Cliente cliente) {
        ClienteModel clienteModel = new ClienteModel();
        this.clienteDataSourcesLocal.criarCliente(clienteModel.toClienteModel(cliente));
    }

}
