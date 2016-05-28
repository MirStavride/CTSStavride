package ro.ase.cts.flyweight;

import java.util.HashMap;

import ro.ase.cts.composite.Clinica;

public class ClinicaFactory {

	private static final HashMap<String,IClinica> clinicaMap=new HashMap();
	
	public static IClinica getClinica(String denumire,String adresa){
		Clinica clinica=(Clinica) clinicaMap.get(adresa);
		
		if(clinica==null){
			clinica=new Clinica(denumire,adresa);
			clinicaMap.put(adresa, clinica);
			System.out.println("Se creeaza o clinica in "+adresa);
		}
		return clinica;
	}
}
