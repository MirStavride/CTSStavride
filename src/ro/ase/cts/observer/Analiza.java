package ro.ase.cts.observer;

import java.util.ArrayList;

import ro.ase.cts.decorator.AnalizaSuplimentara;
import ro.ase.cts.decorator.IAnaliza;

public class Analiza extends AnalizaSuplimentara implements IAnaliza{

	private String denumire;
	private String tip;
	private float cost;
	private ArrayList<Observer> listaObservatori=new ArrayList<Observer>();
	private String stare;
	
	public Analiza(){
		
	}

	public Analiza(String denumire,String tip,String analizaSuplimentara) throws Exception{
		super();
		
		if(denumire == null)
			throw new Exception("Numele analizei trebuie introdus obligatoriu!");
		
		this.denumire = denumire;
		this.tip=tip;
		//this.cost= cost;
		this.analizeSuplimentare=analizaSuplimentara;

		if(tip.equals("normala")){ 
			this.cost = 55;
		}
			
		else if(tip.equals("speciala")){
			
			this.cost = 100;
		}
	}
		
	public String getStare() {
		return stare;
	}

	public void setStare(String stare) {
		this.stare = stare;
		
	}
	
	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public void adauga(Observer observer){
		listaObservatori.add(observer);
	}
	
	public void notificaTotiObservatorii(){
		for(Observer observer: listaObservatori){
			observer.updateAnalize();
		}
	}

	@Override
	public void analizeSuplimentate(Analiza analiza) {
		System.out.println("Analiza "+analizeSuplimentare+" a fost adaugata la analiza "+denumire);
	}

	@Override
	public void suplimenteazaAnalize() {
		System.out.println("Analizele au fost suplimentate.");
	}
			
	
}
