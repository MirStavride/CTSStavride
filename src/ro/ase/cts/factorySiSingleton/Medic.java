package ro.ase.cts.factorySiSingleton;

public class Medic implements IPersoana{

	int cod;
	String nume;
	String adresa;
	float salariu;
	
	public Medic(){
		
	}
	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod=cod;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public float getSalariu() {
		return salariu;
	}

	public void setSalary(float salariu) {
		this.salariu = salariu;
	}

	@Override
	public String toString() {
		return "Medic [cod=" + cod + ", nume=" + nume + ", adresa=" + adresa + ", salariu=" + salariu + "]";
	}

	@Override
	public String esteAbonat() {
		return "Persoana este medic angajat al clinicii.";
	}

	
}
