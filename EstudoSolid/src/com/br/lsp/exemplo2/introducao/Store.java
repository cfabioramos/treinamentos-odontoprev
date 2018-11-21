package com.br.lsp.exemplo2.introducao;

import java.util.List;

public interface Store {
	
	Integer STORE_LIMIT = 5;
	
	void store(String message);
    
	List<String> retrieveMessages();
    
}
