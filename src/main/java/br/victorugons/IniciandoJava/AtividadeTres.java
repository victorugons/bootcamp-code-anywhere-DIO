package br.victorugons.IniciandoJava;

import java.io.IOException;
import java.util.Scanner;

public class AtividadeTres {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int DDD = leitor.nextInt();
        switch (DDD) {
            case 61 -> System.out.println("Brasilia");
            case 71 -> System.out.println("Salvador");
            case 11 -> System.out.println("São Paulo");
            case 21 -> System.out.println("Rio de Janeiro");
            case 32 -> System.out.println("Juiz de Fora");
            case 19 -> System.out.println("Campinas");
            case 27 -> System.out.println("Vitoria");
            case 31 -> System.out.println("Belo Horizonte");
            default -> System.out.println("DDD nao cadastrado");
        }
    }
}
