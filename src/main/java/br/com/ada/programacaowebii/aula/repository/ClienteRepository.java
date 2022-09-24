package br.com.ada.programacaowebii.aula.repository;

import br.com.ada.programacaowebii.aula.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public List<Cliente> findByNomeContaining(String nome);

}
