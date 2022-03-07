import br.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Você irá aprender a usar Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Você irá aprender a usar JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da mentoria Java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();


//        System.out.println(curso1);
//        System.out.println(curso2);
//
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamo java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");

        Dev devFlavio = new Dev();
        devFlavio.setNome("Flavio");
        devFlavio.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devFlavio.getConteudosInscritos());
        devFlavio.progredir();
        System.out.println("Conteúdos Inscritos: " + devFlavio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devFlavio.getConteudosConcluidos());
        System.out.println("XP: " + devFlavio.calcularTotalXp());

    }
}
