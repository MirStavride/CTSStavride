package ro.ase.cts.builder;

import ro.ase.cts.factorySiSingleton.Medic;

public class MedicBuilder implements IMedic{
	
	Medic medic;
	
	public MedicBuilder() {
		medic=new Medic();
	}
	
	public MedicBuilder cod(int cod){
		medic.setCod(cod);
		return this;
	}
	
	public MedicBuilder nume(String nume){
		medic.setNume(nume);
		return this;
	}
	
	public MedicBuilder adresa(String adresa){
		medic.setAdresa(adresa);
		return this;
	}
	
	public MedicBuilder salariu(float salariu){
		medic.setSalary(salariu);
		return this;
	}

	@Override
	public Medic build() {
		return medic;
	}
}
