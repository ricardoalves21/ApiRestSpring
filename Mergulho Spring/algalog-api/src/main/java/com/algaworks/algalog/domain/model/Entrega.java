package com.algaworks.algalog.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Entrega {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Cliente cliente;
	
	@Embedded
	private Destinatario destinatario;
		
	private BigDecimal taxa;
	
	@JsonProperty(access = Access.READ_ONLY) //Esta anotação não permite que a requisição venha com esses campos preenchidos
	@Enumerated(EnumType.STRING)
	private StatusEntrega statusEntrega;
		
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDateTime dataPedido;
		
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDateTime finalizacao;
	

}
