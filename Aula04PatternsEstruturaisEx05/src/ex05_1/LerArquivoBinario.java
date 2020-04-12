package ex05_1;

import java.io.*;

public class LerArquivoBinario {

	protected String lerArquivoBinario() {
	
        String nome = new File("Funcionario.class").getAbsolutePath();
        String bytes = "";
 
        String inputFile = nome;
 
 
        try (
            InputStream inputStream = new FileInputStream(inputFile);) {
            int byteRead;
 
            while ((byteRead = inputStream.read()) != -1) {
                bytes = bytes+" "+byteRead;
           
            } 
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    return bytes;
}
}