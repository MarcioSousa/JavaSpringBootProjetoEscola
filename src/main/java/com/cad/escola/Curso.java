package com.cad.escola;

public class Curso {
	private String Sigla;
	private String Nome;
	private int CargaHoraria;
	private double Valor;
	private String DataVigencia;
	private double ValorHoraInstrutor;
	private String Programa;
	
	public Curso(String sigla, String nome) {
		super();
		Sigla = sigla;
		Nome = nome;
	}
	
	public String getSigla() {
		return Sigla;
	}


	public void setSigla(String sigla) {
		Sigla = sigla;
	}
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getCargaHoraria() {
		return CargaHoraria;
	}

	public double getValor() {
		return Valor;
	}

	public String getDataVigencia() {
		return DataVigencia;
	}

	public double getValorHoraInstrutor() {
		return ValorHoraInstrutor;
	}

	public String getPrograma() {
		return Programa;
	}

	public void setCargaHoraria(int cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}
	
	public void setValor(double valor) {
		Valor = valor;
	}

	public void setDataVigencia(String dataVigencia) {
		DataVigencia = dataVigencia;
	}
	
	public void setValorHoraInstrutor(double valorHoraInstrutor) {
		ValorHoraInstrutor = valorHoraInstrutor;
	}
	
	public void setPrograma(String programa) {
		Programa = programa;
	}
	
}
