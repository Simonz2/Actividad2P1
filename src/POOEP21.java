import java.util.Scanner;

public class POOEP21{
    public static void main(String[] args){
        
        //dar las propiedades a las variables
        double lado1,lado2,lado3,perimetro,semiperimetro,area;

        //Imprimir, recibir por teclado y 
        //asignar la variable lado del triangulo
        System.out.println("Ingrese el lado 1 del triangulo:");
        Scanner entrada=new Scanner(System.in);
        lado1=entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Ingrese el lado 2 del triangulo:");
        lado2=entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Ingrese el lado 3 del triangulo:");
        lado3=entrada.nextDouble();
        entrada.close();

        //calcular el perimetro del triangulo
        perimetro=lado1+lado2+lado3;

        //calcular el semiperimetro
        semiperimetro=perimetro/2;
        //calcular el area del triangulo
        //uso de la formula de heron
        area=0.25*Math.sqrt((lado1+lado2+lado3)*(lado2+lado3-lado1)*(lado1-lado2+lado3)*(lado1+lado2-lado3));

        System.out.println("El triangulo con lados:"+lado1+
        " , "+lado2+" y "+lado3+
        "\ntiene area: "+area+"\nperimero: "+perimetro+
        "\ny semiperimetro: "+semiperimetro);
    }
    
}
