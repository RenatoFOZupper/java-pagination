package com.example.demo.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

	@Autowired
	AlunoRepository alunoRepository;
	
	@GetMapping
	public Page<AlunoDto> findAll(Pageable pageable) {
		Page<Aluno> paginacao = alunoRepository.findAll(pageable);
		return AlunoDto.converter(paginacao);
	}
	
}
