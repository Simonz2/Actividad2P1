import java.util.Scanner;

public class POOER14 {
    public static void main(String[] args){
        //darle propiedades a las variables
        Double vd1,vd2,vd3,salario,vt,pv,s1,s2,s3;

        //imprimir, recibir por teclado y asignar 
        //el valor a las variables
        System.out.println("Ingrese las ventas del departamento 1:");
        Scanner entrada=new Scanner(System.in);
        vd1=entrada.nextDouble();//ventas departamento 1
        
        System.out.println("Ingrese las ventas del departamento 2:");
        entrada.nextLine();
        vd2=entrada.nextDouble();//ventas departamento 2

        System.out.println("Ingrese las ventas del departamento 3:");
        entrada.nextLine();
        vd3=entrada.nextDouble();//ventas departamento 3

        System.out.println("Ingrese el salario de los vendedores:");
        entrada.nextLine();
        salario=entrada.nextDouble();//salario de los vendedores
        entrada.close();
        
        vt=vd1+vd2+vd3;//ventas totales
        pv=vt/3;//porcentaje de ventas equivalentes al 33% de las ventas totales

        //definir si se incrementan los salarios o no
        if(vd1>pv){//si las ventas del departamento 1 son mayores al 33% 
            //de las ventas totales
            s1=salario*1.2;//salario de los vendedores departamento 1

        }
        else{//si las ventas no son mayor al 33%
            s1=salario;//salario departamento 1
        }


        if(vd2>pv){//si las ventas del departamento 2 son mayores al 33% 
            //de las ventas totales
            s2=salario*1.2;//salario de los vendedores departamento 1

        }
        else{//si las ventas no son mayor al 33%
            s2=salario;//salario departamento 1
        
        }


        if(vd3>pv){//si las ventas del departamento 3 son mayores al 33% 
            //de las ventas totales
            s3=salario*1.2;//salario de los vendedores departamento 1

        }
        else{//si las ventas no son mayor al 33%
            s3=salario;//salario departamento 1
        
        }

        System.out.println("Salario vendedores depto 1: "+s1+
        "\nsalario vendedores depto 2: "+s2+
        "\nsalario vendedores depto 3: "+s3);

    }
    
}
