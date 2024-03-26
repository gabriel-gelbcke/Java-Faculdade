public class Main{

    public static void main(String[] args){

        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();
        Jogador j3 = new Jogador();
        Jogador j4 = new Jogador();
        Jogador j5 = new Jogador();

        j1.nome = "Roberto";
        j1.pontuacao = 10;
        j1.numbatalha = 3;
        j1.nivel = 5;

        j2.nome = "Carlos";
        j2.pontuacao = 5;
        j2.numbatalha = 2;
        j2.nivel = 3;

        j3.nome = "Alan";
        j3.pontuacao = 7;
        j3.numbatalha = 3;
        j3.nivel = 4;

        j4.nome = "Mateus";
        j4.pontuacao = 15;
        j4.numbatalha = 5;
        j4.nivel = 6;

        j5.nome = "Thiago";
        j5.pontuacao = 12;
        j5.numbatalha = 5;
        j5.nivel = 7;

        System.out.println("Batalhas:");
        j1.batalha(j2);
        j1.batalha(j3);
        j1.batalha(j4);
        j1.batalha(j5);

        j2.batalha(j3);
        j2.batalha(j4);
        j2.batalha(j5);

        j3.batalha(j4);
        j3.batalha(j5);

        j4.batalha(j5);

        System.out.println("\n");
        System.out.println("Informação dos jogadores: ");
        j1.exibirinfo();
        j2.exibirinfo();
        j3.exibirinfo();
        j4.exibirinfo();
        j5.exibirinfo();

    }
}