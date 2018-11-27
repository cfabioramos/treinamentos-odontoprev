package com.br.lsp.passo1;

public class ContaDeEstudante implements IContaQueRende{
	
	private ManipuladorDeSaldo m;
	private int milhas;
	
	public ContaDeEstudante()  { 
        m = new ManipuladorDeSaldo();
    }

	public void deposita(double valor)  {
        m.deposita(valor);
        this.milhas += (int)valor;
    }
	
	public double getSaldo()  {
        return m.getSaldo();
    }
	
	public int getMilhas()  {
        return milhas;
    }

	@Override
	public void rende(double taxa) {
	}
	
}
