package practica4entornos;

import java.util.Scanner;

public class programaPráctica_4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("¿Quién ha gando este año el balón de oro?");
		String nombre=sc.nextLine();
		System.out.println("Indica el año");
		int año=sc.nextInt();
	
		
		
		System.out.println("Lista de los últimos 10 ganadores del balón de oro");
		System.out.println("Ganador del Balón de Oro: Lionel Messi (2015)\r\n"
				+ "Ganador del Balón de Oro: Cristiano Ronaldo (2016)\r\n"
				+ "Ganador del Balón de Oro: Cristiano Ronaldo (2017)\r\n"
				+ "Ganador del Balón de Oro: Luka Modric (2018)\r\n"
				+ "Ganador del Balón de Oro: Lionel Messi (2019)\r\n"
				+ "Ganador del Balón de Oro: Lionel Messi (2021)\r\n"
				+ "Ganador del Balón de Oro: Karim Benzema (2022)\r\n"
				+ "Ganador del Balón de Oro: Lionel Messi (2023)\r\n"
				+ "Ganador del Balón de Oro: Rodri (2024)\r\n"
				+ "Ganador del Balón de Oro: "+ " " + nombre+" "+ año);
	}

}
