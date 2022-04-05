package com.example.demo.service;

import com.example.demo.repository.modelo.Cliente;

public interface IClienteService {
	
	Cliente getCliente(String cedula);
	String insertarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	void borrarCliente(String cedula);
	Cliente getClientePorUsername(String username);

}
