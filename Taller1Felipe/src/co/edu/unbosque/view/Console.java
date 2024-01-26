package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {

	private Scanner leer;

	public Console() {
		leer = new Scanner(System.in);
	}

	public int leerEntero() {
		return leer.nextInt();
	}

	public long leerLong() {
		return leer.nextLong();
	}

	public String leerLinea() {
		return leer.next();
	}

	public String leerAllLinea() {
		return leer.nextLine();
	}

	public boolean leerBoolean() {
		return leer.nextBoolean();
	}

	public double leerDouble() {
		return leer.nextDouble();
	}

	public float leerFloat() {
		return leer.nextFloat();
	}

	public char leerCharacter() {
		return leer.next().charAt(0);
	}

	public void quemarLinea() {
		leer.nextLine();
	}

	public void imprimirConSalto(String dato) {
		System.out.println(dato);
	}

	public void imprimirSinSalto(String dato) {
		System.out.print(dato);
	}
}

