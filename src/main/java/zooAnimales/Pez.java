package zooAnimales;
import java.util.*;

public class Pez extends Animal{
	private static List<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	//constructor
	public Pez() {
		super();
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		Pez.listado.add(this);
	}
	
	//
	//getting and setting
	//

	public static List<Pez> getListado() {
		return listado;
	}
	public static void setListado(List<Pez> listado) {
		Pez.listado = listado;
	}

	public static int getSalmones() {
		return salmones;
	}
	public static void setSalmones(int salmones) {
		Pez.salmones = salmones;
	}

	public static int getBacalaos() {
		return bacalaos;
	}
	public static void setBacalaos(int bacalaos) {
		Pez.bacalaos = bacalaos;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	//
	//methods
	//
	
	public static int cantidadPeces() {
		return Pez.listado.size();
	}
	
	@Override
	public String movimiento() {
		return "nadar";
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez.salmones+=1;
		return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez.bacalaos+=1;
		return new Pez(nombre, edad, "oceano", genero, "gris", 6);
	}
	
	
	
	
	

}
