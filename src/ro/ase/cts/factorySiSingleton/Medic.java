package ro.ase.cts.factorySiSingleton;

public class Medic implements IPersoana{

	int cod;
	String nume;
	String adresa;
	String tip;
	float salariu;
	int aniVechime;
	
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

//	public float getSalariu() {
//		return salariu;
//	}
	
	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getAniVechime() {
		return aniVechime;
	}

	public void setAniVechime(int aniVechime) {
		this.aniVechime = aniVechime;
	}

	public float salariu(){
		if(tip.equalsIgnoreCase("rezident")){
			salariu=2500;
		}
		else if(tip.equalsIgnoreCase("specialist")){
			salariu=4000;
		}
		else if(tip.equalsIgnoreCase("primar")){
			salariu=5500;
		}
		return salariu;
	}
	
	public float maresteSalariulDupaVechime(){
		if(aniVechime>=20 && tip.equalsIgnoreCase("primar")){
			salariu=salariu+1500;
		}else if(aniVechime>=20 && tip.equalsIgnoreCase("specialist")){
			salariu=salariu+1300;
		}else if(aniVechime>10 && aniVechime<20 && tip.equalsIgnoreCase("primar")){
			salariu=salariu+1300;
		}else if(aniVechime>10 && aniVechime<20 && tip.equalsIgnoreCase("specialist")){
			salariu=salariu+1100;
		}
		return salariu;
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
