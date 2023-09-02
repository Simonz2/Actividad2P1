import java.util.Scanner;

public class POOER12{
    public static void main(String[] arg){
        String name;
        int het,hee8;
        double salario;

        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introdusca el nombre del trabajador:");

        //introduccion por teclado del nombre del trabajador
        name=entrada.nextLine();//atribuir el nonbre a la variable name
        
        System.out.println("Ingrese el numero de horas trabajadas:");
        int nht=entrada.nextInt();//numero de horas trabajadas
        entrada.nextLine();

        System.out.println("Ingrese el valor normal de la hora trabajada");
        double vhn=entrada.nextDouble();//valor hora normal de trabajo

        entrada.close();
        //inicio de ciclos if
        if(nht>40){//verificar si trabajo mas de 40 horas
            het=nht-40;//calcular las horas extras trabajadas
            
            if(het>8){//verificar si trabajo mas de 8 horas extras
               hee8= het-8;//calculo de horas extras mayores a 8 horas extras
               salario=40*vhn+16*vhn+hee8*3*vhn;//calculo salario
            
            }
            else{//si las horas extras no son mayores a 8
                salario=40*vhn+het*2*vhn;//calculo del salario
            }

        }
        else{//sino trabajo mas de 40 horas
            salario=nht*vhn;//calcuo del salario
        }
        System.out.println("El trabajador " + name + " devengo "
        + salario);//imprimir la salida del programa

        
    }
}