import java.util.Scanner;

public class POOER7 {
   public static void main(String[] args){
    //darle propiedades a las variables
    double a,b;

    //imprimir,recibir entrada por teclado 
    //y asignar los valores a las variables
    System.out.println("Ingrese el valor de A:");
    Scanner entrada=new Scanner(System.in);
    a=entrada.nextDouble();//valor A
    entrada.nextLine();
    
    System.out.println("Ingrese el valor de B:");
    b=entrada.nextDouble();//valor B
    entrada.close();

    //hacer comparaciones de los valores de A y B
    if (a>b){//a mayor que b
        System.out.println("A es mayor que B");
    }
    else {
        if (a==b){//a igual a b
            System.out.println("A es igual a B");
        }
        else{//a menor que b
            System.out.println("A es menor que B");
        }
    }
   } 
}
