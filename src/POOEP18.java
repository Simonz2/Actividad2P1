import java.util.Scanner;

public class POOEP18 {
    public static void main(String[] args) throws Exception {

        //propiedades de las variables
        int ce,nhtm;
        String name;
        double vht,salariob,salarion,prf;

        //Se procede a imprimir en pantalla, recibir una entrada 
        //por teclado y asignar la entrada a una variable

        //imprimir y  recibir por teclado el codigo del empleado
        System.out.println("Ingrese el codigo del empleado:");
        Scanner entrada = new Scanner(System.in);
        ce=entrada.nextInt();

        System.out.println("Ingrese el nombre del empleado:");
        entrada.nextLine();
        name=entrada.nextLine();//nombre del empleado

        System.out.println("Ingrese el numero de horas trabajadas al mes:");
        //entrada.nextLine();
        nhtm=entrada.nextInt();//numero de horas trabajadas

        System.out.println("Ingrese el valor de la hora trabajada");
        entrada.nextLine();
        vht=entrada.nextDouble();//valor de la hora trabajada

        System.out.println("Ingrese el porcentaje de retencion en la fuente:");
        entrada.nextLine();
        prf=entrada.nextDouble();//porcentaje de retencion en la fuente

        entrada.close();

        //Se calculara el salario bruto y el salario neto
        salariob=vht*nhtm;//salaario bruto
        salarion=salariob-(salariob*prf/100);//salario neto

        //Imprimir las salidas
        System.out.println("El codigo de empleado es: " + 
        ce + " con nombre: " + name + "\ntiene salario bruto: " + salariob + 
        " y salario neto: " + salarion);

    }
}