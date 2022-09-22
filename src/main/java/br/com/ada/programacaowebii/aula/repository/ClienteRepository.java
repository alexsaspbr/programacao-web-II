package br.com.ada.programacaowebii.aula.repository;

import br.com.ada.programacaowebii.aula.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
