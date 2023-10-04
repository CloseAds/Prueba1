import java.util.Scanner;

public class Ejercicio1 {
    public static void math(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c;
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();
        System.out.println((a * b) + c*((3-a)/(2*b)));

        System.out.println(((2 + a*b)/4)+(c+2));

        System.out.println();

    }

}

