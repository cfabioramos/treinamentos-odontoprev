package com.br.lsp.introducao;

public class ContaComum {

	protected Double saldo;

    public ContaComum(Double saldo) {
    	if (saldo == null)
    		this.saldo = 0.0;
    	else
    		this.saldo = saldo;
    }

 // Positivo de 0 a 100
    public void deposita(double valor) {
        this.saldo += valor;
    }
    
    public void saca(double valor) {
        if (valor <= this.saldo)  {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Double getSaldo() {
        return saldo;
    }
    
    public void rende()      {
        this.saldo*= 1.1;
    }
    
}
