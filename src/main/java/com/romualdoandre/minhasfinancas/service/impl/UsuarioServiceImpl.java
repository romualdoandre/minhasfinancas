package com.romualdoandre.minhasfinancas.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.romualdoandre.minhasfinancas.exception.ErroAutenticacao;
import com.romualdoandre.minhasfinancas.exception.RegraNegocioException;
import com.romualdoandre.minhasfinancas.model.entity.Usuario;
import com.romualdoandre.minhasfinancas.model.repository.UsuarioRepository;
import com.romualdoandre.minhasfinancas.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	private UsuarioRepository repository;
	
	
	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository=repository;
		
	}

	@Override
	public Usuario autenticar(String email, String senha) {
Optional<Usuario> usuario = repository.findByEmail(email);
		
		if(!usuario.isPresent()) {
			throw new ErroAutenticacao("Usuário não encontrado para o email informado.");
		}
		
		boolean senhasBatem = senha.equals(usuario.get().getSenha());
		
		if(!senhasBatem) {
			throw new ErroAutenticacao("Senha inválida.");
		}

		return usuario.get();
	}

	@Override
	@Transactional
	public Usuario salvarUsuario(Usuario usuario) {
		validarEmail(usuario.getEmail());
		criptografarSenha(usuario);
		return repository.save(usuario);
	}
	
	private void criptografarSenha(Usuario usuario) {
		String senha = usuario.getSenha();
		//String senhaCripto = encoder.encode(senha);
		usuario.setSenha(senha);
	}

	@Override
	public void validarEmail(String email) throws RegraNegocioException {
		boolean existe= repository.existsByEmail(email);
		if(existe)
			throw new RegraNegocioException("Já existe usuário com este e-mail");
	}

	@Override
	public Optional<Usuario> obterPorId(Long id) {
		return repository.findById(id);
	}

}
