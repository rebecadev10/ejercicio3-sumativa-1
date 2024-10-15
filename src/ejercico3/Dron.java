package ejercico3;

public class Dron {
//	creamos nuestros atributos privados
	private String fabricante;
	private String nombre;
	private int numeroHelices;
	public Dron(String fabricante, String nombre,int numeroHelices) {
		// TODO Auto-generated constructor stub
		this.fabricante=fabricante;
		this.nombre=nombre;
		this.numeroHelices=numeroHelices;
		
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroHelices() {
		return numeroHelices;
	}
	public void setNumeroHelices(int numeroHelices) {
		this.numeroHelices = numeroHelices;
	}
}
