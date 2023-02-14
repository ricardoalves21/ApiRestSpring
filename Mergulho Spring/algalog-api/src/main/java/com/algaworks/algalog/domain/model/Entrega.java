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
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.groups.ConvertGroup;
import javax.validation.groups.Default;

import com.algaworks.algalog.domain.ValidationGroups;
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
	
	@Valid  //Esta anotação valida o que está dentro do cliente também
	@ConvertGroup(from = Default.class, to = ValidationGroups.ClienteId.class)  //Muda a validação de Default.class para o nova validação criada ClienteId.class
	@NotNull
	@ManyToOne
	private Cliente cliente;
	
	@Valid
	@NotNull
	@Embedded
	private Destinatario destinatario;
		
	@NotNull
	private BigDecimal taxa;
	
	@JsonProperty(access = Access.READ_ONLY) //Esta anotação não permite que a requisição venha com esses campos preenchidos
	@Enumerated(EnumType.STRING)
	private StatusEntrega statusEntrega;
		
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDateTime dataPedido;
		
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDateTime finalizacao;
	

}
