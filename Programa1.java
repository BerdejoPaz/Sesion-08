
package Programas;

/**
 Crear un programa en Java que permitan ingresar n sueldos. Visualizar total y el promedio de los sueldos.
Por ejemplo:
ns=3
sueldo1=1000
sueldo2=2000
sueldo3=3000
Resultados:
ts=6000
ps=2000
 */
import java.util.Scanner;
public class Programa1 {
        public static void main(String args[]) {
            Scanner lectura = new Scanner(System.in);
            //Declarar Variable
            int n, i;
            double sueldo,ts,ps;
        
        // Solicitar la cantidad de sueldos
        System.out.print("Ingrese la cantidad de sueldos: ");
        n = lectura.nextInt();
        
        // Variables para almacenar el total y los sueldos
        ts = 0;
        
        // Bucle para ingresar y sumar los sueldos
        for (i = 1; i <= n; i++) {
            System.out.print("Ingrese el sueldo " + i + ": ");
            sueldo = lectura.nextDouble();
            ts += sueldo;
        }
        
        // Calcular el promedio de los sueldos
        ps = ts / n;
        
        // Mostrar los resultados
        System.out.println("Total de sueldos (ts): " + ts);
        System.out.println("Promedio de sueldos (ps): " + ps);
            //Declarar Variables
            
        }
    
}
