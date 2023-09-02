import java.util.Scanner;
public class POOEP22 {
    public static void main(String[] args){
        //darle propiedades a las variables
        String name;
        Double sbh,nh,sa;

        //imprimir, recibir por teclado y asignar el
        //valor de las variables
        System.out.println("Ingrese el nombre del empleado:");
        Scanner entrada=new Scanner(System.in);
        name=entrada.nextLine();//nombre del empleado

        System.out.println("Ingrese el salario basico por hora:");
        //entrada.nextLine();
        sbh=entrada.nextDouble();//salario basico por hora

        System.out.println("Ingrese el numero de horas trabajadas:");
        entrada.nextLine();
        nh=entrada.nextDouble();//numero de horas trabajadas
        entrada.close();
        
        //calculo del salario
        sa=nh*sbh;

        //restricciones
        if (sa>450000){
            //si salario es mas de 450000
            System.out.println("El nombre del empleado es:\n"+
            name+ " y gana: "+sa);
        }
        else{//si no gana mas de 450000
            System.out.println("El nombre del empleado es:\n"+
            name);
        }
    }
}
