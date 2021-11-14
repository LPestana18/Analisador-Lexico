package br.com.lucaspestana.lexicalanalyzer;

public class Program {

    public static void main(String[] args) {

        AnalisadorLexico lex = new AnalisadorLexico(args[0]);
        Token t = null;

        while ((t = lex.proximoToken()) != null) {
            System.out.println(t);
        }
    }
}
