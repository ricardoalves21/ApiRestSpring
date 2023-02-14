package com.algaworks.algalog.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;

import com.algaworks.algalog.domain.ValidationGroups;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
public class Cliente {
	
	@NotNull(groups = ValidationGroups.ClienteId.class)  //O groups serve para fazer validações de um campo
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@NotBlank
	@Size(max = 60)
	private String nome;
		
	@Column
	@NotBlank
	@Email
	@Size(max = 255)
	private String email;
	
	@Column(name = "fone")
	@NotBlank
	@Size(max = 20)
	private String telefone;

}
