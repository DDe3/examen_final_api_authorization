package com.example.demo.repository;

import com.example.demo.repository.modelo.Cliente;

public interface IClienteRepository {
	
	Cliente getCliente(String cedula);
	void insertarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	void borrarCliente(String cedula);
	
	Cliente getClientePorUsername(String username);
	

}
