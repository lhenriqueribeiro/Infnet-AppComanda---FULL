package br.edu.infnet.comanda.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.comanda.model.negocio.Escola;
import br.edu.infnet.comanda.model.repository.IEscolaRepository;
@Service
public class EscolaService {
	
	@Autowired
	private IEscolaRepository repository;
	
	public List<Escola> obterLista() {
		return (List<Escola>)repository.findAll();
	}
	
	public Optional<Escola> obterPorId(@PathVariable int id) {
		return repository.findById(id);
	}
	
	public void incluir(@RequestBody Escola escola) {
		repository.save(escola);
	}
	
	public void excluir(@PathVariable int id) {
		repository.deleteById(id);
	}
}
