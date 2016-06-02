package ro.ase.cts.teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.cts.builder.MedicBuilder;
import ro.ase.cts.builder.Pacient;
import ro.ase.cts.builder.PacientBuilder;
import ro.ase.cts.composite.Clinica;
import ro.ase.cts.factorySiSingleton.Medic;

public class TestCitireFisier {

	Pacient pacient=new Pacient();
	Pacient pacient1=null;
	FileReader citireFisier=null;;
	BufferedReader buffer=null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
	@Before
	public void setUp() throws Exception {
		pacient1 = new Pacient();
		citireFisier= new FileReader(new File("dateProiect.txt"));
		buffer = new BufferedReader(citireFisier);
	}

	@After
	public void tearDown() throws Exception {
		citireFisier.close();
		buffer.close();
	}
	
	@Test
	public void testVerificareLungimeCNPDinFisier(){
		try {
			String line = "";
			while((line = buffer.readLine()) != null) {
				String [] value = line.split(" ");
				int cod = Integer.parseInt(value[0]);
				String nume = value[1].toString();
				String cnp = value[2].toString();
				if(cod > 0) {
					assertTrue(pacient.verificareLungimeCNP(cnp));
				}
			}
		}
		catch(IOException err) {
			err.printStackTrace();
		}
	}
	
}
