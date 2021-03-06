package br.com.xti.java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.ArrayList;

import br.com.xti.poo.Conta;

public class Serializa2 {

	public void armazenarContas(ArrayList<Conta> contas) throws IOException {

		try (FileOutputStream fos = new FileOutputStream("files/contas.ser")) {
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(contas);
			}
		}
	}

	public ArrayList<Conta> recuperarContas() throws IOException, ClassNotFoundException {

		try (FileInputStream fis = new FileInputStream("files/contas.ser")) {
			try (ObjectInputStream ois = new ObjectInputStream(fis)) {
				return (ArrayList<Conta>) ois.readObject();
			}
		}

	}

	public static void main(String[] args) throws Exception {

		ArrayList<Conta> contas = new ArrayList<>();

		contas.add(new Conta("Ricardo", 12000.23));
		contas.add(new Conta("Lawrence", 11050.32));
		contas.add(new Conta("Sandra", 18000.21));
		contas.add(new Conta("Beatriz", 23200.09));

		Serializa2 operacao = new Serializa2();
		operacao.armazenarContas(contas);

		ArrayList<Conta> contas2 = operacao.recuperarContas();
		for (Conta conta : contas) {
			conta.exibeSaldo();
		}

	}

}
