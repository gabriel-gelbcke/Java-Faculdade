public class Funcao {
    public static void PI(){
        double pi = 3.14;
        System.out.println("PI = " + pi);
    }

    public static void Fatorial(long x){
        long conta = x;
        System.out.print(x + "! = ");
        for (long i = x; i > 0; i--) {
            if(i != 1){
                conta = conta*(i-1);
                System.out.print(i + " * ");
            }else{
                System.out.print(i + " = " + conta);
            }
        }
    }

    public static void Maior(int[] a){
        int maior = a[0];
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if(a[i] > maior){
                maior = a[i];
            }
            int num = a.length - 1;
            if(i == num){
                System.out.print(a[i]);
            }else{
                System.out.print(a[i]+ ", ");
            }
        }
        System.out.print("] ");
        System.out.println("Maior = " + maior);
    }

    public static void Float(float[] b){
        float soma = 0;
        System.out.print("[");
        for (int i = 0; i < b.length; i++) {
            soma = soma + b[i];

            int num = b.length - 1;
            if(i == num){
                System.out.print(b[i]);
            }else{
                System.out.print(b[i]+ ", ");
            }
        }
        System.out.print("] ");
        System.out.println("Soma = " + soma);
    }

    public static void Dados(String nome, String sobreNome, int ddd, int telefone){
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobreNome);
        System.out.println("DDD: " + ddd);
        System.out.println("Telefone: " + telefone);
    }
}