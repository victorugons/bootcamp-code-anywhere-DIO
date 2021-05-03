package br.victorugons.DesafiosMatematicos;

import java.io.IOException;
import java.util.Scanner;

public class AtividadeCinco {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        int num;

        for (int i = 0; i<5; i++) {
            num = leitor.nextInt();
            if(num%2 == 0)
                pares++;
            else impares++;
            if(num>0)
                positivos++;
            else if(num<0) negativos++;
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }
}
