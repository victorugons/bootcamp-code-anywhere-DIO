package br.victorugons.DesafiosMatematicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AtividadeQuatro {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int n1 = leitor.nextInt();
        int n2 = leitor.nextInt();

        if (n1%n2 == 0 || n2%n1 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
