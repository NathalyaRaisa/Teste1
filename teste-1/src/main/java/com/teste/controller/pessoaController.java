package com.teste.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teste.entity.pessoa;
import com.teste.repository.pessoaRepository;
import com.teste.service.pessoaService;

@RestController
@RequestMapping("/pessoa")
public class pessoaController {

	@Autowired
	pessoaRepository PessoaRepository; 

	@Autowired
	pessoaService PessoaService;

	@PostMapping("/salvar") 
	public pessoa salvar(@RequestBody pessoa Pessoa) {
		return PessoaService.salvar(Pessoa);
	}

	@GetMapping("/id")
	public Optional<pessoa> id(@RequestParam Integer id) {
		return PessoaService.findById(id);
	}

	@GetMapping("/all")
	public List<pessoa> sadasdaDfsdf() {
		return PessoaService.pegarTodasAsPessoas();
	}

	@DeleteMapping("/delete")
	public void deletarPorId(@RequestParam Integer id) {
		
		PessoaService.deletarPorId(id); 

	}

	

}
