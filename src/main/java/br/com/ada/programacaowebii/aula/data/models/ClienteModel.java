package br.com.ada.programacaowebii.aula.data.models;

import br.com.ada.programacaowebii.aula.domain.entities.Cliente;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private Integer idade;

    public ClienteModel(){}

    public ClienteModel toClienteModel(Cliente cliente) {
        ClienteModel clienteModel = new ClienteModel();
        clienteModel.setId(cliente.getId());
        clienteModel.setNome(cliente.getNome());
        clienteModel.setIdade(cliente.getIdade());
        return clienteModel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

}
