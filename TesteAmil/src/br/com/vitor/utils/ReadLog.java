package br.com.vitor.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadLog {

	protected Scanner ler;
	protected FileReader arq;
	
	public BufferedReader read(String dir){
		ler = new Scanner(System.in);
		BufferedReader lerArq = null;
	    
		try {
	      arq = new FileReader(dir);
	      lerArq = new BufferedReader(arq);
	 
		} catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }
	 
	    return lerArq;
	}
	
	public void close(){
		try {
			arq.close();
		} catch (Exception e) {
			 System.err.printf("Erro ao fechar arquivo: %s.\n",
			          e.getMessage());
		}
	}
}
