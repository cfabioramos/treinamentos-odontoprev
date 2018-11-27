package com.br.lsp.passo1;

public class ContaComum implements IContaQueRende {

	private ManipuladorDeSaldo manipulador;

	public ContaComum()  {
        this.manipulador = new ManipuladorDeSaldo();
	}
	
	public void rende(double taxa)  { 
        this.manipulador.rende(taxa);
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
