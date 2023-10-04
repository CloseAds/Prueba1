import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Introduce el nº de pizzas ");
        int numeroPizzas;
        numeroPizzas = entrada.nextInt();
        System.out.println(" Introduce el nº de amigos ");
        int numeroAmigos;
        numeroAmigos = entrada.nextInt();
        System.out.println(" Introduce el nº de porciones de cada pizza ");
        int numeroPorciones;
        numeroPorciones = entrada.nextInt();
        System.out.println(" Cuantas porciones toca a cada amigo? ");
        System.out.println( (numeroPorciones* numeroPizzas)/ numeroAmigos);
        System.out.println(" cuantas porciones sobran? ");
        System.out.println(" no tengo ni idea ");
    }

}
