/**
 * 
 */
package ejercicio001;

import java.util.Scanner;

/**
 * @author 1
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String hablar;
		String Frase;
		String nombre;
		String ladrar;
		Scanner teclado =new Scanner (System.in);
		System.out.println("usuario.ingrese el nombre de su perro");
		nombre=teclado.next();
		System.out.println("ingrese a la ferocidad del perro");
		ladrar=teclado.next();
				
		Perro cain= new Perro ("Cain","fiero");
		
		Perro dog= new Perro ("Firulai","manso");
		System.out.println("El perro fiero ladra: "+cain.ladrar());
		
        
        
        
		System.out.println("que desea decir el loro");
		Frase=teclado.next();
		
	    Loro lorito;
	    
		
		Loro Lorito = new Loro();
		System.out.println("lorito dice: "+Lorito.hablar(""));
		
		
		
		
		Pinguino pingui= new Pinguino ("Adela");
		System.out.println(pingui.toString());
		System.out.println(cain.toString());
		System.out.println(dog.toString());

	}

}
