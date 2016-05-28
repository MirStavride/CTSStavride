package ro.ase.cts.decorator;

public abstract class AnalizaSuplimentara {

	protected static String analizeSuplimentare;
	IAnaliza analiza;
	
	public AnalizaSuplimentara(){
		
	}

	public String getAnalizeSuplimentare() {
		return analizeSuplimentare;
	}

	public void setAnalizeSuplimentare(String analizeSuplimentare) {
		AnalizaSuplimentara.analizeSuplimentare = analizeSuplimentare;
	}

	public IAnaliza getAnaliza() {
		return analiza;
	}

	public void setAnaliza(IAnaliza analiza) {
		this.analiza = analiza;
	}
	
	public abstract void suplimenteazaAnalize();
}
