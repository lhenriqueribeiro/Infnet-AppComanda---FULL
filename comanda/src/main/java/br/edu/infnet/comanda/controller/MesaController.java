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

import br.edu.infnet.comanda.model.negocio.Mesa;
import br.edu.infnet.comanda.model.service.MesaService;

@RestController
@RequestMapping("/api/mesa")
public class MesaController {

	@Autowired
	private MesaService service;
	
	@RequestMapping
	public List<Mesa> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Mesa> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Mesa mesa) {
		service.incluir(mesa);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public MesaService getService() {
		return service;
	}
	public void setService(MesaService service) {
		this.service = service;
	}
}