package com.romualdoandre.minhasfinancas.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.romualdoandre.minhasfinancas.model.entity.Lancamento;
import com.romualdoandre.minhasfinancas.model.enums.StatusLancamento;
import com.romualdoandre.minhasfinancas.model.repository.LancamentoRepository;
import com.romualdoandre.minhasfinancas.service.LancamentoService;

@Service
public class LancamentoServiceImpl implements LancamentoService{
	
	private LancamentoRepository repository;

	public LancamentoServiceImpl(LancamentoRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Lancamento salvar(Lancamento lancamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lancamento atualizar(Lancamento lancamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(Lancamento lancamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Lancamento> buscar(Lancamento lancamentoFiltro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizarStatus(Lancamento lancamento, StatusLancamento status) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validar(Lancamento lancamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Lancamento> obterPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal obterSaldoPorUsuario(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
