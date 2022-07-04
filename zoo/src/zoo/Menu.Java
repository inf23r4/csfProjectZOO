import java.util.Scanner;

public class Menu {

    public static void Menu_Principal() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Digite el numero del Habitad que desea visitar:\n1. Aves\n2. Anfibios\n3. Mamiferos\n4. Peces\n5. Reptiles");
        int opcion = userInput.nextInt();
        switch (opcion) {
            case 1:
                //Metodo que imprime Animales en el habitad de Aves
                System.out.println("Lista de aves\n");
                Menu_Opciones();
                break;
            case 2:
                //Metodo que imprime Animales en el habitad de Anfibios
                System.out.println("Lista de anfibios\n");
                Menu_Opciones();
                break;
            case 3:
                //Metodo que imprime Animales en el habitad de Mamiferos
                System.out.println("Lista de mamiferos\n");
                Menu_Opciones();
                break;
            case 4:
                //Metodo que imprime Animales en el habitad de Peces
                System.out.println("Lista de peces\n");
                Menu_Opciones();
                break;
            case 5:
                //Metodo que imprime Animales en el habitad de Repitles
                System.out.println("Lista de reptiles\n");
                Menu_Opciones();
                break;

            default:
                System.out.println("Error: Ingrese un valor valido\n");
                Menu_Principal();
                break;

        }
    }
    public static void Menu_Opciones (){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Digite el numero de la opcion deseada:\n1. Regresar al menu principal\n2. Imprimir Lista\n3. Enviar lista por correo");
        int opcion = userInput.nextInt();
        switch (opcion){
            case 1:
                Menu_Principal();
                break;
            case 2:
                //metodo para imprimir lista
                break;
            case 3:
                //metodo para enviar por correo
                break;
            default:
                System.out.println("Error: Ingrese un valor valido\n");
                Menu_Opciones();
        }

    }
}
