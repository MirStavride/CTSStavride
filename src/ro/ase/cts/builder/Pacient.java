package ro.ase.cts.builder;

import ro.ase.cts.factorySiSingleton.IPersoana;
import ro.ase.cts.observer.Analiza;
import ro.ase.cts.observer.Observer;
import ro.ase.cts.strategy.IStrategieAsigurare;

public class Pacient extends Observer implements IPersoana{

	int cod;
	String nume;
	String adresa;
	int varsta;
	String email;
	String sex;
	IStrategieAsigurare strategie;
	
	public Pacient(IStrategieAsigurare strategie){
		this.strategie=strategie;
	}
	
	public Pacient(int cod, String nume, String adresa, int varsta, String email, String sex,
			IStrategieAsigurare strategie) {
		super();
		this.cod = cod;
		this.nume = nume;
		this.adresa = adresa;
		this.varsta = varsta;
		this.email = email;
		this.sex = sex;
		this.strategie = strategie;
	}

	public void executaStrategie(){
		strategie.verificareAsigurare();
	}

	public void setStrategie(IStrategieAsigurare strategie) {
		this.strategie = strategie;
	}
	public Pacient(){
		
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
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

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Pacient [cod=" + cod + ", nume=" + nume + ", adresa=" + adresa + ", varsta=" + varsta + ", email="
				+ email + ", sex=" + sex + "]";
	}

	@Override
	public String esteAbonat() {
		return "Persoana este pacient abonat al clinicii.";
	}
	
	public Pacient(Analiza analiza){
	      this.analiza = analiza;
	      this.analiza.adauga(this);
	}

	@Override
	public void updateAnalize() {
		System.out.println("Analizele pacientului "+nume+" "+analiza.getStare());
	}
	
	
}
