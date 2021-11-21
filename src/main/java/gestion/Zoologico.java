package gestion;
import java.util.List;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private static List<Zona> zonas;
	
	//constructor
	public Zoologico() {
		
	}
	
	public Zoologico(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
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
	
	//ubicacion
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	//zonas
	public static List<Zona> getZona() {
		return zonas;
	}
	public static void setZona(List<Zona> zonas) {
		Zoologico.zonas = zonas;
	}
	
	//
	//methods
	//
	
	//agregarZonas
	public static void agregarZonas(Zona zona) {
		Zoologico.zonas.add(zona);
	}
	
	//cantidadTotalAnimales
	public static double cantidadTotalAnimales(){
		int count=0;
		for(int i=0; i<Zoologico.zonas.size(); i++) {
			count= count + (Zoologico.zonas.get(i)).cantidadAnimales();
		}
		return count;
	}
		
	
	
	
	

}
