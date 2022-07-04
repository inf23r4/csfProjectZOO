package Zoo;

public class Animals {

	public String nombre;
	public String habitat;
	public String descripcion;
	//private Boolean inVeterinarian;

	Animals(String nombre, String habitat, String descripcion ){
		this.nombre = nombre;
		this.habitat = habitat;
		this.descripcion = descripcion;
		//inVeterinarian = false;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHabitat(){
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getDescripcion(){
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/*public Boolean getInfoVet() { return inVeterinarian; }*/

        /*public void setInfoVet(Boolean inVeterinarian){
            this.inVeterinarian = inVeterinarian;
        }*/

	void mostrar( ) {
		System.out.println("Nombre: " + nombre );
		System.out.println("Habitat: " + habitat );
		System.out.println("Descripcion: " + descripcion );
		//System.out.println("en Veterinaria : " + inVeterinarian );
	}


}
