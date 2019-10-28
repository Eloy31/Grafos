package br.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {
	public static Integer matriz[][];
	public static Integer tamanho;
	
	LeituraArquivo (){}
	
	public static void main(String[] args) {
		try{
			BufferedReader in = new BufferedReader(new FileReader("teste.txt"));
			String tam;
			String str;
			
			tam = in.readLine(); // ler 1 linha
			tamanho = Integer.parseInt(tam); // transforma em integer
			matriz = new Integer [tamanho][2]; // declara matriz
			
			int i = 0;
			
			while ((str = in.readLine())!= null){
				String[] textoSeparado = str.split(" ");
				matriz[i][0] = Integer.parseInt(textoSeparado[0]);
				matriz[i][1] = Integer.parseInt(textoSeparado[1]);
				System.out.println(matriz[i][0] + " mds " + matriz[i][1]);
			}
		
			in.close();
		} catch(IOException e){
			System.out.println("Problemas com arquivo "+e.getMessage());
		}
	}
}
