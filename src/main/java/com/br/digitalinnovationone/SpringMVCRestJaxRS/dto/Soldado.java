package com.br.digitalinnovationone.SpringMVCRestJaxRS.dto;

import java.io.Serializable;

import org.springframework.lang.NonNull;

public class Soldado implements Serializable, Comparable<Soldado> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NonNull
	private String CPF;
	private String nome;
	private String raca;
	private String arma;

	public Soldado() {
		// TODO Auto-generated constructor stub
	}

	public Soldado(String cpf, String nome, String raca, String arma) {
		this.CPF = cpf;
		this.nome = nome;
		this.raca = raca;
		this.arma = arma;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

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

	@Override
	public int compareTo(Soldado outroSoldado) {

		String cpfSoldadoAtualSemPontuacao = this.CPF.replaceAll(".", "").replaceAll("-", "");
		String cpfOutroSoldadoAtualSemPontuacao = outroSoldado.CPF.replaceAll(".", "").replaceAll("-", "");

		Integer cpfSoldadoAtual = Integer.valueOf(cpfSoldadoAtualSemPontuacao);
		Integer cpfOutroSoldado = Integer.valueOf(cpfOutroSoldadoAtualSemPontuacao);

		if (cpfSoldadoAtual > cpfOutroSoldado) {
			return 1;
		} else if (cpfSoldadoAtual < cpfOutroSoldado) {
			return -1;
		} else {
			return 0;
		}

	}

}
