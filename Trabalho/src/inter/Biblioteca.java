package inter;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;

public class Biblioteca{
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emprestimo> emprestimos;
    private ArrayList<Relatorio> relatorios;
    
    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        emprestimos = new ArrayList<>();
        relatorios = new ArrayList<>();
    }

    //// Usuario ////
    public void cadastrarUsuario(Usuario novoUsuario){
        if(buscarUsuario(novoUsuario.getNome()) == null){
            usuarios.add(novoUsuario);
            System.out.println("Usuario " + novoUsuario.getNome() + " cadastrado!");} else {System.out.println("Já existe um usuario com este nome!");}
            //Relatorio
            String relatorio = ("Usuario " + novoUsuario.getNome() + " foi cadastrado");
            Relatorio relato = new Relatorio(relatorio);
            relatorios.add(relato);
    }

    public void cadastrarUsuarioManual(String nome, String telefone, String endereco, String email){
        if(buscarUsuario(nome) == null){
            Usuario novoUsuario = new Usuario(nome, telefone, endereco, email);
            usuarios.add(novoUsuario);
            // System.out.println("Usuario " + novoUsuario.getNome() + " cadastrado!");
        } else {System.out.println("Já existe um usuario com este nome!");}
            //Relatorio
            String relatorio = ("Usuario " + nome + " foi cadastrado manualmente");
            Relatorio relato = new Relatorio(relatorio);
            relatorios.add(relato);
    }

    public Usuario buscarUsuario(String nomeUsuario){
        for (Usuario user : usuarios) {
            if (user.getNome().equalsIgnoreCase(nomeUsuario)) {return user;}} return null;
    }

    //// Livro ////
    public void cadastrarLivro(Livro novoLivro){
        if(buscarLivro(novoLivro.getTitulo()) == null){
            livros.add(novoLivro);
            System.out.println("Livro " + novoLivro.getTitulo() + " cadastrado!");} else {System.out.println("Já existe um livro com este titulo!");}
            //Relatorio
            String relatorio = ("Livro " + novoLivro.getTitulo() + " foi cadastrado");
            Relatorio relato = new Relatorio(relatorio);
            relatorios.add(relato);
    }

    public void cadastrarLivroTerrorManual(int codigo, String titulo, String autor, int anoPublicacao, int exemplaresDisponiveis, String categoria, String tipoTerror){
        if(buscarUsuario(titulo) == null){
            Livro novoLivro = new LivroTerror(codigo, titulo, autor, anoPublicacao, exemplaresDisponiveis, categoria, tipoTerror);
            livros.add(novoLivro);
            // System.out.println("Livro " + novoLivro.getTitulo() + " cadastrado!");
        } else {System.out.println("Já existe um livro com este titulo!");}
            //Relatorio
            String relatorio = ("Livro " + titulo + " foi cadastrado manualmente");
            Relatorio relato = new Relatorio(relatorio);
            relatorios.add(relato);
    }

    public void cadastrarLivroRomanceManual(int codigo, String titulo, String autor, int anoPublicacao, int exemplaresDisponiveis, String categoria, String tipoTerror){
        if(buscarUsuario(titulo) == null){
            Livro novoLivro = new LivroRomance(codigo, titulo, autor, anoPublicacao, exemplaresDisponiveis, categoria, tipoTerror);
            livros.add(novoLivro);
            // System.out.println("Livro " + novoLivro.getTitulo() + " cadastrado!");
        } else {System.out.println("Já existe um livro com este titulo!");}
            //Relatorio
            String relatorio = ("Livro " + titulo + " foi cadastrado manualmente");
            Relatorio relato = new Relatorio(relatorio);
            relatorios.add(relato);
    }

    public List<Livro> pesquisarLivros(String busca) {
        List<Livro> resultados = new ArrayList<>();

        try {
            int codigo = Integer.parseInt(busca);
            
            for (Livro livro : livros) {
                if (livro.getCodigo() == codigo) {
                resultados.add(livro);
                //Relatorio
                String relatorio = ("Livro " + livro.getTitulo() + " foi pesquisado por código");
                Relatorio relato = new Relatorio(relatorio);
                relatorios.add(relato);}
            }
        } catch (NumberFormatException e) {
            for (Livro livro : livros) {
                if (livro.getTitulo().equalsIgnoreCase(busca) || livro.getAutor().equalsIgnoreCase(busca) ||
                livro.getCategoria().equalsIgnoreCase(busca)){resultados.add(livro);
                //Relatorio
                String relatorio = ("Livro " + livro.getTitulo() + " foi pesquisado por texto");
                Relatorio relato = new Relatorio(relatorio);
                relatorios.add(relato);}
            }
        }
        if(resultados.size() == 0){System.out.print("Nada foi encontrado!");} return resultados;
    }

    public Livro buscarLivro(String titulo){
        for (Livro livro : livros) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)) {return livro;}} return null;
    }

    //// Emprestimo ////
    public void emprestarLivro(String nomeUsuarioEmprestimo, String nomeLivroEmprestimo, LocalDate dataDevolucao){
        if(buscarUsuario(nomeUsuarioEmprestimo) == null){
            System.out.println("Usuário não encontrado!"); 
        }else if(buscarLivro(nomeLivroEmprestimo) == null){
            System.out.println("Livro não encontrado!"); 
        }else{ 
            Usuario usuarioEmprestimo = buscarUsuario(nomeUsuarioEmprestimo);
            Livro livroEmprestimo = buscarLivro(nomeLivroEmprestimo);

            if(livroEmprestimo.getExemplaresDisponiveis() == 0){
            System.out.println("Livro sem estoque!"); 
        }else if(verificaEmprestimo(usuarioEmprestimo.getNome()) != null){
            System.out.println("Usuário já está emprestando um livro!"); 
        }else{
            Emprestimo emprestimo1 = new Emprestimo(usuarioEmprestimo, livroEmprestimo, dataDevolucao);
            int disponiveis = livroEmprestimo.getExemplaresDisponiveis();
            livroEmprestimo.setExemplaresDisponiveis(disponiveis - 1);
            emprestimos.add(emprestimo1);
            System.out.println("Emprestimo do livro '" + livroEmprestimo.getTitulo() + "' para o usuario " + usuarioEmprestimo.getNome() + " efetuado!"); 
            System.out.println("Exemplares disponíveis: " + livroEmprestimo.getExemplaresDisponiveis());
            //Relatorio
            String relatorio = ("Livro " + livroEmprestimo.getTitulo() + " foi emprestado por " + usuarioEmprestimo.getNome());
            Relatorio relato = new Relatorio(relatorio);
            relatorios.add(relato);}
        }
    }

    public void devolverLivro(String nomeUsuarioDevolucao, String nomeLivroDevolucao){
        if(buscarUsuario(nomeUsuarioDevolucao) == null){
            System.out.println("Usuário não encontrado!"); 
        }else if(buscarLivro(nomeLivroDevolucao) == null){
            System.out.println("Livro não encontrado!"); 
        }else{ 
            Usuario usuarioDevolucao = buscarUsuario(nomeUsuarioDevolucao);
            Livro livroDevolucao = buscarLivro(nomeLivroDevolucao);

            if(verificaEmprestimo(usuarioDevolucao.getNome()) == null){
            System.out.println("Usuário não emprestou nenhum livro!");
        }else{
            Emprestimo emprestimo = verificaEmprestimo(usuarioDevolucao.getNome());
            int disponiveis = livroDevolucao.getExemplaresDisponiveis();
            livroDevolucao.setExemplaresDisponiveis(disponiveis + 1);
            emprestimos.remove(emprestimo);
            System.out.println("Devolução do livro '" + livroDevolucao.getTitulo() + "' pelo usuario " + usuarioDevolucao.getNome() + " efetuada!"); 
            System.out.println("Exemplares disponíveis: " + livroDevolucao.getExemplaresDisponiveis());
            //Relatorio
            String relatorio = ("Livro " + livroDevolucao.getTitulo() + " foi devolvido por " + usuarioDevolucao.getNome());
            Relatorio relato = new Relatorio(relatorio);
            relatorios.add(relato);}
        }
    }

    public Emprestimo verificaEmprestimo(String nome){
        for (Emprestimo emprestimo : emprestimos) {
            Usuario verificado = emprestimo.getUsuario();
            if(verificado.getNome().equalsIgnoreCase(nome)) {return emprestimo;}} return null;
    }


    //// Listar ////
    public String listarUsuarios(){
        if(usuarios.size() == 0){
            return "Não há usuarios cadastrados!";} else {
            //Relatorio
            String relatorio = ("Usuarios foram listados");
            Relatorio relato = new Relatorio(relatorio);
            relatorios.add(relato);

            return "Usuarios " + usuarios;}
    }

    public String listarLivros(){
        if(livros.size() == 0){
            return "Não há livros cadastrados!";} else {
            //Relatorio
            String relatorio = ("Livros foram listados");
            Relatorio relato = new Relatorio(relatorio);
            relatorios.add(relato);
                
            return "Livros " + livros;}
    }

    public String listarEmprestimos(){
        if(emprestimos.size() == 0){
            return "Não há emprestimos feitos!";} else {
            //Relatorio
            String relatorio = ("Emprestimos foram listados");
            Relatorio relato = new Relatorio(relatorio);
            relatorios.add(relato);

            return "Emprestimos " + emprestimos;}
    }

    public String listarRelatorios(){
        if(relatorios.size() == 0){
            return "Não há relatorios feitos!";} else {return "Relatorios " + relatorios;}
    }

    @Override
    public String toString() {
        return "Biblioteca [livros=" + livros + ", usuarios=" + usuarios + ", emprestimos=" + emprestimos
                + ", relatorios=" + relatorios + "]";
    }
}