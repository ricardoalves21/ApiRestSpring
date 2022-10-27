package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		Cliente cliente1 = new Cliente(1L, "João", "joaodascouves@algaworks.com", "34 99999-1111");
		Cliente cliente2 = new Cliente(2L, "Maria", "mariadasilva@algaworks.com", "34 88888-2222");
				
		return Arrays.asList(cliente1, cliente2);
	}

}
