package inside;

public class Aluno {

    private String NomeAluno;
    private int IdadeAluno;
    private double Nota1;
    private double Nota2;
    private double Media;
    private String Resultado;

    //// NomeAluno////
    public String getNomeAluno() {

        return NomeAluno;
    }

    public void setNomeAluno(String NomeAluno) {

        this.NomeAluno = NomeAluno;
    }

    //// IdadeAluno////
    public int getIdadeAluno() {

        return IdadeAluno;
    }

    public void setIdadeAluno(int IdadeAluno) {

        this.IdadeAluno = IdadeAluno;
    }

    //// Nota1////
    public double getNota1() {

        return Nota1;
    }

    public void setNota1(double Nota1) {

        this.Nota1 = Nota1;
    }

    //// Nota2////
    public double getNota2() {

        return Nota2;
    }

    public void setNota2(double Nota2) {

        this.Nota2 = Nota2;
    }

    //// CalcularMedia////
    public double getMedia() {

        return Media;
    }

    //// CalcularMedia////
    public String getResultado() {

        return Resultado;
    }

    public void CalcularMedia(double Nota1, double Nota2) {

        this.Media = (Nota1 + Nota2) / 2;
        if (this.Media >= 7) {
            this.Resultado = "aprovado";
        } else if (this.Media >= 2) {
            this.Resultado = "na prova final";
        } else {
            this.Resultado = "reprovado";
        }
    }
}
