package zadanie4Konstruktory;

public class A {

	private int zmienna;

	A() {
		zmienna = 3;
	}

	A(int argument) {
		this();
		zmienna = zmienna + argument;
	}

	public static void main(String[] args) {
		A obiekt = new A(4);

		System.out.println(obiekt.getZmienna());

	}

	public int getZmienna() {
		return zmienna;
	}

	public void setZmienna(int zmienna) {
		this.zmienna = zmienna;
	}
	
}
