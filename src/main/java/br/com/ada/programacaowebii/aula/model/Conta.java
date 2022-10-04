package br.com.ada.programacaowebii.aula.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private Long numero;

    @Column(nullable = false, name = "data_criacao", columnDefinition = "TIMESTAMP")
    private LocalDateTime dataCriacao;

    @Column(precision = 16, scale = 2)
    private BigDecimal saldo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

}
