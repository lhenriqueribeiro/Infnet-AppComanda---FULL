package br.edu.infnet.comanda.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.comanda.model.negocio.Escola;
import br.edu.infnet.comanda.model.service.EscolaService;

@RestController
@RequestMapping("/api/escola")
public class EscolaController {

	@Autowired
	private EscolaService service;
	
	@RequestMapping
	public List<Escola> obterLista() {
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Escola> obterPorId(@PathVariable int id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Escola escola) {
		service.incluir(escola);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable int id) {
		service.excluir(id);
	}
}
