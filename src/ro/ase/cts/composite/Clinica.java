package ro.ase.cts.composite;

import java.util.ArrayList;

import ro.ase.cts.builder.Pacient;
import ro.ase.cts.factorySiSingleton.Medic;
import ro.ase.cts.flyweight.IClinica;

public class Clinica implements IClinica{
	
	private String denumire;
	private String adresa;

	private ArrayList<Pacient> listaPacienti;
	private ArrayList<Medic> listaMedici;
	
	public Clinica(){
		listaPacienti=new ArrayList<Pacient>();
		listaMedici=new ArrayList<Medic>();
	}
	
//	public void setDenumire(String denumire){
//		this.denumire=denumire;
//	}
	
	public Clinica(String denumire,String adresa){
	      this.adresa= adresa;
	      this.denumire=denumire;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public void adaugaPacient(Pacient pacient){
		listaPacienti.add(pacient);
	}
	
	public void stergePacient(Pacient pacient){
		listaPacienti.remove(pacient);
	}
	
	public void adaugaMedic(Medic medic){
		listaMedici.add(medic);
	}
	
	public void stergeMedic(Medic medic){
		listaMedici.remove(medic);
	}
	
	public ArrayList<Pacient> getPacienti(){
		return listaPacienti;
	}
	
	public ArrayList<Medic> getMedici(){
		return listaMedici;
	}
	
	public boolean verificaNumarPacienti(){
		int numarPacienti=0;
		for(int i=0;i<listaPacienti.size();i++){
			numarPacienti++;
		}
		if(numarPacienti<4){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Clinica [listaPacienti=" + listaPacienti + ", listaMedici=" + listaMedici + "]";
	}

	@Override
	public void creeazaClinica() {
		System.out.println("Clinica "+denumire +" a fost creata in "+ adresa);
	}
	
}
