package br.com.ada.programacaowebii.aula.repository;

import br.com.ada.programacaowebii.aula.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public List<Cliente> findByNomeContaining(String nome);

    public List<Cliente> findByNomeContainingOrDataNascimentoOrderByNomeAsc(String nome, LocalDate dataNascimento);

    public List<Cliente> findByDataNascimentoBetween(LocalDate dataInicial, LocalDate dataFinal);


}
