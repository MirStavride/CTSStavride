package ro.ase.cts.builder;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import ro.ase.cts.factorySiSingleton.IPersoana;
import ro.ase.cts.observer.Analiza;
import ro.ase.cts.observer.Observer;
import ro.ase.cts.strategy.IStrategieAsigurare;

public class Pacient extends Observer implements IPersoana {

	int cod;
	String nume;
	String adresa;
	String CNP;
	String email;
	String sex;
	Boolean cardSanatate;
	IStrategieAsigurare strategie;

	public Pacient(IStrategieAsigurare strategie) {
		this.strategie = strategie;
	}

	public Pacient(int cod, String nume, String adresa, String CNP, String email, String sex,
			IStrategieAsigurare strategie) {
		super();
		this.cod = cod;
		this.nume = nume;
		this.adresa = adresa;
		this.CNP = CNP;
		this.email = email;
		this.sex = sex;
		this.strategie = strategie;
	}

	public void executaStrategie() {
		strategie.verificareAsigurare();
	}

	public void setStrategie(IStrategieAsigurare strategie) {
		this.strategie = strategie;
	}

	public Pacient() {

	}

	public Boolean getCardSanatate() {
		return cardSanatate;
	}

	public void setCardSanatate(Boolean cardSanatate) {
		this.cardSanatate = cardSanatate;
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

	public String getCNP() {
		return CNP;
	}

	public void setCNP(String CNP) {
		this.CNP = CNP;
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

	public int getVarstaDinCNP() {
		
		int anul = 0;

		if (CNP.charAt(0) == '1' || CNP.charAt(0) == '2') {
			anul = 1900 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2));
		} else if (CNP.charAt(0) == '5' || CNP.charAt(0) == '6') {
			anul = 2000 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2));
		}

		int luna = Integer.parseInt("" + CNP.charAt(3) + CNP.charAt(4));
		int ziua = Integer.parseInt("" + CNP.charAt(5) + CNP.charAt(6));

		Calendar calendar = Calendar.getInstance();
		calendar.set(anul, luna, ziua);

		Calendar curent = Calendar.getInstance();

		long diferenta = curent.getTimeInMillis() - calendar.getTimeInMillis();
		long days = TimeUnit.MILLISECONDS.toDays(diferenta);

		return (int) (days / 365);
	}
	
	public String getSectorNastere(){
		
		if (CNP.charAt(7) == '4'&&CNP.charAt(8)=='1') {
			return "Bucuresti Sector 1";
		} else if (CNP.charAt(7) == '4' && CNP.charAt(8) == '2') {
			return "Bucuresti Sector 2";
		} else if (CNP.charAt(7) == '4' && CNP.charAt(8) == '3') {
			return "Bucuresti Sector 3";
		} else if (CNP.charAt(7) == '4' && CNP.charAt(8) == '4') {
			return "Bucuresti Sector 4";
		} else if (CNP.charAt(7) == '4' && CNP.charAt(8) == '5') {
			return "Bucuresti Sector 5";
		} else if (CNP.charAt(7) == '4' && CNP.charAt(8) == '6') {
			return "Bucuresti Sector 6";
		}
		
		return "N/A";
		
	}
	
	public boolean verificareLungimeCNP(){
		int numarCifre = 0;
		for( int i=0; i<CNP.length(); i++ ) {
		        numarCifre++;
		}
		if(numarCifre==13)
			return true;
		return false;
	}
	
	public boolean verificareLungimeCNP(String cnp){
		int numarCifre = 0;
		for( int i=0; i<cnp.length(); i++ ) {
		        numarCifre++;
		}
		if(numarCifre==13)
			return true;
		return false;
	}
	
	public boolean verificaVarstaPacient() {
		if(getVarstaDinCNP()<18)
			return false;
		else
			return true;
	}

	@Override
	public String toString() {
		return "Pacient [cod=" + cod + ", nume=" + nume + ", adresa=" + adresa + ", CNP=" + CNP + ", email=" + email
				+ ", sex=" + sex + "]";
	}

	@Override
	public String esteAbonat() {
		return "Persoana este pacient abonat al clinicii.";
	}

	public Pacient(Analiza analiza) {
		this.analiza = analiza;
		this.analiza.adauga(this);
	}

	@Override
	public void updateAnalize() {
		System.out.println("Analizele pacientului " + nume + ": " + analiza.getStare());
	}

}
