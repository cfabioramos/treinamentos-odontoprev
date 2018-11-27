package com.br.lsp.introducao;

public class ContaDeEstudante extends ContaComum {
	
	private int milhas;

	public ContaDeEstudante(Double saldo) {
		super(saldo);
	}
	
	// aceito apenas de 20 a 30
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
