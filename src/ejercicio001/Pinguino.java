/**
 * 
 */
package ejercicio001;

/**
 * @author 1
 *
 */
public class Pinguino extends Animal{
	
	private String nombre;

	
	
	/**
	 * @param nombre
	 */
	public Pinguino(String nombre) {
		super();
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Pinguino [nombre=" + nombre + "]";
	}
	
	
}
