package com.romualdoandre.minhasfinancas.service.impl;

import java.util.Optional;

import com.romualdoandre.minhasfinancas.exception.RegraNegocioException;
import com.romualdoandre.minhasfinancas.model.entity.Usuario;
import com.romualdoandre.minhasfinancas.model.repository.UsuarioRepository;
import com.romualdoandre.minhasfinancas.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService{
	
	private UsuarioRepository repository;
	
	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository=repository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) throws RegraNegocioException {
		boolean existe= repository.existsByEmail(email);
		if(existe)
			throw new RegraNegocioException("Já existe usuário com este e-mail");
	}

	@Override
	public Optional<Usuario> obterPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
