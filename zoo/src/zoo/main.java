package zoo;

import java.util.Scanner;

public class main  extends Menu {
	public static void main(String[]arg) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bienvenido al Zoologico 'nombre'\n Ingrese su nombre: ");
		String nombreUsuario = entrada.nextLine();
		System.out.println("Ingrese su correo: ");
		String emailUsuario = entrada.nextLine();
		//Clear console

		Menu_principal();

	}
}
