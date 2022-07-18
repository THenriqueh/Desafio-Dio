package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		Course course1 = new Course("curso java", "curso java", 8);

		Course course2 = new Course("curso js", "descri��o curso js", 4);

		Mentoring mentoring = new Mentoring("mentoria de java", "descri��o mentoria java", LocalDate.now());
		Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descri��o Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring);

        Dev devCamila = new Dev("Camila");
        devCamila.subscribeBootcamp(bootcamp);
        System.out.println("Conte�dos Inscritos Camila:" + devCamila.getSubscribeContets());
        devCamila.progress();
        devCamila.progress();
        System.out.println("-");
        System.out.println("Conte�dos Inscritos Camila:" + devCamila.getConcluidsContents());
        System.out.println("Conte�dos Conclu�dos Camila:" + devCamila.getConcluidsContents());
        System.out.println("XP:" + devCamila.calculateTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev("Joao");
        devJoao.subscribeBootcamp(bootcamp);
        System.out.println("Conte�dos Inscritos Jo�o:" + devJoao.getSubscribeContets());
        devJoao.progress();
        devJoao.progress();
        devJoao.progress();
        System.out.println("-");
        System.out.println("Conte�dos Inscritos Jo�o:" + devJoao.getConcluidsContents());
        System.out.println("Conte�dos Concluidos Jo�o:" + devJoao.getConcluidsContents());
        System.out.println("XP:" + devJoao.calculateTotalXp());
		
	}

}
