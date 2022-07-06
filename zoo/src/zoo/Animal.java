package zoo;

public class Animal {

	private String nombre;
	private String habitat;
	private String descripcion;
	private Boolean inVeterinarian;
	
	public Animal(String nombre, String habitat, String descripcion, boolean inVeterinarian) {
		this.nombre = nombre;
		this.habitat = habitat;
		this.descripcion = descripcion;
		this.inVeterinarian = inVeterinarian;
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
	
	public Boolean getInfoVet() {
		return inVeterinarian;
	}
	
	public void setInfoVet(Boolean inVeterinarian){
		this.inVeterinarian = inVeterinarian;
	}
	
	@Override
	public String toString() {
		String estado = "disponibe";
		if(this.inVeterinarian==true) {
			estado = "en Veterinaria";
		}
		return " nombre:"+this.nombre+" habitat:"
		+this.habitat+" descripcion:"+this.descripcion+" estado:"+estado;
	}
	
		
	}
	
	
