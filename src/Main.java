import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double num1;
        double num2;
        double resultado;

        System.out.println("///////////////////");
       
        System.out.println("ingrese un numero");
        num1= lector.nextDouble();

        System.out.println("ingrese otro numero");
        num2= lector.nextDouble();

        resultado = (num1 + num2);

        System.out.println("la suma de los dos numero es:"+" "+resultado);

    }
}
