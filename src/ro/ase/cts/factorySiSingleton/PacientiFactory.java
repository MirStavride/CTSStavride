package ro.ase.cts.factorySiSingleton;

public class PacientiFactory {
	
	private static PacientiFactory instanta = null;
	
	public PacientiFactory() {
		
	}
	
	public ITipPacient getPacient(EnumPacient pacienti){
	
		switch (pacienti) {
		case PacientCuTrimitere:
			return new PacientCuTrimitere();
		case PacientFaraTrimitere:
			return new PacientFaraTrimitere();
		}
		return null;
	}

	public static PacientiFactory getInstantaFactory() {
		if(instanta == null) {
			instanta = new PacientiFactory();
		}
		return instanta;
	}
}
