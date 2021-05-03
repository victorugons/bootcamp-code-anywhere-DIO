package br.victorugons.IniciandoJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AtividadeUm {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            for (int i = 2 ; i <= N ; i++) {
                if (i%2 == 0) System.out.println(i);
            }
        }

}
