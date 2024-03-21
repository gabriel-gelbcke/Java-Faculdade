import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Boolean menu = true;
        int opcao;
        double a, b;
        double conta;

        System.out.print("\033[H\033[2J");

        while (menu) {
            System.out.println(
                    "\nEscolha uma das opções \n" +
                            "1 - Soma \n" +
                            "2 - Subtração \n" +
                            "3 - Divisão \n" +
                            "4 - Multiplicação \n" +
                            "0 - Sair");

            opcao = in.nextInt();

            System.out.println("");

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor 1");
                    a = in.nextDouble();
                    System.out.println("Digite o valor 2");
                    b = in.nextDouble();
                    conta = a + b;
                    conta = Math.floor(conta * 100) / 100;
                    System.out.print("\033[H\033[2J");
                    System.out.println("A soma é: " + conta);
                    break;
                case 2:
                    System.out.println("Digite o valor 1");
                    a = in.nextDouble();
                    System.out.println("Digite o valor 2");
                    b = in.nextDouble();
                    conta = a - b;
                    conta = Math.floor(conta * 100) / 100;
                    System.out.print("\033[H\033[2J");
                    System.out.println("A subtração é: " + conta);
                    break;
                case 3:
                    System.out.println("Digite o valor 1");
                    a = in.nextDouble();
                    System.out.println("Digite o valor 2");
                    b = in.nextDouble();
                    conta = a / b;
                    conta = Math.floor(conta * 100) / 100;
                    System.out.print("\033[H\033[2J");
                    System.out.println("A divisão é: " + conta);
                    break;
                case 4:
                    System.out.println("Digite o valor 1");
                    a = in.nextDouble();
                    System.out.println("Digite o valor 2");
                    b = in.nextDouble();
                    conta = a * b;
                    conta = Math.floor(conta * 100) / 100;
                    System.out.print("\033[H\033[2J");
                    System.out.println("A multiplicação é: " + conta);
                    break;
                case 0:
                    System.out.print("\033[H\033[2J");
                    menu = false;
                    break;
            }

        }
    }

}
