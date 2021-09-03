package com.br.digitalinnovationone.SpringMVCRestJaxRS.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.br.digitalinnovationone.SpringMVCRestJaxRS.controller.request.SoldadoEditRequest;
import com.br.digitalinnovationone.SpringMVCRestJaxRS.dto.Soldado;
import com.br.digitalinnovationone.SpringMVCRestJaxRS.util.GeradorDeDados;

@Repository
public class SoldadoRepository {

	private List<Soldado> listaDeSoldados = new ArrayList<Soldado>();

	public List<Soldado> listarSoldados() {
		Soldado soldado;
		
		Integer tamanho = listaDeSoldados.size();
		
		if(tamanho==0) {
			for (int i = 0; i < 10; i++) {

				try {
					soldado = new Soldado(GeradorDeDados.geraCPF(), GeradorDeDados.gerarNome(), GeradorDeDados.gerarRaca(),
							GeradorDeDados.gerarArma());
					
					listaDeSoldados.add(soldado);

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			return listaDeSoldados;
		}else {
			return listaDeSoldados;
		}
		
	}

	public Soldado buscarSoldado(String cpf) {

		Soldado soldadoRetorno = listaDeSoldados.stream()
				.filter(soldado -> cpf != null && soldado.getCPF().equalsIgnoreCase(cpf.trim()))
				.collect(Collectors.toList()).get(0);

		return soldadoRetorno;

	}
	
	
	public void criarSoldado(Soldado soldado) {
		listarSoldados().add(soldado);
	}
	
	public void deletarSoldado(Soldado soldado) {
		listaDeSoldados.remove(soldado);
	}
	
	
	public void alterarSoldado(String cpf, SoldadoEditRequest soldadoEditRequest) {
		Soldado soldado = buscarSoldado(cpf);
		
		
		
		for(Soldado sol : listarSoldados()) {
			if(soldado!=null && soldado.equals(sol)) {
				sol.setNome(soldadoEditRequest.getNome());
				sol.setRaca(soldadoEditRequest.getRaca());
				sol.setArma(soldadoEditRequest.getArma());
				break;
				
			}
		}
		
	}

}
