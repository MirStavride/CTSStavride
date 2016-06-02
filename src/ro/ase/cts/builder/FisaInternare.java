package ro.ase.cts.builder;

public class FisaInternare {

	private Pacient pacient;

	public FisaInternare(Pacient pacient) {
		this.pacient = pacient;
	}

	public FisaInternare() {

	}

	public boolean verificaVarstaPacientDinFisa() {
		if (pacient.getVarstaDinCNP() < 18)
			return false;
		else
			return true;
	}

	public boolean verificareLungimeCNPDinFisa() {
		int numarCifre = 0;
		for (int i = 0; i < pacient.getCNP().length(); i++) {
			numarCifre++;
		}
		if (numarCifre == 13)
			return true;
		return false;
	}

	public String getSectorNastereDinFisa() {

		if (pacient.getCNP().charAt(7) == '4' && pacient.getCNP().charAt(8) == '1') {
			return "Bucuresti Sector 1";
		} else if (pacient.getCNP().charAt(7) == '4' && pacient.getCNP().charAt(8) == '2') {
			return "Bucuresti Sector 2";
		} else if (pacient.getCNP().charAt(7) == '4' && pacient.getCNP().charAt(8) == '3') {
			return "Bucuresti Sector 3";
		} else if (pacient.getCNP().charAt(7) == '4' && pacient.getCNP().charAt(8) == '4') {
			return "Bucuresti Sector 4";
		} else if (pacient.getCNP().charAt(7) == '4' && pacient.getCNP().charAt(8) == '5') {
			return "Bucuresti Sector 5";
		} else if (pacient.getCNP().charAt(7) == '4' && pacient.getCNP().charAt(8) == '6') {
			return "Bucuresti Sector 6";
		}

		return "N/A";

	}
}
