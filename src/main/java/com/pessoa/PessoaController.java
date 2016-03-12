package com.pessoa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaRepository repo;

	@RequestMapping(method=RequestMethod.GET)
	public List<Pessoa> getNome(){
		return repo.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Long setPessoa(@RequestBody Pessoa pessoa){
		repo.save(pessoa);
		return pessoa.getId();
	}
	
	
}
