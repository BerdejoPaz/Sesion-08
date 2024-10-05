import java.util.Scanner;
/**
Crear un programa en Java que permita ingresar las ventas del primer semestre del año. Visualizar el total, promedio de venta y el mes con la venta mayor. 
Por ejemplo:
        Enero=100
        Febrero=200
        Marzo=300
        Abril=400
        Mayo=500
        Junio=600
Resultados:
        tv=2100
        pv=350
        mes=”Junio”
        vmy=600
*/
public class VentasSemestre {
    public static void main(String[] args) {
         Scanner lectura = new Scanner(System.in);
         //Declarando Variables
         double tv,vm,pv;
         int j,i,ventas;
         String meses=" ";
        // Variables para almacenar el total, la venta mayor y el índice del mes con la venta mayor
        tv = 0.0;
        vm = 0.0;
        j = 0;
        // Bucle for para ingresar las ventas, calcular el total y encontrar la venta mayor
        for (i = 1; i <= 6; i++) {
            System.out.print("Ingrese la  " + i + " °  ventas del semestre  : ");
            ventas = lectura.nextInt();
             // Sumar al total de ventas
            tv += ventas;
            // Encontrar la venta mayor
            if (ventas> vm) {
                vm = ventas;
                j = i;
            }
            switch (j) {
                case 1: meses="Enero";
                break;
                case 2: meses="Febrero";
                 break;
                case 3: meses="Marzo";
                 break;
                case 4: meses="Abril";
                 break;
                case 5: meses="Mayo";
                 break;
                case 6: meses="Junio";
                break;
            }
        }
                // Calcular el promedio de ventas
                pv = tv / 6;
         // Mostrar los resultados
        System.out.println("Total de ventas (tv): " + tv);
        System.out.println("Promedio de ventas (pv): " + pv);
        System.out.println("El mes con la mayor venta es: " + meses +" y asciende a " +vm);
        }
}