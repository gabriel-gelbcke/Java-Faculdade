import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int[] num = new int[11];
        int escolha;
        
        for (int i = 1; i < num.length; i++){
            num[i] = i; 
        }

        for (int i = 1; i < num.length; i++){
            if(num[i] %2 == 0){
                System.out.println(num[i] + " - par");
            }
            if(num[i] %2 != 0){
                System.out.println(num[i] + " - impar");
            }
        }

        System.out.println();

        System.out.println("1 - Impares ou 2 - Pares?");
        escolha = in.nextInt();

        System.out.println();

        //Impares
        if(escolha == 1){ 
            for (int i = 1; i < num.length; i++){
                if(num[i] %2 != 0){
                    System.out.println(num[i]);
                }
            }

        //Pares
        }else if(escolha == 2){ 
            for (int i = 1; i < num.length; i++){
                if(num[i] %2 == 0){
                    System.out.println(num[i]);
                }
            }

        //Saida
        }else{ 
            System.out.println("1 ou 2 !!!");
        }
        in.close();
    }
}