import java.util.Scanner;

public class POOEP19 {
    public static void main(String[] args){
        //Darle las propiedades a las variables
        double lado,perimetro,area,altura;

        //Imprimir, recibir por teclado y 
        //asignar la variable lado del triangulo
        System.out.println("Ingrese el"+
        " lado del triangulo equilatero:");
        Scanner entrada=new Scanner(System.in);
        lado=entrada.nextDouble();
        entrada.close();

        //Calculo de la altura
        altura=lado*Math.sqrt(3)/2;

        //Calculo del perimetro
        perimetro=3*lado;

        //Calculo del area
        area=altura*lado/2;

        //Imprimir las salidas
        System.out.println("El triangulo rectangulo de lado: "+
        lado+" tiene area: "+area+" ,perimetro: "
        +perimetro+" y altura: "+altura);

    }
}
