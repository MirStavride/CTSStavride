package ro.ase.cts.teste;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.cts.builder.FisaInternare;
import ro.ase.cts.builder.IPacient;
import ro.ase.cts.builder.Pacient;
import ro.ase.cts.builder.PacientBuilder;
import ro.ase.cts.factorySiSingleton.IPersoana;
import ro.ase.cts.factorySiSingleton.Medic;

public class TestMock {

	@Test
	public void testVerificareVarstaPacient() {
		Pacient pacient=mock(Pacient.class);
		when(pacient.getVarstaDinCNP()).thenReturn(20);
		FisaInternare fisa=new FisaInternare(pacient);
		assertTrue(fisa.verificaVarstaPacientDinFisa());
	}
	
	@Test
	public void testVerificareLungimeCNP() {
		Pacient pacient=mock(Pacient.class);
		when(pacient.getCNP()).thenReturn("2940319440029");
		FisaInternare fisa=new FisaInternare(pacient);
		assertTrue(fisa.verificareLungimeCNPDinFisa());
	}
	
//	@Test
//	public void testSectorNastere() {
//		Pacient pacient=mock(Pacient.class);
//		when(pacient.getSectorNastere()).thenReturn("Bucuresti Sector 2");
//		FisaInternare fisa=new FisaInternare(pacient);
//		String actual=fisa.getSectorNastereDinFisa();
//		String valoareCorecta="Bucuresti Sector 2";
//		assertEquals(valoareCorecta,actual);
//	}
}
