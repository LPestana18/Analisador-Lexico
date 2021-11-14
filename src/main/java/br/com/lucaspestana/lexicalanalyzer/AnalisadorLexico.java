package br.com.lucaspestana.lexicalanalyzer;

public class AnalisadorLexico {
    LeitorDeArquivosTexto ldat;

    public AnalisadorLexico(String arquivo) {
        ldat = new LeitorDeArquivosTexto(arquivo);
    }

    public Token proximoToken() {
        int carectereLido = -1;

        while ((carectereLido = ldat.lerProximoCaractere()) != -1) {
            char c = (char) carectereLido;
            if (c == ' ' || c == '\n') continue;
        }

        return null;
    }
}
