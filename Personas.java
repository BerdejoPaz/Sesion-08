import java.util.Scanner;
public class Personas {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        // Solicitar la cantidad de personas
        System.out.print("Ingrese la cantidad de personas: ");
        int n = lectura.nextInt();
        // Variables para contar personas de sexo masculino y femenino
            int cantidadHombres = 0;
            int cantidadMujeres = 0;
        // Variables para almacenar el nombre de la persona con la talla mayor y la talla mayor
        String nombreMayorTalla = "";
        double mayorTalla = 0;
        // Bucle for para ingresar los datos de cada persona
        for (int i = 1; i <= n; i++) {
            System.out.println("Persona " + i + ":");
       // Solicitar nombre
            System.out.print("Nombre: ");
            String nombre = lectura.next();
            // Solicitar sexo
            System.out.print("Sexo (M/F): ");
            char sexo = lectura.next().toUpperCase().charAt(0); // Convertir el sexo a mayúscula para evitar errores
          // Solicitar talla
            System.out.print("Talla: ");
            double talla = lectura.nextDouble();
          // Contar personas por sexo
            if (sexo == 'M') {
                cantidadHombres++;
            } else if (sexo == 'F') {
                cantidadMujeres++;
            }
          // Verificar si la talla es la mayor
            if (talla > mayorTalla) {
                mayorTalla = talla;
                nombreMayorTalla = nombre;
            }
        }
       // Mostrar resultados
        System.out.println("Cantidad de hombres: " + cantidadHombres);
        System.out.println("Cantidad de mujeres: " + cantidadMujeres);
        System.out.println("Persona con la mayor talla: " + nombreMayorTalla);
        System.out.println("Talla mayor: " + mayorTalla);
     }
}