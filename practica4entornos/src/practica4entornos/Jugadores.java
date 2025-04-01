package practica4entornos;

public class Jugadores {
	String nombre;
	int añoGanador;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAñoGanador() {
		return añoGanador;
	}
	public void setAñoGanador(int añoGanador) {
		this.añoGanador = añoGanador;
	}
	public Jugadores(String nombre, int añoGanador) {
		
		this.nombre = nombre;
		this.añoGanador = añoGanador;
	}
	
	

}
