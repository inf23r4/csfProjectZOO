package zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	private static ArrayList<Habitat> habitats = new ArrayList();
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[]arg) {
		int opcion = 0;
		do {
			System.out.println("1. Agregar animal");
			System.out.println("2. Veterinaria");
			System.out.println("3. Mostrar habitat");
			System.out.println("4. Salir");
			
			System.out.println("Ingrese una opcion: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Ingrese datos del animal: ");
				sc.nextLine();
				String[] datos = sc.nextLine(). split("&");
				
				Animal animal = new Animal(datos[0], datos[1], datos[2], false);
				
				int numHabitat = 0;
				String nombreHabitat = "";
				
				if(habitats.isEmpty()) {
					numHabitat = 0;
					System.out.println("Ingresar nombre del habitat: ");
					nombreHabitat = sc.nextLine();
				}else {
					for(int i = 0; i < habitats.size(); i++) {
						System.out.println(i + "--> " + habitats.get(i).getNombreHabitat());
					}
					System.out.println(habitats.size() + "--> nuevo habitat");
					System.out.println("Seleccione un numero de habitat");
					numHabitat = sc.nextInt();
					
					if (numHabitat >= habitats.size()) {
						System.out.println("Ingrese nombre del nuevo habitat: ");
						sc.nextLine();
						nombreHabitat = sc.nextLine();
					}
					
					
				}
				agregarAnimal(numHabitat, nombreHabitat, animal);
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Opcion no disponible");
				break;
			}
		}while(opcion !=4);
	}
	
	public static void agregarAnimal(int numeroHabitat, String nombreHabitat, Animal animal1) {
		
		if(numeroHabitat < habitats.size()) {
			habitats.get(numeroHabitat).agregarAnimalToHabitat(animal1);
		}else {
			Habitat habitat1 = new Habitat(nombreHabitat);
			habitat1.agregarAnimalToHabitat(animal1);
			habitats.add(habitat1);
		}
		
		System.out.println(habitats);
		for(int i = 0; 1< habitats.size(); i++) {
			habitats.get(i).mostrarAnimales();
		}
	}
	
	
}
