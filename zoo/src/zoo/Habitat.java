package zoo;

import java.util.ArrayList;

public class Habitat{
	private String nombreHabitat;
	private ArrayList<Animal> animals = new ArrayList();
	
	public Habitat(String nombHabitat) {
		this.nombreHabitat = nombHabitat;
	}
	
	public void agregarAnimalToHabitat(Animal animal1) {
		animals.add(animal1);
	}
	
	public void mostrarAnimales() {
		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}
	}
	
	public Animal buscarAnimalNombre(String nombre) {
		Animal animalAux = null;
		for (int i = 0; i < animals.size(); i++) {
			if(nombre.equals(animals.get(i).getNombre())) {
				animalAux = animals.get(i);
			} 
		}
		return animalAux;
	}
	
	public String getNombreHabitat(){
		return nombreHabitat;
	}
	
	public void setNombreHabitat(String nombre) {
		this.nombreHabitat = nombre;
	}
	
	@Override
	public String toString() {
		return "HABITAT: "+ this.nombreHabitat ;
	}
}
