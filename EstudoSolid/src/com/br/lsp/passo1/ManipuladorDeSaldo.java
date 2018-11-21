package com.br.lsp.passo1;

public class ManipuladorDeSaldo {
	
	private double saldo;
	
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
    
    //Taxa variável de acordo com o tipo de conta
    public void rende(double taxa)  { 
        this.saldo *= taxa;
    }

    public double getSaldo()  {
        return saldo;
    }
    
}
