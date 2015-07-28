package zadanie1;

public class C extends A{
	
	@Override
	public String getNazwa() {
		setNazwa("c");
		return "c";
	}
	@Override
	public void setNazwa(String nazwa) {
		super.setNazwa(nazwa);
	}

}
