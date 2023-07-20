package com.cad.escola.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cad.escola.Curso;

@RestController
@RequestMapping("/api/cursos")	
public class CursoController {
	
	Curso curso1 = new Curso("AAA", "Analista de Dados");
	Curso curso2 = new Curso("BBB", "Engenharia de Software");
	Curso curso3 = new Curso("CCC", "Tecnico de Sistemas");
	
	public CursoController() {
		super();
		curso1.setCargaHoraria(30);
		curso1.setValor(1.30);
		curso1.setDataVigencia("10/02/2023");
		curso1.setCargaHoraria(30);
		curso1.setPrograma("Gratuito");
		
		curso2.setCargaHoraria(40);
		curso2.setValor(2.10);
		curso2.setDataVigencia("10/03/2023");
		curso2.setCargaHoraria(40);
		curso2.setPrograma("Pago");
		
		curso3.setCargaHoraria(50);
		curso3.setValor(4.50);
		curso3.setDataVigencia("12/03/2023");
		curso3.setCargaHoraria(80);
		curso3.setPrograma("Pago");
	}
	

	@GetMapping("")
	public Curso carregaCursos() {
		return (curso1);
	}
	
}
