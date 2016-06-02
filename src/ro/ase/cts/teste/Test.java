package ro.ase.cts.teste;

import static org.junit.Assert.*;


import ro.ase.cts.builder.MedicBuilder;
import ro.ase.cts.builder.Pacient;
import ro.ase.cts.builder.PacientBuilder;
import ro.ase.cts.composite.Clinica;
import ro.ase.cts.factorySiSingleton.Medic;
import ro.ase.cts.observer.Analiza;

public class Test {
	
	@org.junit.Test
	public void testVerificaSetNumeClinica(){
		Clinica clinica=new Clinica("MedLife","Constanta");
		String denumire=clinica.getDenumire();
		String adresa=clinica.getAdresa();
		assertEquals("MedLife",denumire);
		assertEquals("Constanta",adresa);
	}

	@org.junit.Test
	public void testVerificareLungimeCNP(){
			Pacient pacient=new PacientBuilder()
					.cod(1)
					.nume("Stavride Miruna")
					.CNP("2940319440029")
					.adresa("Bucuresti")
					.build();
			assertTrue(pacient.verificareLungimeCNP());
	}
	
	@org.junit.Test
	public void testVarstaPacient() {
		Pacient pacient=new PacientBuilder()
				.cod(1)
				.nume("Stavride Miruna")
				.CNP("2940319440029")
				.adresa("Bucuresti")
				.build();
		int actual = pacient.getVarstaDinCNP();
		int valoareCorecta = 22;
		assertEquals(valoareCorecta, actual);
	}
	
	@org.junit.Test
	public void testVarstaPacient1() {
		Pacient pacient=new PacientBuilder()
				.cod(1)
				.nume("Stoica Ioana")
				.CNP("2930319440029")
				.adresa("Bucuresti")
				.build();
		int actual = pacient.getVarstaDinCNP();
		int valoareCorecta = 23;
		assertEquals(valoareCorecta, actual);
	}
	
	@org.junit.Test
	public void testVerificareVarstaPacient(){
			Pacient pacient=new PacientBuilder()
					.cod(1)
					.nume("Stavride Miruna")
					.CNP("2940319440029")
					.adresa("Bucuresti")
					.build();
			assertTrue(pacient.verificaVarstaPacient());
	}
	
	@org.junit.Test
	public void testSectorNastere() {
		Pacient pacient=new PacientBuilder()
				.cod(1)
				.nume("Stavride Miruna")
				.CNP("2940319440029")
				.adresa("Bucuresti")
				.build();
		String actual = pacient.getSectorNastere();
		String valoareCorecta = "Bucuresti Sector 4";
		assertEquals(valoareCorecta, actual);
	}
	
	@org.junit.Test
	public void testSectorNastere1() {
		Pacient pacient=new PacientBuilder()
				.cod(1)
				.nume("Cechina Marcela")
				.CNP("2940319410029")
				.adresa("Bucuresti")
				.build();
		String actual = pacient.getSectorNastere();
		String valoareCorecta = "Bucuresti Sector 1";
		assertEquals(valoareCorecta, actual);
	}
	
	@org.junit.Test
	public void testSectorNastere2() {
		Pacient pacient=new PacientBuilder()
				.cod(1)
				.nume("Gosa Doris")
				.CNP("2940319450029")
				.adresa("Bucuresti")
				.build();
		String actual = pacient.getSectorNastere();
		String valoareCorecta = "Bucuresti Sector 5";
		assertEquals(valoareCorecta, actual);
	}
	
	@org.junit.Test
	public void testSalariu() {
		Medic medic=new MedicBuilder()
				.cod(101)
				.nume("Simionescu Olga")
				.tip("rezident")
				.adresa("Caracal")
				.build();
		float actual = medic.salariu();
		float valoareCorecta = 2500;
		assertEquals(valoareCorecta,actual, 0.0002);
	}
	
	@org.junit.Test
	public void testSalariu1() {
		Medic medic=new MedicBuilder()
				.cod(102)
				.nume("Enache Amalia")
				.tip("primar")
				.adresa("Constanta")
				.build();
		float actual = medic.salariu();
		float valoareCorecta = 5500;
		assertEquals(valoareCorecta,actual, 0.0002);
	}
	
	@org.junit.Test
	public void testSalariu2() {
		Medic medic=new MedicBuilder()
				.cod(102)
				.nume("Buzatu Adina")
				.tip("specialist")
				.adresa("Constanta")
				.build();
		float actual = medic.salariu();
		float valoareCorecta = 4000;
		assertEquals(valoareCorecta,actual, 0.0002);
	}
	
	@org.junit.Test
	public void testMaresteSalariulDupaVechime() {
		Medic medic=new MedicBuilder()
				.cod(103)
				.nume("Buzatu Adina")
				.tip("primar")
				.adresa("Constanta")
				.aniVechime(25)
				.build();
		medic.salariu();
		float actual = medic.maresteSalariulDupaVechime();
		float valoareCorecta = 7000;
		assertEquals(valoareCorecta,actual, 0.0002);
	}
	
	@org.junit.Test
	public void testMaresteSalariulDupaVechime1() {
		Medic medic=new MedicBuilder()
				.cod(103)
				.nume("Alexandrescu Bogdan")
				.tip("specialist")
				.adresa("Constanta")
				.aniVechime(20)
				.build();
		medic.salariu();
		float actual = medic.maresteSalariulDupaVechime();
		float valoareCorecta = 5300;
		assertEquals(valoareCorecta,actual, 0.0002);
	}
	
	@org.junit.Test
	public void testMaresteSalariulDupaVechime2() {
		Medic medic=new MedicBuilder()
				.cod(103)
				.nume("Predescu Matei")
				.tip("specialist")
				.adresa("Constanta")
				.aniVechime(15)
				.build();
		medic.salariu();
		float actual = medic.maresteSalariulDupaVechime();
		float valoareCorecta = 5100;
		assertEquals(valoareCorecta,actual, 0.0002);
	}
	
	@org.junit.Test
	public void testMaresteSalariulDupaVechime3() {
		Medic medic=new MedicBuilder()
				.cod(103)
				.nume("Predescu Matei")
				.tip("specialist")
				.adresa("Constanta")
				.aniVechime(9)
				.build();
		medic.salariu();
		float actual = medic.maresteSalariulDupaVechime();
		float valoareCorecta = 4000;
		assertEquals(valoareCorecta,actual, 0.0002);
	}
	
	@org.junit.Test
	public void testDeterminaCostRedus() {
		Pacient pacient=new PacientBuilder()
				.cod(1)
				.nume("Stavride Miruna")
				.CNP("2940319440029")
				.adresa("Bucuresti")
				.build();
		Analiza analiza=new Analiza("Analiza1","normala");
		float actual = analiza.determinaCost();
		float valoareCorecta = 50;
		assertEquals(valoareCorecta,actual, 0.0002);
	}
	
	@org.junit.Test
	public void testDeterminaCostRedus1() {
		Pacient pacient=new PacientBuilder()
				.cod(2)
				.nume("Nicorici Daniela")
				.CNP("2921003440029")
				.adresa("Bucuresti")
				.build();
		Analiza analiza=new Analiza("Analiza1","speciala");
		float actual = analiza.determinaCost();
		float valoareCorecta = 100;
		assertEquals(valoareCorecta,actual, 0.0002);
	}
	
	@org.junit.Test
	public void testVerificareNumarPacienti(){
			Pacient pacient=new PacientBuilder()
					.cod(1)
					.nume("Stavride Miruna")
					.CNP("2940319440029")
					.adresa("Bucuresti")
					.build();
			Pacient pacient2=new PacientBuilder()
					.cod(1)
					.nume("Stavride Miruna")
					.CNP("2940319440029")
					.adresa("Bucuresti")
					.build();
			Pacient pacient3=new PacientBuilder()
					.cod(1)
					.nume("Stavride Miruna")
					.CNP("2940319440029")
					.adresa("Bucuresti")
					.build();
			Clinica clinica=new Clinica();
			clinica.adaugaPacient(pacient);
			clinica.adaugaPacient(pacient2);
			clinica.adaugaPacient(pacient3);
			assertTrue(clinica.verificaNumarPacienti());
	}
	
	@org.junit.Test
	public void testVerificareStareAnalize(){
		Analiza analiza=new Analiza();
		Pacient pacient= new Pacient(analiza);
	    pacient.setNume("Rusu Cosmina");
	    analiza.setStare("sosite");
	    pacient.updateAnalize();
		assertTrue(analiza.verificaStare());
	}
	
	@org.junit.Test
	public void testDeterminareReducere() {
		Pacient pacient=new PacientBuilder()
				.cod(2)
				.nume("Nicorici Daniela")
				.CNP("2921003440029")
				.adresa("Bucuresti")
				.build();
		Analiza analiza=new Analiza("Analiza1","speciala");
		analiza.determinaCost();
		float actual = analiza.getPretRedus(pacient);
		float valoareCorecta = 100;
		assertEquals(valoareCorecta,actual, 0.0002);
	}

	@org.junit.Test
	public void testDeterminareReducere1() {
		Pacient pacient=new PacientBuilder()
				.cod(2)
				.nume("Nicorici Daniela")
				.CNP("6051003440029")
				.adresa("Bucuresti")
				.build();
		Analiza analiza=new Analiza("Analiza1","normala");
		analiza.determinaCost();
		float actual = analiza.getPretRedus(pacient);
		float valoareCorecta = 25;
		assertEquals(valoareCorecta,actual, 0.0002);
	}
	
	


}
