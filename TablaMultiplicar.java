import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        int numero;
        System.out.print("Introduce un número para ver su tabla de multiplicar: ");
        numero = lectura.nextInt();

        for (int i = 1; i <= 12; i++) {
           
            System.out.println(numero + " x " + i + " = " + (numero * i));
           
        }
    }
}