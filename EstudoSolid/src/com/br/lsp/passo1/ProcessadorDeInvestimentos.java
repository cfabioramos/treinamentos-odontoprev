package com.br.lsp.passo1;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorDeInvestimentos {

	public static void main(String[] args) {

        for (IContaQueRende conta : contasDoBanco()) {
            conta.rende(1.1);

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }

	private static List<IContaQueRende> contasDoBanco() {
		List<IContaQueRende> contas = new ArrayList<>();
		contas.add(new ContaComum());
		contas.add(new ContaDeEstudante());
		contas.add(new ContaComum());
		contas.add(new ContaComum());
		return contas;
	}
	
}
