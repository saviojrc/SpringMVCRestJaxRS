package com.br.digitalinnovationone.SpringMVCRestJaxRS.controller.request;

import java.io.Serializable;

public class SoldadoEditRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String raca;
	private String arma;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getArma() {
		return arma;
	}
	public void setArma(String arma) {
		this.arma = arma;
	}
	
	
	
	
	

}
