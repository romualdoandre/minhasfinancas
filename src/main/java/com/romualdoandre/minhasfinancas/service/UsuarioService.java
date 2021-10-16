package com.romualdoandre.minhasfinancas.service;

import java.util.Optional;

import com.romualdoandre.minhasfinancas.exception.RegraNegocioException;
import com.romualdoandre.minhasfinancas.model.entity.Usuario;

public interface UsuarioService {

	Usuario autenticar(String email, String senha);
	
	Usuario salvarUsuario(Usuario usuario);
	
	void validarEmail(String email) throws RegraNegocioException;
	
	Optional<Usuario> obterPorId(Long id);
	
}
