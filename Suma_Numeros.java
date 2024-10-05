import java.util.Scanner;
/**
 Ejemplo:
Introduce un numero: 12
Resultado:
La Suma de los primeros 12 numeros es : 78
 */
public class Suma_Numeros {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        int n,suma;
        System.out.print("Introduce un número: ");
        n = lectura.nextInt();
        suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("La suma de los primeros " + n + " numeros es: " + suma);
    }
}