package ro.ase.cts.strategy;

public class PacientAsigurat implements IStrategieAsigurare{

	@Override
	public void verificareAsigurare() {
		System.out.println("Pacientul este asigurat. Costurile vor fi suportate de casa de asigurari.");
	}
}
