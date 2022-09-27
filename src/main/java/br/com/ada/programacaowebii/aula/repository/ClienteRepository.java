package br.com.ada.programacaowebii.aula.repository;

import br.com.ada.programacaowebii.aula.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public List<Cliente> findByNomeContaining(String nome);

    public List<Cliente> findByNomeContainingOrDataNascimentoOrderByNomeAsc(String nome, LocalDate dataNascimento);

    public List<Cliente> findByDataNascimentoBetween(LocalDate dataInicial, LocalDate dataFinal);

    public Optional<Cliente> findByCpf(String cpf);

    public void deleteByCpf(String cpf);

    //neste caso o Cliente é a Entidade e nao o nome da tabela no banco de dados
    @Query("SELECT c FROM Cliente c WHERE c.cpf = ?1")
    public Optional<Cliente> buscarClientePorCpfParametroIndexado(String cpf);

    @Query("SELECT c FROM Cliente c WHERE c.cpf = :cpf")
    public Optional<Cliente> buscarClientePorCpfParametroNominal(@Param("cpf") String cpf);

}
