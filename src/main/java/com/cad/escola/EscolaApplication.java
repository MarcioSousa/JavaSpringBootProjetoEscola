package com.cad.escola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EscolaApplication {

	public static void main(String[] args) {
		//SpringApplication.run(EscolaApplication.class, args);
		
		Curso curso1 = new Curso("AAA","Analista de Dados");
		curso1.setCargaHoraria(30);
		curso1.setValor(1.30);
		curso1.setDataVigencia("10/02/2023");
		curso1.setCargaHoraria(30);
		curso1.setPrograma("Gratuito");
		
		Curso curso2 = new Curso("BBB","Engenharia");
		curso2.setCargaHoraria(40);
		curso2.setValor(2.10);
		curso2.setDataVigencia("10/03/2023");
		curso2.setCargaHoraria(40);
		curso2.setPrograma("Pago");

		System.out.println("O valor do curso e: " + curso1.getValor());
		System.out.println("A data vigencia e: " + curso1.getDataVigencia());
		System.out.println(curso1.getCargaHoraria());
		System.out.println(curso1.getNome());
		System.out.println(curso1.getPrograma());
		
		
		System.out.println("-----------------------------");
		
		
		System.out.println(curso2.getValor());
		System.out.println(curso2.getDataVigencia());
		System.out.println(curso2.getCargaHoraria());
		System.out.println(curso2.getNome());
		System.out.println(curso2.getPrograma());
		
	}

}
