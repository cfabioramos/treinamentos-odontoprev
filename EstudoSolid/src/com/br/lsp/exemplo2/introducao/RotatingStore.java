package com.br.lsp.exemplo2.introducao;

public class RotatingStore extends BasicStore {
	
	public void makeMoreRoomForStore() {
        this.stash.remove(this.stash.size() - 1);
    }
}
