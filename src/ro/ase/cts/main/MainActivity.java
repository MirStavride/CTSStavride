package ro.ase.cts.main;

import ro.ase.cts.builder.MedicBuilder;
import ro.ase.cts.builder.Pacient;
import ro.ase.cts.builder.PacientBuilder;
import ro.ase.cts.composite.Clinica;
import ro.ase.cts.decorator.AnalizaSuplimentara;
import ro.ase.cts.decorator.Decorator;
import ro.ase.cts.decorator.IAnaliza;
import ro.ase.cts.factorySiSingleton.EnumPacient;
import ro.ase.cts.factorySiSingleton.EnumPersoana;
import ro.ase.cts.factorySiSingleton.IPersoana;
import ro.ase.cts.factorySiSingleton.ITipPacient;
import ro.ase.cts.factorySiSingleton.Medic;
import ro.ase.cts.factorySiSingleton.PacientiFactory;
import ro.ase.cts.factorySiSingleton.PersoanaFactory;
import ro.ase.cts.flyweight.ClinicaFactory;
import ro.ase.cts.observer.Analiza;
import ro.ase.cts.strategy.PacientAsigurat;
import ro.ase.cts.strategy.PacientNeasigurat;

public class MainActivity {

	public static void main(String[] args) throws Exception {
		
//		//Builder
//		Pacient pacient1=new PacientBuilder()
//				.cod(1)
//				.nume("Stavride Miruna")
//				.adresa("Bucuresti")
//				.build();
//		Pacient pacient2=new PacientBuilder()
//				.cod(2)
//				.nume("Stanciu Ionica")
//				.adresa("Slobozia")
//				.email("ionicastanciu@gmail.com")
//				.sex("F")
//				.build();
//		System.out.println(pacient1.toString());
//		System.out.println(pacient2.toString());
//		
//		Medic medic1=new MedicBuilder()
//				.cod(101)
//				.nume("Simionescu Olga")
//				.adresa("Caracal")
//				.salariu(2000)
//				.build();
//		Medic medic2=new MedicBuilder()
//				.cod(102)
//				.nume("Santimbreanu Mircea")
//				.build();
//		
//		System.out.println(medic1.toString());
//		System.out.println(medic2.toString());
//		System.out.println();
//		
//		//FactoryMethod pentru Pacient cu trimitere/Pacient fara trimitere
//		PacientiFactory pacientiFactory= new PacientiFactory();
//		ITipPacient pacientCuTrimitere=pacientiFactory.getPacient(EnumPacient.PacientCuTrimitere);
//		
//		System.out.println(pacientCuTrimitere.arePrioritate());
//		System.out.println(pacientCuTrimitere.plateste());
//		
//		ITipPacient pacientFaraTrimitere=pacientiFactory.getPacient(EnumPacient.PacientFaraTrimitere);
//		
//		System.out.println(pacientFaraTrimitere.arePrioritate());
//		System.out.println(pacientFaraTrimitere.plateste());
//		System.out.println();
//		
//		//FactoryMethod pentru Medic/Pacient
//		PersoanaFactory persoanaFactory=new PersoanaFactory();
//		IPersoana pacient=persoanaFactory.getPersoana(EnumPersoana.Pacient);
//		
//		System.out.println(pacient.esteAbonat());
//		
//		IPersoana medic=persoanaFactory.getPersoana(EnumPersoana.Medic);
//		
//		System.out.println(medic.esteAbonat());
//		System.out.println();
//		
//		//Strategy
//		Pacient p = new PacientBuilder().strategie(new PacientAsigurat()).build();
//		p.executaStrategie();
//		p.setStrategie(new PacientNeasigurat());
//		p.executaStrategie();
//		
//		//Singleton
//		PacientiFactory singletonPacient1 = PacientiFactory.getInstantaFactory();
//		PacientiFactory singletonPacient2 = PacientiFactory.getInstantaFactory();
//		
//		System.out.println();
//		System.out.println(singletonPacient1.toString());
//		System.out.println(singletonPacient2.toString());
//		ITipPacient tip1 = singletonPacient1.getPacient(EnumPacient.PacientCuTrimitere);
//		System.out.println(tip1.arePrioritate());
//		System.out.println();
//		
//		//Composite pentru Pacientii si Medicii care apartin Clinicii
//		Clinica clinica=new Clinica();
//		clinica.adaugaPacient(pacient1);
//		clinica.adaugaPacient(pacient2);
//		
//		clinica.adaugaMedic(medic1);
//		clinica.adaugaMedic(medic2);
//		
//		System.out.println(clinica.toString());
//		System.out.println();
//	      
//	      for (Pacient pacienti : clinica.getPacienti()) {
//	         System.out.println(pacienti.toString());
//	      }	
//	      
//	      for(Medic medici:clinica.getMedici()){
//	    	  System.out.println(medici.toString());
//	      }
//	      
//	      //Flyweight pentru a creea o noua clinica in Craiova si una in Brasov
//	      System.out.println();
//	      ClinicaFactory clinicaFactory=new ClinicaFactory();
//	      Clinica clinicaCraiova = new Clinica();
//	      clinicaFactory.getClinica("MedlifeCraiova","Craiova").creeazaClinica();
//	      
//	      Clinica clinicaBrasov=new Clinica();
//	      clinicaFactory.getClinica("MedlifeBrasov", "Brasov").creeazaClinica();

	      //Observer pentru a notifica pacientii in momentul in care sunt gata analizele
	     Analiza analiza=new Analiza();
	     Pacient pacient3= new Pacient(analiza);
	     pacient3.setNume("Rusu Cosmina");
	     System.out.println();
	     System.out.println("Analizele au sosit.");
	     analiza.setStare("au sosit.");
	     pacient3.updateAnalize();
	     System.out.println("Analizele nu au sosit din cauza unei erori.");
	     analiza.setStare("nu au sosit din cauza unei erori a sistemului.");
	     pacient3.updateAnalize();
	     System.out.println();
	     
	     //Decorator pentru a adauga analize suplimentare/speciale la analizele standard
	     IAnaliza iAnaliza=new Analiza("Analiza1","normala","Leucocite");
	     AnalizaSuplimentara analizaSuplimentara=new Decorator(iAnaliza);
	     analizaSuplimentara.suplimenteazaAnalize();
	     iAnaliza.analizeSuplimentate(analiza);
	}

}
