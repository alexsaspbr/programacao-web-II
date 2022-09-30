package br.com.ada.programacaowebii.aula.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, unique = true, length = 11)
    private String cpf;

    @Column(nullable = false, name = "data_nascimento", columnDefinition = "DATE")
    private LocalDate dataNascimento;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "cliente_tem_contas",
                joinColumns = @JoinColumn(name = "cliente_id"),
                inverseJoinColumns = @JoinColumn(name = "conta_id")
    )
    private List<Conta> contas;

}
