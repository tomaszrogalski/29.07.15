package zadanie1;

public abstract class A {

	private String nazwa;

	public A() {
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public void wyswietl()
	{
		System.out.println(nazwa);
	}

}
