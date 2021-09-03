package com.br.digitalinnovationone.SpringMVCRestJaxRS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.digitalinnovationone.SpringMVCRestJaxRS.controller.request.SoldadoEditRequest;
import com.br.digitalinnovationone.SpringMVCRestJaxRS.dto.Soldado;
import com.br.digitalinnovationone.SpringMVCRestJaxRS.service.SoldadoService;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {

	@Autowired
	private SoldadoService service;

	@GetMapping("/{cpf}")
	public ResponseEntity<Soldado> buscarSoldado(@PathVariable() String cpf) {
		Soldado soldado = service.buscarSoldado(cpf);
		return ResponseEntity.status(HttpStatus.OK).body(soldado);
	}

	@GetMapping
	public ResponseEntity<List<Soldado>> listarSoldados() {

		List<Soldado> soldados = service.listarSoldados();

		return ResponseEntity.status(HttpStatus.OK).body(soldados);
	}

	@PostMapping
	public ResponseEntity<Soldado> criarSoldado(@RequestBody Soldado soldado) {
		service.criarSoldado(soldado);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@PutMapping("/{cpf}")
	public ResponseEntity<Soldado> editarSoldado(@PathVariable() String cpf,
			@RequestBody SoldadoEditRequest soldadoEditRequest) {

		service.alterarSoldado(cpf, soldadoEditRequest);

		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/{cpf}")
	public ResponseEntity<Soldado> deletarSoldado(@PathVariable() String cpf) {

		service.deletarSoldado(cpf);

		return ResponseEntity.ok().build();
	}

}
