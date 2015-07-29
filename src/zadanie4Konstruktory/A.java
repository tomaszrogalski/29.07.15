package zadanie4Konstruktory;

class A extends B {

	A() {
		zmienna1 = 4;
	}

	public static void main(String[] args) {

		B obiekt = new A();
		System.out.println(zmienna1);
		System.out.println(zmienna2);
	}

}

class B {
	protected static int zmienna1;
	protected static int zmienna2;

	B() {

		zmienna1 = 3;
		zmienna2 = 3;
	}

}
