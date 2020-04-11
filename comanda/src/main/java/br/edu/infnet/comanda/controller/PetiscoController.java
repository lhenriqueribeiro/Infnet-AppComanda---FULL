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

import br.edu.infnet.comanda.model.negocio.Petisco;
import br.edu.infnet.comanda.model.service.PetiscoService;

@RestController
@RequestMapping("/api/petisco")
public class PetiscoController {

	@Autowired
	private PetiscoService service;
	
	@RequestMapping
	public List<Petisco> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Petisco> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Petisco petisco) {
		service.incluir(petisco);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public PetiscoService getService() {
		return service;
	}
	public void setService(PetiscoService service) {
		this.service = service;
	}
}