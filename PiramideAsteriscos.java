import java.util.Scanner;
/**
 Ejemplo:
Introduce el numero de filas de la piramide: 5
Resultado:
    *
   ***
  *****
 *******
*********
 */
public class PiramideAsteriscos {
   public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        System.out.print("Introduce el número de filas de la pirámide: ");
        int filas = lectura.nextInt();

        // Generar la pirámide
        for (int i = 1; i <= filas; i++) {
            // Imprimir espacios para centrar los asteriscos
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Pasar a la siguiente línea después de imprimir una fila
            System.out.println();
        }
    }
}