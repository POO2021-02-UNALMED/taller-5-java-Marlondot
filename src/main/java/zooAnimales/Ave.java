package zooAnimales;
import java.util.*;


public class Ave extends Animal{
	private static List<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero,String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		Ave.listado.add(this);
	}
	
	//
	//setting and getting
	//
	
	public static List<Ave> getListado() {
		return listado;
	}
	public static void setListado(List<Ave> listado) {
		Ave.listado = listado;
	}
	
	public static int getHalcones() {
		return halcones;
	}
	public static void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}
	
	public static int getAguilas() {
		return aguilas;
	}
	public static void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	//
	//methods
	//
	
	public static int cantidadAves() {
		return Ave.listado.size();
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public static void crearHalcon(String nombre, int edad, String genero) {
		new Ave(nombre,  edad,  "montanas", genero, "cafe glorioso");
		Ave.halcones+=1;
	}
	
	public static void crearAguila(String nombre, int edad, String genero) {
		new Ave(nombre,  edad,  "montanas", genero, "blanco y amarillo");
		Ave.aguilas+=1;
	}
	
	

}
