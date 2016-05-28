package ro.ase.cts.decorator;

public class Decorator extends AnalizaSuplimentara{

	public Decorator(IAnaliza analiza){
		super();
	}
	@Override
	public void suplimenteazaAnalize() {
		System.out.println("Analizele suplimentare au fost adaugate in lista analizelor.");
	}

}
