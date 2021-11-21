package gestion;
import zooAnimales.Animal;
import java.util.*;

public class Zona {
	private  String nombre;
	private Zoologico zoo;
	private List<Animal> animales = new ArrayList<Animal>();
	
	public Zona() {
		
	}
	
	//constructor
	public Zona(String nombre, Zoologico zoo) {
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
	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	//animales[]
	public List<Animal> getAnimales() {
		return animales;
	}
	public void setAnimales(List<Animal> animales) {
		this.animales = animales;
	}
	
	//
	//methods
	//
	
	//agregarAnimales
	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
	}
	
	//cantidadAnimales
	public int cantidadAnimales() {
		return this.animales.size();
	}
	
	
	
	

}
