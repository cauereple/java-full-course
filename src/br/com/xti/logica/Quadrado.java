package br.com.xti.logica;

public class Quadrado {

	public static void main(String[] args) {
		
		int tamanho = 12;
		for(int x = 0; x < tamanho; x++)
		{
			for(int i = 0; i < tamanho; i++)
				System.out.print("* ");	
			System.out.println();
		}
	}
}