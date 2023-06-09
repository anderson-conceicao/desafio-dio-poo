package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Curso curso1= new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescriçao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2= new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescriçao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescriçao("descrição mentoria de java");
        mentoria.setData( LocalDate.now());

     //   System.out.println(curso1);
     //   System.out.println(curso2);
     //   System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAnderson = new Dev();
        devAnderson.setNome("Anderson");
        devAnderson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: "+devAnderson.getConteudosInscritos());
        devAnderson.progredir();
        devAnderson.progredir();
        System.out.println(" ----- ");
        System.out.println("Conteúdos inscritos: "+devAnderson.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: "+devAnderson.getConteudosConcluidos());
        System.out.println("XP: "+ devAnderson.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: "+devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println(" ----- ");
        System.out.println("Conteúdos inscritos: "+devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: "+devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());

    }
}