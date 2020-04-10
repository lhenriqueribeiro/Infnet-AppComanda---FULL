package br.edu.infnet.comanda.testes;

import br.edu.infnet.comanda.controller.EscolaController;

public class EscolaTeste {
	
	public static void main(String[] args) {
		
		EscolaController controle = new EscolaController();
		
		System.out.println(controle.obterLista());
	}

}
