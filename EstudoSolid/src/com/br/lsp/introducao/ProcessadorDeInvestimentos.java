package com.br.lsp.introducao;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorDeInvestimentos {

	public static void main(String[] args) {

        for (ContaComum conta : contasDoBanco()) {
            conta.rende();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }

	private static List<ContaComum> contasDoBanco() {
		List<ContaComum> contas = new ArrayList<>();
		contas.add(new ContaDeEstudante(120.00));
		contas.add(new ContaComum(100.00));
		contas.add(new ContaComum(120.00));
		contas.add(new ContaComum(200.00));
		return contas;
	}
	
}
