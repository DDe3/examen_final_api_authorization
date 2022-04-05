package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Cliente;


@Transactional
@Repository
public class ClienteRepoImpl implements IClienteRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Cliente getCliente(String cedula) {
		TypedQuery<Cliente> mq = em.createQuery("SELECT c FROM Cliente c WHERE c.cedula=:cedula",Cliente.class);
		mq.setParameter("cedula", cedula);
		return mq.getSingleResult();
		
	}

	@Override
	public void insertarCliente(Cliente cliente) {
		em.persist(cliente);
	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		em.merge(cliente);
	}

	@Override
	public void borrarCliente(String cedula) {
		Cliente c = getCliente(cedula);
		em.remove(c);
	}

	@Override
	public Cliente getClientePorUsername(String username) {
		TypedQuery<Cliente> mq = em.createQuery("SELECT c FROM Cliente c WHERE c.username=:username", Cliente.class);
		mq.setParameter("username", username);
		return mq.getSingleResult();
	}
	
	
	
	

}
