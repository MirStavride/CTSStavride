package ro.ase.cts.strategy;

public class PacientNeasigurat implements IStrategieAsigurare{

	@Override
	public void verificareAsigurare() {
		System.out.println("Pacientul nu este asigurat. Costurile vor fi suportate de catre pacient.");
	}

}
