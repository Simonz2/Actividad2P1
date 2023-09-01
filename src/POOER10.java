import java.util.Scanner;

public class POOER10 {
        public static void main(String[] args){

            //dar propiedades a las variables  
            int ni, es;
            double pt,pm;
            String name;

            //imprimir, recibir por teclado y 
            //asignar los valores a las variables
            System.out.println("Ingrese el  numero "+ 
            "de inscripcion:");
            Scanner entrada= new Scanner(System.in);
            ni=entrada.nextInt();//numero de inscripcion
            

            System.out.println("Ingrese el nombre del "+
            "estudiante:");
            entrada.nextLine();
            name=entrada.nextLine();//nombre del estudiante

            System.out.println("Ingrese el patrimonio:");
            pt=entrada.nextDouble();//patrimonio
            
            System.out.println("Ingrese el estrato social:");
            entrada.nextLine();
            es=entrada.nextInt();//estrato social
            entrada.close();
            
            pm=50000;//pago por matricula

            //verificar el estrato y es patrimonio
            if( (pt>2000000) && (es>3) ){
                //si son mayor de 3 el estrato y
                // de 2000000 el patrimonio
                pm=pm+0.03*pt;//hacer la correcion a el pago
                //de matricula 

            }

            //mostrar salida
            System.out.println("El estudiante con numero de\ninscripcion: "+
            ni+" y nombre: \n"+name+" debe pagar: "+
            pm);






    }
}
