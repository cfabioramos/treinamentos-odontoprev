package com.br.srp.passo2;

public class Funcionario {

	private Cargo cargo;
	private Double salarioBase;
	
	public Cargo getCargo() {
		return cargo;
	}
	
	public Double getSalarioBase() {
		return salarioBase;
	}
	
	public double calculaSalario(){
		return this.cargo.getRegra().calcula(this);
	}
	
}
