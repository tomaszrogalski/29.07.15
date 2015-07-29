package zadanie5typyGeneryczne;

public class B {

	public static void main(String[] args) {
		String[] tablicaString = { "1", "2", "3" };
		Integer[] tablicaInt = { 1, 2, 3 };

		B obiekt = new B();

		obiekt.metoda(tablicaString); // OK
		//obiekt.metoda(tablicaInt); // NIE OK
		obiekt.metodaGeneryczna(tablicaInt); // OK
		obiekt.metodaGeneryczna(tablicaString); // OK

	}

	// Tylko String
	public void metoda(String[] tablica) {
		System.out.println(tablica.getClass() + "\n");
		for (String element : tablica) {
			System.out.println(element);
		}
	}

	// Rozne typy
	public <T> void metodaGeneryczna(T[] tablica) { // Obiekty
		System.out.println(tablica.getClass() + "\n");
		for (T element : tablica) {
			System.out.println(element);
		}
	}
}
