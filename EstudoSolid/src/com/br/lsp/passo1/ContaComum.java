package com.br.lsp.passo1;

public class ContaComum {

	private ManipuladorDeSaldo manipulador;

	public ContaComum()  {
        this.manipulador = new ManipuladorDeSaldo();
	}
	
	public void rende()  { 
        this.manipulador.rende(1.1);
    }
	
	public void saca(double valor, boolean isCaixaEletronico)  {
		if (isCaixaEletronico)
			manipulador.saca(valor - 0.25);	
		else
			manipulador.saca(valor);
    }
	
	public double getSaldo()  {
        return manipulador.getSaldo();
    }
	
	public void deposita(double valor)  {
        manipulador.deposita(valor);
    }

}
