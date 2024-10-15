//Ejercicio numero 3 drones Rebeca rodriguez CI:30.051.282 Programacion II UBA SAN ANTONIO DE LOS ALTOS
package ejercico3;

import java.util.Scanner;



public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
		 public static void main(String[] args) {
//			 creamos nuestro objeto con los atributos.
		Dron dron1=new Dron("Multicopteros","dr100923",4);
		Dron dron2=new Dron("Cuadricópteros","dr000023",4);
//		mostramos la informacion almacenada
		System.out.println("estos son los drones que estan registrados en el sistema: ");
		System.out.println("Dron 1:"+dron1.getNombre()+"   fabricante: "+dron1.getFabricante()+" numero de helices: "+ dron1.getNumeroHelices());
		System.out.println("Dron 2:"+dron2.getNombre()+"   fabricante: "+dron2.getFabricante()+" numero de helices: "+ dron2.getNumeroHelices());
		System.out.println("Cambiar fabricantes");
		
//		inicializamos la libreria scanner 
		
		Scanner scanner = new Scanner(System.in);
//		modificamos los fabricantes de los drones 
		System.out.println("Ingresa el nuevo fabricante para el dron1 ");
		String fabricante1=scanner.nextLine();
//		enviamos el nuevo valor 
		dron1.setFabricante(fabricante1);
		
//		repetimos los pasos
		System.out.println("Ingresa el nuevo fabricante para el dron2 ");
		String fabricante2=scanner.nextLine();
		dron2.setFabricante(fabricante2);
//		imprimimos los datos nuevamente
		System.out.println("Datos actualizados correctamente! ");
		System.out.println("Dron 1:"+dron1.getNombre()+" fabricante: "+dron1.getFabricante()+" numero de helices: "+ dron1.getNumeroHelices());
		System.out.println("Dron 2:"+dron2.getNombre()+"  fabricante: "+dron2.getFabricante()+" numero de helices: "+ dron2.getNumeroHelices());
		
		
		
		
	}

}
