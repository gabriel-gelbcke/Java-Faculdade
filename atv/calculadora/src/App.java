import java.util.Scanner;
import java.lang.Math;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double valor1, valor2, resultado;
        Boolean menu = true;
        int opcao, par, cod1, cod2, ipi, qtd1, qtd2;
        int vetor[] = {1,2,3,4,5,6,7,8,9,10};

        while (menu) {
            System.out.println(
                    "escolha uma das ações \n" +
                            "1 - soma \n" +
                            "2 - subtração \n" +
                            "3 - multiplicação \n" +
                            "4 - divisão \n" +
                            "5 - potenciação \n" +
                            "6 - fatoração \n" +
                            "7 - pares e impares \n" +
                            "8 - calculo de ipi \n" +
                            "0 - sair \n");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("digite o valor 1: ");
                    valor1 = entrada.nextDouble();
                    System.out.println("digite o valor 2: ");
                    valor2 = entrada.nextDouble();

                    if (valor1 < 0 || valor1 > 50 || valor2 < 0 || valor2 > 50) {
                        break;
                    }
                    resultado = valor1 + valor2;
                    System.out.println("resultado: " + resultado);
                    break;
                case 2:
                    System.out.println("digite o valor 1: ");
                    valor1 = entrada.nextDouble();
                    System.out.println("digite o valor 2: ");
                    valor2 = entrada.nextDouble();

                    if (valor1 < 0 || valor1 > 50 || valor2 < 0 || valor2 > 50) {
                        break;
                    }
                    resultado = valor1 - valor2;
                    System.out.println("resultado: " + resultado);
                    break;
                case 3:
                    System.out.println("digite o valor 1: ");
                    valor1 = entrada.nextDouble();
                    System.out.println("digite o valor 2: ");
                    valor2 = entrada.nextDouble();

                    if (valor1 < 0 || valor1 > 50 || valor2 < 0 || valor2 > 50) {
                        break;
                    }
                    resultado = valor1 * valor2;
                    System.out.println("resultado: " + resultado);
                    break;
                case 4:
                    System.out.println("digite o valor 1: ");
                    valor1 = entrada.nextDouble();
                    System.out.println("digite o valor 2: ");
                    valor2 = entrada.nextDouble();

                    if (valor1 < 0 || valor1 > 50 || valor2 < 0 || valor2 > 50) {
                        break;
                    }
                    resultado = valor1 / valor2;
                    System.out.println("resultado: " + resultado);
                    break;
                case 5:
                    System.out.println("digite o valor 1: ");
                    valor1 = entrada.nextDouble();
                    System.out.println("digite o valor 2: ");
                    valor2 = entrada.nextDouble();

                    if (valor1 < 0 || valor1 > 50 || valor2 < 0 || valor2 > 50) {
                        break;
                    }
                    resultado = Math.pow(valor1, valor2);
                    System.out.println("resultado: " + resultado);
                    break;
                case 6:
                    System.out.println("digite o valor 1: ");
                    valor1 = entrada.nextDouble();
                    if (valor1 < 0 || valor1 > 50) {
                        System.out.println("valor invalido.");
                        continue;
                    }
                    resultado = 1;
                    for (int i = 2; i <= valor1; i++) {
                        if (valor1 % i == 0) {
                            resultado *= i;
                            valor1 /= i;
                        }
                    }
                    System.out.println("resultado: " + (valor1));
                    break;
                case 7:
                    System.out.println("Escolha 2 para exbir os numeros pares e 1 para os impares");

                    par = entrada.nextInt();
                    for (int v : vetor) {
                        if((v % 2) == 0 && par ==2){
                            System.out.println("Pares " + v);
                        }else if((v % 2) != 0 && par == 1){
                            System.out.println("Impares " + v);
                        }
                    }
                    break;
                case 8:
                    System.out.println("Digite o IPI");
                    ipi = entrada.nextInt();

                    System.out.println("Digite o códido do Produto 1");
                    cod1 = entrada.nextInt();
                    System.out.println("Digite a quantidade do Produto 1");
                    qtd1 = entrada.nextInt();
                    System.out.println("Digite o valor do Produto 1");
                    valor1 = entrada.nextFloat();

                    System.out.println("Digite o códido do Produto 2");
                    cod2 = entrada.nextInt();
                    System.out.println("Digite a quantidade do Produto 2");
                    qtd2 = entrada.nextInt();
                    System.out.println("Digite o valor do Produto 2");
                    valor2 = entrada.nextFloat();

                    System.out.println(
                        "Produto 1 " + cod1 + " Valor: " + valor1 + " Quantidade " + qtd1 +
                        "\nProduto 2 " + cod2 + " Valor: " + valor2 + " Quantidade " + qtd2 +
                        "\nTotal com IPI " + ipi + " = " + (((valor1 * qtd1) + (valor2 * qtd2)) * ipi)
                    );
                    break;
                case 0:
                    menu = false;
                default:
                    System.out.println("digite um valor correto");
                    break;
            }
        }
    }
}