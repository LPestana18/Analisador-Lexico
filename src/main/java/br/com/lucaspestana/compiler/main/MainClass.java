package br.com.lucaspestana.compiler.main;

import br.com.lucaspestana.compiler.exceptions.UsjtLexicalException;
import br.com.lucaspestana.compiler.lexico.UsjtScanner;
import br.com.lucaspestana.compiler.lexico.Token;

public class MainClass {

    public static void main(String[] args) {
        try {
            UsjtScanner sc = new UsjtScanner("src/main/java/input.usjt");
            Token token = null;
            System.out.println("Tipos de token: ");
            System.out.println("0 - Identificador");
            System.out.println("1 - Númerico");
            System.out.println("2 - Operador");
            System.out.println("3 - Atribuição");

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
