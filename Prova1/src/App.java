import java.util.Scanner;
import inside.Produto;
import inside.Funcionario;
import inside.Aluno;
import inside.Disciplina;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Boolean menu = true;

        Produto produto1 = new Produto();
        produto1.setNomeProduto("Celular");
        produto1.setPrecoProduto(2000);
        produto1.setQtdProduto(5);

        Produto produto2 = new Produto();
        produto2.setNomeProduto("Notebook");
        produto2.setPrecoProduto(3000);
        produto2.setQtdProduto(2);

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNomeFuncionario("Carlos");
        funcionario1.setCargoFuncionario("Desenvolvedor");
        funcionario1.setSalarioFuncionario(3000);

        Aluno aluno1 = new Aluno();
        aluno1.setNomeAluno("Alex");
        aluno1.setIdadeAluno(17);
        aluno1.setNota1(2);
        aluno1.setNota2(2);

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNomeDisciplina("Historia");
        disciplina1.setNomeProfessor("Marcio");

        while (menu) {

            System.out.println("Qual atividade deseja ver? \n" +
                    "1 - Produto \n" +
                    "2 - Funcionario \n" +
                    "3 - Aluno \n" +
                    "0 - Sair");
            int escolha = in.nextInt();

            switch (escolha) {
                case 1:
                    AtvProduto(produto1, produto2);
                    break;
                case 2:
                    AtvFuncionario(funcionario1);
                    break;
                case 3:
                    AtvAluno(aluno1, disciplina1);
                    break;
                case 0:
                    menu = false;
            }
        }
    }

    static void AtvAluno(Aluno aluno1, Disciplina disciplina1) {
        System.out.println("");
        aluno1.CalcularMedia(aluno1.getNota1(), aluno1.getNota2());
        System.out.println("O aluno " + aluno1.getNomeAluno() + ", de " + aluno1.getIdadeAluno() + " anos, " +
                "está na disciplina de " + disciplina1.getNomeDisciplina() + " com o professor "
                + disciplina1.getNomeProfessor() + " e esta " + aluno1.getResultado() + ", com média de "
                + aluno1.getMedia());
        System.out.println();

        aluno1.setNota1(2);
        aluno1.setNota2(1);

        aluno1.CalcularMedia(aluno1.getNota1(), aluno1.getNota2());
        System.out.println("O aluno " + aluno1.getNomeAluno() + ", de " + aluno1.getIdadeAluno() + " anos, " +
                "está na disciplina de " + disciplina1.getNomeDisciplina() + " com o professor "
                + disciplina1.getNomeProfessor() + " e esta " + aluno1.getResultado() + ", com média de "
                + aluno1.getMedia());
        System.out.println();

        aluno1.setNota1(8);
        aluno1.setNota2(9);

        aluno1.CalcularMedia(aluno1.getNota1(), aluno1.getNota2());
        System.out.println("O aluno " + aluno1.getNomeAluno() + ", de " + aluno1.getIdadeAluno() + " anos, " +
                "está na disciplina de " + disciplina1.getNomeDisciplina() + " com o professor "
                + disciplina1.getNomeProfessor() + " e esta " + aluno1.getResultado() + ", com média de "
                + aluno1.getMedia());
        System.out.println();

    }

    static void AtvFuncionario(Funcionario funcionario1) {
        System.out.println("");
        funcionario1.CalcularImposto(funcionario1.getSalarioFuncionario());
        System.out.println("O funcionario se chama " + funcionario1.getNomeFuncionario() + ", Seu cargo é "
                + funcionario1.getCargoFuncionario() +
                " E seu salário é de " + funcionario1.getSalarioFuncionario());
        System.out.println("O funcionario deverá pagar " + funcionario1.getImposto() + " de imposto");

        funcionario1.setSalarioFuncionario(1400);

        System.out.println("");
        funcionario1.CalcularImposto(funcionario1.getSalarioFuncionario());
        System.out.println("O funcionario se chama " + funcionario1.getNomeFuncionario() + ", Seu cargo é "
                + funcionario1.getCargoFuncionario() +
                " E seu salário é de " + funcionario1.getSalarioFuncionario());
        System.out.println("O funcionario deverá pagar " + funcionario1.getImposto() + " de imposto");
        System.out.println("");

    }

    static void AtvProduto(Produto produto1, Produto produto2) {
        System.out.println("\nNa loja existem 2 produtos:");
        System.out.println(produto1.getNomeProduto() + " - Quantidade (" + produto1.getQtdProduto() + ")" +
                ", Valor: " + produto1.getPrecoProduto() + " reais");
        System.out.println(produto2.getNomeProduto() + " - Quantidade (" + produto2.getQtdProduto() + ")" +
                ", Valor: " + produto2.getPrecoProduto() + " reais");
        produto1.VenderProduto(4);
        produto2.VenderProduto(3);
        System.out.println("");

        if (produto1.getErro() == 0) {
            System.out.println("Foi vendido (" + produto1.getVendidos() + ") " + produto1.getNomeProduto());
        } else {
            System.out.println("Não foi possível vender (" + produto1.getVendidos() + ") " + produto1.getNomeProduto() +
                    " pois só possuem " + produto1.getQtdProduto() + " no estoque!");
        }

        if (produto2.getErro() == 0) {
            System.out.println("Foi vendido (" + produto2.getVendidos() + ") " + produto2.getNomeProduto());
        } else {
            System.out.println("Não foi possível vender (" + produto2.getVendidos() + ") " + produto2.getNomeProduto() +
                    " pois só possuem " + produto2.getQtdProduto() + " no estoque!");
        }
        System.out.println("");

        System.out.println(produto1.getNomeProduto() + " - Quantidade (" + produto1.getQtdProduto() + ")" +
                ", Valor: " + produto1.getPrecoProduto() + " reais");
        System.out.println(produto2.getNomeProduto() + " - Quantidade (" + produto2.getQtdProduto() + ")" +
                ", Valor: " + produto2.getPrecoProduto() + " reais");

        System.out.println("");
    }

}
