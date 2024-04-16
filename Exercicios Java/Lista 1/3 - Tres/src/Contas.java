import java.util.Scanner;

public class Contas {

    public static void Soma(){
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro numero:");
        double a = in.nextDouble();

        System.out.print("Digite o primeiro segundo:");
        double b = in.nextDouble();

        double resultado = a + b;
        System.out.println("Resultado: " + resultado);
        System.out.println();
        System.out.println();
    }

    public static void Divisao(){
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro numero:");
        double a = in.nextDouble();

        System.out.print("Digite o primeiro segundo:");
        double b = in.nextDouble();

        double resultado = a / b;
        System.out.println("Resultado: " + resultado);
        System.out.println();
        System.out.println();
    }

    public static void Subtracao(){
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro numero:");
        double a = in.nextDouble();

        System.out.print("Digite o primeiro segundo:");
        double b = in.nextDouble();

        double resultado = a - b;
        System.out.println("Resultado: " + resultado);
        System.out.println();
        System.out.println();
    }

    public static void Multiplicacao(){
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro numero:");
        double a = in.nextDouble();

        System.out.print("Digite o primeiro segundo:");
        double b = in.nextDouble();

        double resultado = a * b;
        System.out.println("Resultado: " + resultado);
        System.out.println();
        System.out.println();
    }

    public static void Potenciacao(){
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro numero:");
        double a = in.nextDouble();

        System.out.print("Digite o primeiro segundo:");
        double b = in.nextDouble();

        double resultado = Math.pow(a , b);
        System.out.println("Resultado: " + resultado);
        System.out.println();
        System.out.println();
    }

}


