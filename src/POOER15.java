import java.util.Scanner;

public class POOER15 {
    public static void main(String[] args){
        //darle propiedades a las variables
        double pa,pb,pc,pd;

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

        System.out.println("Ingrese el peso de la esfera D:");
        entrada.nextLine();
        pd=entrada.nextDouble();//peso esfera D
        entrada.close();

        //ver que esfera es de diferente peso
        if((pa==pb)&&(pa==pc)){//ver si d es de peso diferente
            if(pd>pa){//pesa mas d?
                System.out.println("La esfera D es la diferente y pesa mas");
            }
            else{//pesa menos d?
                System.out.println("La esfera D es la diferente y pesa menos");
            }
        }
        else{//si de no es la diferente
            if((pa==pb)&&(pa==pd)){//ver si c es la diferente
                if(pc>pa){//c pesa mas
                    System.out.println("La esfera C es la diferente y pesa mas");
                }
                else{//c pesa menos
                    System.out.println("La esfera C es la diferente y pesa menos");
                }

            }
            else{
                if((pa==pc)&&(pa==pd)){//ver si b es la diferente
                    if(pb>pa){//b pesa mas
                        System.out.println("La esfera B es la diferente y pesa mas");
                    }
                    else{//b pesa menos
                        System.out.println("La esfera B es la diferente y pesa menos");
                    }
                }

                else{
                    if(pa>pb){
                        System.out.println("La esfera A es la diferente y pesa mas");
                    }
                    else{
                        System.out.println("La esfera A es la diferente y pesa menos");
                    }
                }
        }

    }
}
}
