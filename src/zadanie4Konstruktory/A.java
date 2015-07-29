package zadanie4Konstruktory;

class A {

	int a;
	int b;
	int c;

	public A(int a, int b, int c) {
		this(b, c);
		this.c = c;
	}

	public A(int c) {
		this.c = c;
	}

	public A(int b, int c) {
		this(c);
		this.b = b;

	}

	public static void main(String[] args) {

	}
}
