import java.util.Scanner;

public class POOEP24 {
    public static void main(String[] args){
        //darle propiedades a las variables
        double pa,pb,pc;

        //imprimir, recibir por teclado y asignar el
        //valor de las variables
        System.out.println("Ingrese el peso de la esfera A:");
        Scanner entrada=new Scanner(System.in);
        pa=entrada.nextDouble();//peso esfera A

        System.out.println("Ingrese el peso de la esfera B:");
        entrada.nextLine();
        pb=entrada.nextDouble();//peso esfera B

        System.out.println("Ingrese el peso de la esfera C:");
        entrada.nextLine();
        pc=entrada.nextDouble();//peso esfera C
        entrada.close();

        //ver que esfera es de mayor peso
        if((pa>pb)&&(pa>pc)){//ver si la esfera A es la mas pesada
            System.out.println("La esfera de mayor peso es la A");
        }
        else if(pb>pc){//ver si la esfera B es la mas pesada
          System.out.println("La esfera de mayor peso es la B");  
        }
        else if(pc>pb){//ver si la esfera C es la mas pesada
            System.out.println("La esfera de mayor peso es la C");
        }
        else{
            System.out.println("Las esferas son del mismo peso");
        }

    }
}
