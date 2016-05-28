package ro.ase.cts.factorySiSingleton;

public class PacientFaraTrimitere implements ITipPacient{

	@Override
	public String arePrioritate() {
		return "Pacientul fara trimitere nu are prioritate in clinica.";
	}

	@Override
	public String plateste() {
		return "Pacientul fara trimitere plateste pret intreg.";
	}


}
