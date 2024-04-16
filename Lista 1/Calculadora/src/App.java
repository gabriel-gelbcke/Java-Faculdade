import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean menu = true;
        int escolha;
        Scanner in = new Scanner(System.in);

        while(menu){
            System.out.println
            ("Escolha a operação:\n" + 
            "1 - Soma\n" + 
            "2 - Divisão\n" + 
            "3 - Subtração\n" + 
            "4 - Multiplicação\n" + 
            "5 - Potenciação\n" + 
            "0 - Sair");
            escolha = in.nextInt();

            switch (escolha) {
                case 1:
                    Contas.Soma();
                    break;

                case 2:
                    Contas.Divisao();
                    break;

                case 3:
                    Contas.Subtracao();
                    break;

                case 4:
                    Contas.Multiplicacao();
                    break;

                case 5:
                    Contas.Potenciacao();
                    break;

                case 0:
                    menu = false;
                    break;
            
                default:
                    System.out.println("Escolha fora do range!");
                    break;
            }
        }
    in.close();
    }
}
