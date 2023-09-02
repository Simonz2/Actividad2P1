import java.util.Scanner;

public class POOER13 {
    public static void main(String[] args){
        //darle propiedades a las variables
        double vc,vp,pd;//valor compra,valor pagar, porcentaje de descuento
        String cb;

        //imprimir, recibir por teclado y 
        //asignar los valores a las variables
        System.out.println("Ingrese el valor de la compra:");
        Scanner entrada =new Scanner(System.in);
        vc=entrada.nextDouble();//valor de la compra
        
        System.out.println("Ingrese el color de la bolita:");
        entrada.nextLine();
        cb=entrada.next();//color de la bolita
        entrada.close();

        //saber cual es el porcentaje de descuento
        if(cb.equalsIgnoreCase("BLANCO")){//verificar si color de bolita es blanco
            pd=0;//porcentaje de descuento
            
            }

        else if(cb.equalsIgnoreCase("VERDE")){//verificar si el color de la bolita es verde
            pd=10;//porcentaje de descuento
            
            }

        else if (cb.equalsIgnoreCase("AMARILLO")){//si color bolita es amarillo
            pd=25;//porcentaje de descuento
            
            }
        
        else if(cb.equalsIgnoreCase("AZUL")){//si color bolita azul
            pd=50;//porcentaje de descuento
            
            }

        else{//si no es los colores anteriores
            pd=100;//porcentaje de descuento
            
            }



        vp=vc-(pd*vc/100);//caculo de valor a pagar
        System.out.println("El cliente debe pagar: $"+vp);

    }   
}
