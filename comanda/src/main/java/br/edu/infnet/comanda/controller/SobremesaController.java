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

import br.edu.infnet.comanda.model.negocio.Sobremesa;
import br.edu.infnet.comanda.model.service.SobremesaService;

@RestController
@RequestMapping("/api/sobremesa")
public class SobremesaController {

	@Autowired
	private SobremesaService service;
	
	@RequestMapping
	public List<Sobremesa> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Sobremesa> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Sobremesa sobremesa) {
		service.incluir(sobremesa);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public SobremesaService getService() {
		return service;
	}
	public void setService(SobremesaService service) {
		this.service = service;
	}
}