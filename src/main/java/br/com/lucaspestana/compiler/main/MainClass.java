package br.com.lucaspestana.compiler.main;

import br.com.lucaspestana.compiler.lexico.IsiScanner;
import br.com.lucaspestana.compiler.lexico.Token;

public class MainClass {

    public static void main(String[] args) {

        IsiScanner sc = new IsiScanner("src/main/java/input.isi");
        Token token = null;

        do {
            token = sc.nextToken();
            if (token != null) {
                System.out.println(token);
            }
        } while (token != null);
    }
}
