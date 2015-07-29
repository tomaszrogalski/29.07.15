package zadanie5typyGeneryczne;

public class B<T extends A, S extends Number> {

	T zmiennaA;
	S zmiennaN;

	B(T a, S c) {

	}

	public static void main(String[] args) {

		B<A, Number> obiekt1 = new B<A, Number>(new A(), 3);// OK
		B<A, Number> obiekt2 = new B<A, Number>(3, new A());// NIE OK
		B<Number, A> obiekt3 = new B<Number, A>(3, new A());// NIE OK
		B obiekt4 = new B(new A(), 3);// OK
		B obiekt5 = new B(3, new A());// NIE OK
	}
}
