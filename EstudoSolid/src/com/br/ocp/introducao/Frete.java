package com.br.ocp.introducao;

public class Frete {

	public double para(String cidade) {
		if ("São Paulo".equals(cidade)) {
			return 35.00;
		}
		
		return 40.00;
	}
	
}
