package com.example.demo.teste;

import org.springframework.data.domain.Page;

public class AlunoDto {

	private Long id;
	private String name;
	
	public AlunoDto(Aluno aluno) {
		this.id = aluno.getId();
		this.name = aluno.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public static Page<AlunoDto> converter(Page<Aluno> alunos) {
		return alunos.map(AlunoDto::new);
	}
	
}
