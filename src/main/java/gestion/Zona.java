package gestion;
import zooAnimales.Animal;
import java.util.*;

public class Zona {
	private  String nombre;
	private List<Zoologico> zoo;
	private static List<Animal> animales;
	
	public Zona() {
		
	}
	
	//constructor
	public Zona(String nombre, List<Zoologico> zoo) {
		super();
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	
	//
	//getting and setting
	//
	
	//nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//zoo
	public List<Zoologico> getZoo() {
		return zoo;
	}
	public void setZoo(List<Zoologico> zoo) {
		this.zoo = zoo;
	}
	
	//animales[]
	public static List<Animal> getAnimales() {
		return animales;
	}
	public static void setAnimales(List<Animal> animales) {
		Zona.animales = animales;
	}
	
	//
	//methods
	//
	
	//agregarAnimales
	public static void agregarAnimales(Animal animal) {
		Zona.animales.add(animal);
	}
	
	//cantidadAnimales
	public static int cantidadAnimales() {
		return Zona.animales.size();
	}
	
	
	
	

}
