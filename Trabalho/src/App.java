import java.util.Scanner;

import inter.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Biblioteca biblio = new Biblioteca();

        boolean menu = true;
        Scanner in = new Scanner(System.in);
        int escolha1;

        biblio.cadastrarUsuarioManual("Gabriel", "123456", "Rua Flores", "ga@gmail.com");
        biblio.cadastrarUsuarioManual("Luisa", "654321", "Rua Marte", "lu@gmail.com");

        biblio.cadastrarLivroRomanceManual(1, "Dom Casmurro", "Machado de Assis", 1899, 12, "Romance", "Realismo");
        biblio.cadastrarLivroTerrorManual(2, "O Exorcista", "William Peter", 1971, 15, "Terror", "Possessão");

        while(menu){
            System.out.println("Olá, o que busca?\n" + 
            "1 - Cadastrar Usuario\n" + 
            "2 - Cadastrar Livro\n" + 
            "3 - Pesquisar Livros\n" +
            "4 - Emprestar Livro\n" +
            "5 - Devolver Livro\n" +
            "6 - Listar Usuarios\n" +
            "7 - Listar Livros\n" +
            "8 - Listar Emprestimos\n" +
            "9 - Listar Relatorios\n" +
            "0 - Sair");
            escolha1 = in.nextInt();
            in.nextLine();

            switch (escolha1) {
                case 1:
                    System.out.println("Digite o nome do usuario:");
                    String usuarioNome = in.nextLine();
                    System.out.println("Digite o telefone do usuario:");
                    String usuarioTelefone = in.nextLine();
                    System.out.println("Digite o enreceço do usuario:");
                    String usuarioEndereco = in.nextLine();
                    System.out.println("Digite o email do usuario:");
                    String usuarioEmail = in.nextLine();

                    Usuario user = new Usuario(usuarioNome, usuarioTelefone, usuarioEndereco, usuarioEmail);
                    biblio.cadastrarUsuario(user);
                    break;

                case 2:
                    System.out.println("Que tipo de livro deseja cadastrar?\n" +
                    "1 - Terror\n" +
                    "2 - Romance");
                    int escolha4 = in.nextInt();

                    System.out.println("Digite o codigo do livro:");
                    int livroCodigo = in.nextInt();
                    in.nextLine();
                    System.out.println("Digite o titulo do livro:");
                    String livroTitulo = in.nextLine();
                    System.out.println("Digite o autor do livro:");
                    String livroAutor = in.nextLine();
                    System.out.println("Digite o ano de publicação do livro:");
                    int livroAno = in.nextInt();
                    in.nextLine();
                    System.out.println("Digite o numero de exemplares disponíveis:");
                    int livroExem = in.nextInt();
                    in.nextLine();

                    if(escolha4 == 1){
                        String livroCategoria = "Terror";
                        System.out.println("Que tipo de Terror?");
                        String livroTipo = in.nextLine();

                        Livro livr = new LivroTerror(livroCodigo, livroTitulo, livroAutor, livroAno, livroExem, livroCategoria, livroTipo);
                        biblio.cadastrarLivro(livr);
                    }else if(escolha4 == 2){
                        String livroCategoria = "Romance";
                        System.out.println("Que tipo de Romance?");
                        String livroTipo = in.nextLine();

                        Livro livr = new LivroRomance(livroCodigo, livroTitulo, livroAutor, livroAno, livroExem, livroCategoria, livroTipo);
                        biblio.cadastrarLivro(livr);
                    }
                    break;

                case 3:
                    System.out.println("Digite o termo de busca:");
                    String procuraTitulo = in.nextLine();

                    System.out.println(biblio.pesquisarLivros(procuraTitulo)); 
                    break;
                
                case 4:
                    System.out.println("Digite o nome do usuario que fará o emprestimo:");
                    String nomeEmprestimo = in.nextLine();
                    System.out.println("Digite o nome do livro que será emprestado:");
                    String nomeLivro = in.nextLine();
                    System.out.println("Digite o ano da devolução:");
                    int anoDevolucao = in.nextInt();
                    in.nextLine();
                    System.out.println("Digite o mês da devolução:");
                    int mesDevolucao = in.nextInt();
                    in.nextLine();
                    System.out.println("Digite o dia da devolução:");
                    int diaDevolucao = in.nextInt();
                    in.nextLine();

                    biblio.emprestarLivro(nomeEmprestimo, nomeLivro, LocalDate.of(anoDevolucao, mesDevolucao, diaDevolucao));
                    break;

                case 5:
                    System.out.println("Digite o nome do usuario que ira devolver:");
                    String nomeDevolucao = in.nextLine();
                    System.out.println("Digite o nome do livro que será devolvido:");
                    String nomeLivro2 = in.nextLine();
                    // in.nextLine();

                    biblio.devolverLivro(nomeDevolucao, nomeLivro2);
                    break;

                case 6:
                    System.out.println(biblio.listarUsuarios());
                    break;

                case 7:
                    System.out.println(biblio.listarLivros());
                    break;
                
                case 8:
                    System.out.println(biblio.listarEmprestimos());
                    break;

                case 9:
                    System.out.println(biblio.listarRelatorios());
                    break;

                case 0:
                    menu = false;
                    break;
            
                default:
                    System.out.println("Escolha fora do range!");
                    break;
            }
        }
        System.out.println("Até logo!");
        System.out.println(biblio.listarRelatorios());
        in.close();
    }
}
