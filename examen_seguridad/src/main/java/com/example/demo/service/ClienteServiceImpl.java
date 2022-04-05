package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IClienteRepository;
import com.example.demo.repository.modelo.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private IClienteRepository clienteRepository;

	@Override
	public Cliente getCliente(String cedula) {
		return clienteRepository.getCliente(cedula);
	}

	@Override
	public String insertarCliente(Cliente cliente) {
		clienteRepository.insertarCliente(cliente);
		return "Registro exitoso";

	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		clienteRepository.actualizarCliente(cliente);
	}

	@Override
	public void borrarCliente(String cedula) {
		clienteRepository.borrarCliente(cedula);
	}

	@Override
	public Cliente getClientePorUsername(String username) {
		return clienteRepository.getClientePorUsername(username);
	}


}
