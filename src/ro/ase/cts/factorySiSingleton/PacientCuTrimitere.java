package ro.ase.cts.factorySiSingleton;

public class PacientCuTrimitere implements ITipPacient{

	@Override
	public String arePrioritate() {
		return "Pacientul cu trimitere are prioritate in clinica.";
	}

	@Override
	public String plateste() {
		return "Pacientul cu trimitere plateste pret redus.";
	}

	

}
