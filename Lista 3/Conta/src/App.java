import java.util.Scanner;

import inter.ContaBancaria;

public class App {
    public static void main(String[] args) throws Exception {
        boolean menu = true;
        Scanner in = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria("Ivete", 1, 10000);

        while(menu){

            System.out.printf("Olá %s, o que deseja fazer?\n", conta.getTutilar());
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver Saldo");
            System.out.println("0 - Sair");
            int escolha = in.nextInt();

            switch(escolha){
                case(1):
                System.out.println("Quanto deseja depositar?");
                conta.depositar(Double.parseDouble(in.next()));
                System.out.println();
                break;

                case(2):
                System.out.println("Quanto deseja sacar?");
                conta.sacar(Double.parseDouble(in.next()));
                System.out.println();
                break;

                case(3):
                conta.imprimir();
                System.out.println();
                break;

                case(0):
                menu = false;
                break;

                default:
                System.out.println("Não há essa opção!");
                break;
            }
        }
        in.close();
    }
}