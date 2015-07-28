package zadanie1;

public class B extends A{

	@Override
	public String getNazwa() {
		setNazwa("b");
		return "b";
	}
	@Override
	public void setNazwa(String nazwa) {
		super.setNazwa(nazwa);
	}
}
