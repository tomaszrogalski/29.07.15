package zadanie1;

public abstract class A {

	private String nazwa;

	public A() {
	}

	protected String getNazwa() {
		return nazwa;
	}

	protected void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public void wyswietl() {
		System.out.println(nazwa);
	}

}
