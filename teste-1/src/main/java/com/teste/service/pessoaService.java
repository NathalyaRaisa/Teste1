package com.teste.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.entity.pessoa;
import com.teste.repository.pessoaRepository;

@Service
public class pessoaService {

	@Autowired
	pessoaRepository PessoaRepository;

	public pessoa salvar(pessoa Pessoa) {
		return PessoaRepository.save(Pessoa);
	}

	public Optional<pessoa> findById(Integer id) {
		return PessoaRepository.findById(id);
	}

	public List<pessoa> pegarTodasAsPessoas() {
		return PessoaRepository.findAll();
	}

	public void deletarPorId(Integer id) {
		
		 PessoaRepository.deleteById( id);
	}
	
	

}

