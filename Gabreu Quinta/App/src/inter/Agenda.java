package inter;

import java.util.List;

public class Agenda {

    private List<Contato> contato;

    public Agenda(List<Contato> contato) {
        this.contato = contato;
    }

    public Contato buscar(String nome) {
        for (int i = 0; i < contato.size(); i++) {
            if (contato.get(i).getNome().equals(nome)) {
                return contato.get(i);
            }
        }
        return null;
    }

    public void criarContato(Contato novoContato) {

        if (buscar(novoContato.getNome()) == null) {
            contato.add(novoContato);
        }
    }

    public void deletarContato(String nome) {

        if (buscar(nome) != null) {
            contato.remove(nome);
        }
    }

    public List<Contato> getContato() {
        return contato;
    }

    public void setContato(List<Contato> contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Agenda [contato=" + contato + "]";
    }

}