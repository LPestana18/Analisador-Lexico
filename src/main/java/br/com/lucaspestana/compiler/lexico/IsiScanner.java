package br.com.lucaspestana.compiler.lexico;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IsiScanner {

    private char[] content;
    private int estado;

    public IsiScanner(String filename) {
        try {
            String txtConteudo;
            txtConteudo = Files.readString(Paths.get(filename));
            System.out.println("DEBUG ----------");
            System.out.println(txtConteudo);
            System.out.println("----------------");
            content = txtConteudo.toCharArray();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    private boolean isChar(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    private boolean isOperator(char c) {
        return c == '>' || c == '<' || c == '=' || c == '!';
    }

    private boolean isSpace(char c) {
        return c == ' ' || c == '\t' || c == '\n' || c == '\r';
    }
}
