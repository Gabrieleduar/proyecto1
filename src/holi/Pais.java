/**
 * 
 */
package holi;

import java.util.Date;

/**  
 * @author 1
 *
 */
public class Pais {

	private String nombre;
	private Integer habitantes ;
	private Integer metrocuadrado;
	private Date fechaindependencia;
	/**
	 * @param nombre
	 * @param habitantes
	 * @param metrocuadrado
	 * @param fecha
	 */
	public Pais(String nombre, Integer habitantes, Integer metrocuadrado, Date fechaindpendencia) {
		this.nombre = nombre;
		this.habitantes = habitantes;
		this.metrocuadrado = metrocuadrado;
		this.fechaindependencia = fechaindependencia;
	}
	/**
	 * 
	 */
	public Pais() {
		
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the habitantes
	 */
	public Integer getHabitantes() {
		return habitantes;
	}
	/**
	 * @param habitantes the habitantes to set
	 */
	public void setHabitantes(Integer habitantes) {
		this.habitantes = habitantes;
	}
	/**
	 * @return the metrocuadrado
	 */
	public Integer getMetrocuadrado() {
		return metrocuadrado;
	}
	/**
	 * @param metrocuadrado the metrocuadrado to set
	 */
	public void setMetrocuadrado(Integer metrocuadrado) {
		this.metrocuadrado = metrocuadrado;
	}
	/**
	 * @return the fechaindependencia
	 */
	public Date getFechaydependencia() {
		return fechaindependencia;
	}
	/**
	 * @param fechaydependencia the fechaydependencia to set
	 */
	public void setFechaydependencia(Date fechaydependencia) {
		this.fechaindependencia = fechaydependencia;
	} 
	
	public String impresion(){
		return "el pais tiene "+this.nombre+" con la cantidad de habitantes "+this.habitantes+"los metros cuadrados:"+this.metrocuadrado+"la fecha de la independencia "+this.fechaindependencia; 
		
		
	}
	
	
	
	
	
	
}
