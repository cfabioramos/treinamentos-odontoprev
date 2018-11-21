package com.br.srp.passo2;

public enum Cargo {

	DESENVOLVEDOR(new DezOuVintePorCento()),
	TESTER(new QuinzeOuVinteECincoPorCento()),
	DBA(new QuinzeOuVinteECincoPorCento());
	
	private RegraDeCalculo regra;

	Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}
	
	public RegraDeCalculo getRegra() {
		return regra;
	}
	
}
