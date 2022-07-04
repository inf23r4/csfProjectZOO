package zoo;

import java.util.ArrayList;

public class Habitat{
	private String nombreHabitat;
	private ArrayList<Animals> animals = new ArrayList();
	
	public Habitat(String nombHabitat) {
		this.nombreHabitat = nombHabitat;
	}
	
	public void agregarAnimalToHabitat(Animals animal1) {
		animals.add(animal1);
	}
	
	public String getNombreHabitat(){
		return nombreHabitat;
	}
	
	public void setNombreHabitat(String nombre) {
		this.nombreHabitat = nombre;
	}
	
	@Override
	public String toString() {
		return "NOMBRE HABITAT:"+ this.nombreHabitat;
	}
}
