package br.com.xti.heranca;

public class Galinha extends Animal implements AreaCalculavel{

	public Galinha() {
		super(2, "Milho");
	}
	
	void fazerBarulho() {
		System.out.println("Có Có");
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}
