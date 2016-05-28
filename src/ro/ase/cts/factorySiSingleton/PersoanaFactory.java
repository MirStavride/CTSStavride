package ro.ase.cts.factorySiSingleton;

import ro.ase.cts.builder.Pacient;

public class PersoanaFactory {
	
	public IPersoana getPersoana(EnumPersoana persoane){
		
		switch (persoane) {
		case Pacient:
			return new Pacient();
		case Medic:
			return new Medic();
		}
		return null;
	}

}
