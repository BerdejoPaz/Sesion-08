import java.util.Scanner;
public class Personas2 {
    public static void main(String[] args){
        //declarar variables
        int i,np,cpsm,cpsf;
        double talla,tmy;
        String nombre,xnombre,sexo;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar la cantidad de personas:");
        np=lectura.nextInt();
        //proceso dee datos
        cpsm=0;
        cpsf=0;
        sexo="";
        tmy=0.0;
        nombre="";
        xnombre="";
        for(i=1;i<=np;i++){
           System.out.print("Ingresar nombre:");
           nombre=lectura.next();
           System.out.print("Ingresar sexo:");
           sexo=lectura.next();
           System.out.print("Ingresar talla:");
           talla=lectura.nextDouble();
           if(sexo.equals("m")){
               cpsm++;
           }else{
               cpsf++;
           }
           if(talla>tmy){
               tmy=talla;
               xnombre=nombre;
           }
        }
        //salida de datos
        System.out.println("Resultados");
        System.out.println("Cantidad de personas de sexo m:"+cpsm);
        System.out.println("Cantidad de personas de sexo f:"+cpsf);
        System.out.println(xnombre+" tienes la mayor talla:"+tmy);        
    }
}
