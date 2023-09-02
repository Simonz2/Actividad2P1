import java.util.Scanner;

public class POOEP23 {
    public static void main(String[] args){
        //darle propiedades a las variables
        Double a,b,c,s1,s2,delta;

        //imprimir, recibir por teclado y asignar el
        //valor de las variables
        System.out.println("Ingrese el valor de A:");
        Scanner entrada=new Scanner(System.in);
        a=entrada.nextDouble();//valor de A

        System.out.println("Ingrese el valor de B:");
        entrada.nextLine();
        b=entrada.nextDouble();//valor de B

        System.out.println("Ingrese el valor de C:");
        entrada.nextLine();
        c=entrada.nextDouble();//valor de C
        entrada.close();

        //calcular las soluciones de la ecuacion
        delta=(b*b)-(4*a*c);
        if(delta>0){//si lo de dentro de la raiz es positivo
            s1=(-b+Math.sqrt(delta))/(2*a);//primera solucion
            s2=(-b-Math.sqrt(delta))/(2*a);//segunda solucion
            System.out.println("las soluciones son:\n"+
            s1+"\n"+s2);
        }
        else if(delta==0){//si lo de dentro de la raiz es cero
            s1=-b/(2*a);//primera solucion
            s2=-b/(2*a);//segunda solucion
            System.out.println("las soluciones son:\n"+
            s1+"\n"+s2);
        }
        else{//si la solucion es imaginaria
            //la solucion es una combinacion de s1 y s2
            s1=-b/(2*a);
            s2=Math.sqrt(-delta)/(2*a);
            System.out.println("las soluciones complejas son:\n"+
            s1+"+"+s2+"i\n"+s1+"-"+s2+"i");
        }
        
        
    }
}
