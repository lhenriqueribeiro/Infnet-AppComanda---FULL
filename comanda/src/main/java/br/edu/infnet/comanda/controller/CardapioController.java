package br.edu.infnet.comanda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.infnet.comanda.model.negocio.Cardapio;
import br.edu.infnet.comanda.model.service.CardapioService;

@Controller
public class CardapioController {

	@Autowired
	private CardapioService service;
	
	@RequestMapping(value = "/produtos", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		model.addAttribute("produtos", service.obterLista());
		
		return "produto/lista";
	}
	
	@RequestMapping(value = "/produto", method = RequestMethod.GET)
	public String showDetalhe() {
		return "produto/detalhe";
	}
	
	@RequestMapping(value = "/produto", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Cardapio cardapio
			) {
		
		service.incluir(cardapio);
		
		return this.showLista(model);
	}
	
	@RequestMapping(value = "/produto/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public CardapioService getService() {
		return service;
	}
	public void setService(CardapioService service) {
		this.service = service;
	}
}