import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int base;
        int altura;
        int area;

        System.out.println("ingrese el valor de la base");
        base= lector.nextInt();

        System.out.println("ingrese el valor de la altura");
        altura= lector.nextInt();

        area = (base * altura)/2;

        System.out.println("el area del triangulo es:"+" "+area);



    }
}
