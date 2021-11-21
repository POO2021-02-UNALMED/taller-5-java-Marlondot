package zooAnimales;
import java.util.*;

public class Mamifero extends Animal{
	private static List<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	//constructor
	public Mamifero() {
		super();
		Mamifero.listado.add(this);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		Mamifero.listado.add(this);
	}
	
	//
	//getting and setting
	//
	
	//Listado
	public static List<Mamifero> getListado() {
		return listado;
	}
	public static void setListado(List<Mamifero> listado) {
		Mamifero.listado = listado;
	}
	
	//caballos
	public static int getCaballos() {
		return caballos;
	}
	public static void setCaballos(int caballos) {
		Mamifero.caballos = caballos;
	}
	
	//leones
	public static int getLeones() {
		return leones;
	}
	public static void setLeones(int leones) {
		Mamifero.leones = leones;
	}
	
	//pelaje
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	//patas
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	
	//
	//methods
	//
	
	public static int cantidadMamiferos(){
		return Mamifero.listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero.caballos=Mamifero.caballos+1;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
		
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero.leones=Mamifero.leones+1;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
		
	}
	

}
