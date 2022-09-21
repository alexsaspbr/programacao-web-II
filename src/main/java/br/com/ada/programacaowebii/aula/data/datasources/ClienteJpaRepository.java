package br.com.ada.programacaowebii.aula.data.datasources;

import br.com.ada.programacaowebii.aula.data.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteJpaRepository extends JpaRepository<ClienteModel, Long> {
}
