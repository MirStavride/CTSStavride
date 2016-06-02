package ro.ase.cts.builder;

import ro.ase.cts.strategy.IStrategieAsigurare;

public class PacientBuilder implements IPacient{

	Pacient pacient;
	
	public PacientBuilder(){
		pacient=new Pacient();
	}
	
	public PacientBuilder cod(int cod){
		pacient.setCod(cod);
		return this;
	}
	
	public PacientBuilder nume(String nume){
		pacient.setNume(nume);
		return this;
	}
	
	public PacientBuilder adresa(String adresa){
		pacient.setAdresa(adresa);
		return this;
	}
	
	public PacientBuilder CNP(String CNP){
		pacient.setCNP(CNP);
		return this;
	}
	
	public PacientBuilder email(String email){
		pacient.setEmail(email);
		return this;
	}
	
	public PacientBuilder sex(String sex){
		pacient.setSex(sex);
		return this;
	}
	
	public PacientBuilder strategie(IStrategieAsigurare asigurare) {
		pacient.setStrategie(asigurare);
		return this;
	}
	
	@Override
	public Pacient build() {
		return pacient;
	}

}
