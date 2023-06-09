package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Curso curso1= new Curso("curso java",
                "descrição curso java",
                8);

        Curso curso2= new Curso("curso js",
                "descrição curso js",
                4);

        Mentoria mentoria = new Mentoria("mentoria de java",
                "descrição mentoria de java",
                LocalDate.now());

        System.out.println(mentoria);
        System.out.println(curso1);
        System.out.println(curso2);
    }
}