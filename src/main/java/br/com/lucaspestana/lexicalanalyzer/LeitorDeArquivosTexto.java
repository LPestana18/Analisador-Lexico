package br.com.lucaspestana.lexicalanalyzer;

import java.io.*;

public class LeitorDeArquivosTexto {
    InputStream is;

    public LeitorDeArquivosTexto(String arquivo) {
        try {
            is = new FileInputStream(new File(arquivo));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int lerProximoCaractere() {
        int ret = 0;
        try {
            ret = is.read();
            System.out.println((char) ret);
            return ret;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
