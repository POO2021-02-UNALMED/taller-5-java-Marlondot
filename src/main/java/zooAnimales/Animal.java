package zooAnimales;
import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private static Zona[] zona;
	
	//constructor
	public Animal(String nombre, int edad, String habitat, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}

	//
	//getting and setting
	//
	
	//totalAnimales
	public int getTotalAnimales() {
		return Animal.totalAnimales;
	}
	
	//nombre
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	//edad
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	//habitat
	public String getHabitat() {
		return this.habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat=habitat;
	}
	
	//genero
	public String getGenero() {
		return this.genero;
	}
	public void setgenero(String genero) {
		this.genero=genero;
	}
	
	//zona[]
	public static Zona[] getZona() {
		return Animal.zona;
	}
	public static void setZona(Zona[] zona) {
		Animal.zona=zona;
	}
	
	//
	//Methods
	//
	
	//movimiento
	public String movimiento() {
		return "desplazarse";
	}
	
	//total por tipo 
	public static String totalPorTipo() {
		String string=String.format("Mamiferos: %d\n"
				+ "Aves: %d\n"
				+ "Reptiles: %d\n"
				+ "Peces: %d\n"
				+ "Anfibios: %d",
				Mamifero.cantidadMamiferos(),
				Ave.cantidadAves(),
				Reptil.cantidadReptiles(),
				Pez.cantidadPeces(),
				Anfibio.cantidadAnfibios()
				);
		return string;
	}
	
	//overriding toString 
	@Override
	public String toString() {
		String string=String.format("Mi nombre es %s, "
				+ "tengo una edad de %d, "
				+ "habito en %s y mi genero es %s, "
				+ "la zona en la que me ubico es %s, "
				+ "en el %s",
				this.nombre,this.edad,this.habitat,this.genero,Animal.zona,Animal.zona[0].getZoo());
		return string;
		
	}
	
	
	
}
