import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Queue cola = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        int opt = 0;
        while (bandera) {
            System.out.println("Bienvenido a FastFood comida perros llaneros y algo mas!");
            System.out.println("Por favor selecciones nuestro menú ");
            System.out.println(" 1. Perro caliente \n 2. Hamburguesa \n 3. Perra \n 4. Salchipapas \n 5. no quiero nada");
            while (!sc.hasNextInt()) {
                System.out.println("Opcion no valida porfavor intente de nuevo....");
                sc.next(); // Limpiar el buffer
            }
            while (sc.nextInt() > 5 || sc.nextInt() < 1) {
                System.out.println("Pagina en mantenimiento, escoja una opcion valida");
                System.out.println(" 1. Perro caliente \n 2. Hamburguesa \n 3. Perra \n 4. Salchipapas \n 5. no quiero nada");

                while (!sc.hasNextInt()) {
                    System.out.println("Opcion no valida porfavor intente de nuevo....");
                    sc.next();     
                }
                sc.next(); // Limpiar el buffer
        
            }

            switch (opt) {
                case 1:

                break;
                case 5:
                System.out.println("No compraste nada");
                bandera = false;
                break;
                


                default:
                    break;
            }
        }
    }

}
