package br.com.xti.poo;

public class MatematicaTest {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		
		/*
		int ma = m.maior(10, 20);
		System.out.println(ma);
		
		double so = m.somma(10, 20);
		System.out.println(so);
		
		
		--> uma forma de fazer é fazer um método por vez
		int par = m.maior(2, 4);
		int impar = m.maior(3, 5);
		double so = m.somma(par, impar);
		System.out.println(so);
		
		--> uma outra forma de fazer é chamar os métodos dentro do outro método
		double sommare = m.somma(m.maior(4, 6), m.maior(5, 7));
		System.out.println(sommare);
		
		*/
		
		// também pode ser chamado assim
		// double[] numeros = {2, 3, 5, 6, 7, 123, 345, 69};
		// double total = m.soma(numeros);
		double total = m.soma("Numeros", 2, 3, 5, 6, 7, 123, 345, 69);
		
		System.out.println("Total = " + total);
		
		//Cálculo medias
		System.out.println(m.media(10));
		System.out.println(m.media(5, 3));
		System.out.println(m.media("50", "30"));
		System.out.println(m.media(2, 4, 6, 8, 10));
	}	
}
