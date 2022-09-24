package br.com.ada.programacaowebii.aula.service;

import br.com.ada.programacaowebii.aula.controller.vo.ClienteVO;
import br.com.ada.programacaowebii.aula.model.Cliente;
import br.com.ada.programacaowebii.aula.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente criarCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    public Optional<Cliente> buscarClientePorId(Long id) {
        return this.clienteRepository.findById(id);
    }

    public Cliente atualizarClientePorId(Long id, ClienteVO dadosAtualizadosCliente) {
        Optional<Cliente> optionalCliente = this.clienteRepository.findById(id);
        if (optionalCliente.isPresent()) {
            Cliente cliente = optionalCliente.get();
            Cliente clienteAtualizado = new Cliente();
            clienteAtualizado.setId(cliente.getId());
            clienteAtualizado.setNome(dadosAtualizadosCliente.getNome());
            clienteAtualizado.setCpf(dadosAtualizadosCliente.getCpf());
            clienteAtualizado.setDataNascimento(dadosAtualizadosCliente.getDataNascimento());
            return this.clienteRepository.save(clienteAtualizado);
        }
        return null;
    }

    public void removerClientePorId(Long id){
        this.clienteRepository.deleteById(id);
    }

    public List<Cliente> listarTodosClientes() {
        return this.clienteRepository.findAll();
    }

    public List<Cliente> listarClientesPorNome(String nome) {
        return this.clienteRepository.findByNomeContaining(nome);
    }

}
