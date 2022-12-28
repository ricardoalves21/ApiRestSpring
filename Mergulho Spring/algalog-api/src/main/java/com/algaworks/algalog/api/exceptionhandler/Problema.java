package com.algaworks.algalog.api.exceptionhandler;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Problema {
	
	private Integer status;
	private LocalDateTime dataHora;
	private String titulo;	

}
