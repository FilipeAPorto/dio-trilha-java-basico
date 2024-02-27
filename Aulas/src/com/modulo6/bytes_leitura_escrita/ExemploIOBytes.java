package com.modulo6.bytes_leitura_escrita;

import java.io.*;

public class ExemploIOBytes {
    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }


    public static void copiarArquivo() throws IOException {

        File file = new File("G:\\Meu Drive\\Arquivos e Backups\\Projetos Estudos\\Java\\Dio\\Java Basico\\dio-trilha-java-basico\\recomendacoes-copy.txt");

        String nomeArquivo = file.getName();

        InputStream is = new FileInputStream(file.getName());
        BufferedInputStream bis = new BufferedInputStream(is);

        String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf("-")).concat("-copy2.txt");

        File fileCopy = new File(nomeArquivoCopy);

        OutputStream os = new FileOutputStream(fileCopy);
        BufferedOutputStream bos = new BufferedOutputStream(os);

        int line = 0;
        while ((line = bis.read()) != -1) {

            bos.write((char) line);
            bos.flush();
        }

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo %s copiado com sucesso e esta no diretório %s com %d bytes" , fileCopy.getName(),fileCopy.getPath(),fileCopy.length());

        bis.close();
        bos.close();

    }
}
