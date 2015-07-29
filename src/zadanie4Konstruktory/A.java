package zadanie4Konstruktory;

public class A {

	private int zmienna;

	A() {
		System.out.println("bezparametrowy");
	}

	A(int argument) {
		this();
		System.out.println("1 parametrowy");
	}

	A(int argument, int argument2) {
		this(3);
		System.out.println("2 parametrowy");
	}

	public static void main(String[] args) {
		A obiekt = new A(4, 4);
	}
}
