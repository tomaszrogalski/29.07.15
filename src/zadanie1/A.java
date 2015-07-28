package zadanie1;

public abstract class A {

	private String nazwa;

	public A() {
		// if (this instanceof C) {
		// nazwa = "c";
		// }
		// if (this instanceof B) {
		// nazwa = "b";
		// }
		nazwa = podajNazwe();
	}

	protected abstract String podajNazwe();

	public void wyswietl() {

		System.out.println(nazwa);
	}
}
