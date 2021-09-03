package com.br.digitalinnovationone.SpringMVCRestJaxRS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.digitalinnovationone.SpringMVCRestJaxRS.controller.request.SoldadoEditRequest;
import com.br.digitalinnovationone.SpringMVCRestJaxRS.dto.Soldado;
import com.br.digitalinnovationone.SpringMVCRestJaxRS.repository.SoldadoRepository;

@Service
public class SoldadoService {

	@Autowired
	private SoldadoRepository repository;

	public Soldado buscarSoldado(String cpf) {

		return repository.buscarSoldado(cpf);

	}

	public List<Soldado> listarSoldados() {
		return repository.listarSoldados();
	}

	public void criarSoldado(Soldado soldado) {
		repository.criarSoldado(soldado);
	}

	public void alterarSoldado(String cpf, SoldadoEditRequest soldadoEditRequest) {

		repository.alterarSoldado(cpf, soldadoEditRequest);
	}

	public void deletarSoldado(String cpf) {
		repository.deletarSoldado(null);

	}

}
