package zadanie4Konstruktory;

class A extends B {

	A() {
		System.out.println("podklasa");
	}

	public static void main(String[] args) {
		new A();

	}
}

class B {

	B() {
		System.out.println("nadklasa");
	}

}
