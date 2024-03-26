import java.util.Random;

public class Jogador{

    public String nome;
    public int pontuacao;
    public int numbatalha;
    public int nivel;

    // public Jogador(){}

    //se for privado:
    // private int nivel;
    // public void setNivel(int setNivel){
    //     this.nivel = nivel;
    // }

    public void batalha(Jogador oponente){
        Random aleatorio = new Random();
        int myForca = this.nivel * 10 + aleatorio.nextInt(20);
        int forcaOpon = oponente.nivel * 10 + aleatorio.nextInt(20);

        if(myForca > forcaOpon){
            System.out.println(this.nome + " venceu contra: " + oponente.nome);
        }else if(forcaOpon < myForca){
            System.out.println(oponente.nome + " venceu contra: " + this.nome);
        }else {
            if (this.pontuacao > oponente.pontuacao) {
                System.out.println(this.nome + " venceu a batalha contra " + oponente.nome + " por pontuação");
            } else if (this.pontuacao < oponente.pontuacao) {
                System.out.println(oponente.nome + " venceu a batalha contra " + this.nome + " por pontuação");
            } else {
                if (this.numbatalha > oponente.numbatalha) {
                    System.out.println(this.nome + " venceu a batalha contra " + oponente.nome + " por número de batalhas");
                } else {
                    System.out.println(oponente.nome + " venceu a batalha contra " + this.nome + " por número de batalhas");
                }
            }
        }
    }

    public void attpontuacao(int pontos){
        this.pontuacao += pontos;
    }

    public void subirnivel(){
        this.nivel++;
    }

    public void exibirinfo(){
        System.out.println(" Nome: " + nome + " pontuação: " + pontuacao + " numero de batalhas: " + numbatalha + " nivel: " + nivel);
    }
}