package br.com.lucaspestana.lexicalanalyzer;

public class Token {
    public TipoToken nome;
    public String lexema;

    public Token(TipoToken nome, String lexema) {
        this.nome = nome;
        this.lexema = lexema;
    }

    @Override
    public String toString() {
        return "<" + nome + "," + lexema + ">";
    }
}
