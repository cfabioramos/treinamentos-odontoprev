package com.br.srp.passo1;

import com.br.srp.introducao.Funcionario;

public class CalculadoraDeSalario {

	private String DESENVOLVEDOR;
	private String DBA;
	private String TESTER;
	
	public double calcula(Funcionario funcionario) {
        if(DESENVOLVEDOR.equals(funcionario.getCargo())) {
            return new DezOuVintePorCento().calcula(funcionario);
        }

        if(DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())) {
            return new QuinzeOuVinteECincoPorCento().calcula(funcionario);
        }

        throw new RuntimeException("funcionario invalido");
    }
}
