import java.util.Scanner;

public class POOER11 {
    public static void main(String[] args){
        //propiedades a las variables
        int n1,n2,n3,mayor;

        //imprimir, recibir por teclado
        // asignar a las variables los valores
        System.out.println("Ingrese el valor del primer numero:");
        Scanner entrada=new Scanner(System.in);
        n1=entrada.nextInt();//primer numero
        
        System.out.println("Ingrese el valor del segundo numero:");
        entrada.nextLine();
        n2=entrada.nextInt();//segundo numero

        System.out.println("Ingrese el valor del tercer numero:");
        entrada.nextLine();
        n3=entrada.nextInt();//tercer numero
        entrada.close();

        //Inicio algoritmo
        if ((n1>n2)&& (n1>n3)){
            //verificar si n1 es el mayor
            mayor=n1;
        }
        else if(n2>n3){
            //verificar si n2 es el mayor
            mayor=n2;
        }
        else{
            //verificar si n3 es el mayor
            mayor=n3;
        }

        //imprimir la salida del programa
        System.out.println("El valor del mayor entre: "+
        n1+" , "+n2+" y "+n3+
        " es: "+mayor);



    }
}
