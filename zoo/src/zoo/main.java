package zoo;

import java.util.Scanner;

public class main {
	public static void main(String[]arg) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.print("1) Ingresar como Visitante");
		System.out.print("2) ingresar como Empleado");
		numero = entrada.nextInt();
		switch(numero) {
		case 1:
            System.out.println("tal");
            break;
		case 2:
            System.out.println("tal");
            break;
		default:
            System.out.println("numero incorrecto");
        }
	}
}
