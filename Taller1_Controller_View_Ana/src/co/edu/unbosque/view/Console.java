package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {

	private Scanner sc;

	public Console() {
		sc = new Scanner(System.in);
	}

	public int readInt() {
		return sc.nextInt();
	}

	public long readLong() {
		return sc.nextLong();
	}

	public float readFloat() {
		return sc.nextFloat();
	}

	public double readDouble() {
		return sc.nextDouble();
	}

	public char readChar() {
		return sc.next().charAt(0);
	}

	public String readWord() {
		return sc.next();
	}

	public String readWholeLine() {
		return sc.nextLine();
	}

	public void printInSameLine(String data) {
		System.out.print(data);
	}

	public void printWithNewLine(String data) {
		System.out.println(data);
	}

	public void showMenu() {
		printWithNewLine("Seleccione una opcion:");
		printWithNewLine("1. Aspirante.");
		printWithNewLine("2. Empleado.");
		printWithNewLine("3. Proveedor.");
		printWithNewLine("4. Salir.");
	}

	public void showBadSelection() {
		printWithNewLine("Invalido, intentelo de nuevo.");
	}

}
