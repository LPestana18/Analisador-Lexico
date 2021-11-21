package br.com.lucaspestana.compiler.main;

import br.com.lucaspestana.compiler.exceptions.UsjtLexicalException;
import br.com.lucaspestana.compiler.lexico.UsjtScanner;
import br.com.lucaspestana.compiler.lexico.Token;

public class MainClass {

    public static void main(String[] args) {
        try {
            UsjtScanner sc = new UsjtScanner("src/main/java/input.usjt");
            Token token = null;

            do {
                token = sc.nextToken();
                if (token != null) {
                    System.out.println(token);
                }
            } while (token != null);
        } catch (UsjtLexicalException ex) {
            System.out.println("Lexical ERROR " + ex.getMessage());
        } catch (Exception ex) {
        }
    }
}
