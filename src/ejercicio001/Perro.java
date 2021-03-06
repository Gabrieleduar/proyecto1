/**
 * 
 */
package ejercicio001;

/**
 * @author 1
 *
 */
public class Perro extends Animal{
	private String nombre;
	private String ferocidad;
	
	
	
	/**
	 * @param nombre
	 * @param ferocidad
	 */
	public Perro(String nombre, String ferocidad) {
		super();
		this.nombre = nombre;
		this.ferocidad = ferocidad;
	}



	public String ladrar(){
		String ladrido = " ";
		if(this.ferocidad.equals("fiero")){
			ladrido="GRRR";
		}
		if(this.ferocidad.equals("manso")){
			ladrido="GUAU";
		}
		return ladrido;
	}



	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", ferocidad=" + ferocidad + "]";
	}
	
	
	

}
