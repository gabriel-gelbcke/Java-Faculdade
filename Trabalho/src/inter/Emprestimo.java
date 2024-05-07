package inter;

import java.time.LocalDate;

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;

    public Emprestimo(Usuario usuario, Livro livro, LocalDate dataDevolucaoPrevista) {
        LocalDate hoje = LocalDate.now();
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = hoje;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(LocalDate dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    @Override
    public String toString() {
        return "\nEmprestimo [" +
        "usuario=" + usuario + 
        ", livro=" + livro + 
        ", dataEmprestimo=" + dataEmprestimo + 
        ", dataDevolucaoPrevista=" + dataDevolucaoPrevista + "";
    }
}

