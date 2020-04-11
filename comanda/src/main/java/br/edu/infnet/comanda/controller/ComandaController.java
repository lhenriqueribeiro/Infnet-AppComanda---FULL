package br.edu.infnet.comanda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.infnet.comanda.model.negocio.Cardapio;
import br.edu.infnet.comanda.model.service.CardapioService;
import br.edu.infnet.comanda.model.service.ComandaService;

@Controller
public class ComandaController {

	@Autowired
	private ComandaService service;
	
	@Autowired
	private CardapioService cardapioService;
	
	@RequestMapping(value = "/emprestimos", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		model.addAttribute("emprestimos", service.obterLista());
		
		return "emprestimo/lista";
	}
	
	@RequestMapping(value = "/emprestimo", method = RequestMethod.GET)
	public String showDetalhe(
				Model model
			) {
		model.addAttribute("produtos", cardapioService.obterLista());
		
		return "emprestimo/detalhe";
	}
	
	@RequestMapping(value = "/emprestimo", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Cardapio cardapio
			) {
		
//		service.incluir(cardapio);
		
		return this.showLista(model);
	}
	
	@RequestMapping(value = "/emprestimo/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public ComandaService getService() {
		return service;
	}
	public void setService(ComandaService service) {
		this.service = service;
	}
}