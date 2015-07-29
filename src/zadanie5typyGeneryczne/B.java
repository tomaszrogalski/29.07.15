package zadanie5typyGeneryczne;

public class B<T, S> {

	T obiektT1;
	T obiektT2;
	S obiektS1;

	// Konstruktor wywolany z parametrem dowolnego typu
	B(T elementTypuT) {
		this.obiektT1 = elementTypuT;
	}

	// Konstruktor wywolany z parametrami dowolnego typu ale oba musza byc takie
	// same
	B(T elementTypuT, T elementTypuT2) {
		this.obiektT1 = elementTypuT;
		this.obiektT2 = elementTypuT2;
	}

	// Dowolny1, Dowolny2, Dowolny1
	B(T elementTypuT, S elementTypuS, T elementKlasaT2) {
		this.obiektT1 = elementTypuT;
		this.obiektS1 = elementTypuS;
		this.obiektT2 = elementKlasaT2;
	}

	public static void main(String[] args) {

		A obiektA = new A();
		Byte obiektByte = new Byte((byte) 2);

		Integer a = null;
		Double b = null;
		Character c = null;
		new B(obiektA, obiektByte);

		new B(a, b, a);
	}
}
