package com.br.lsp.introducao;

public class ContaDeEstudante extends ContaComum {
	
	private int milhas;

	public ContaDeEstudante(Double saldo) {
		super(saldo);
	}
	
	public void deposita(double valor)  {
        super.deposita(valor);
        this.milhas += (int)valor;
    }

	public void rende() {
        throw new ContaNaoRendeException();
    }
	
	public int getMilhas()  {
        return milhas;
    }

}
