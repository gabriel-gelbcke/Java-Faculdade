package inter;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public List<Contato> getContato() {
        return contatos;
    }

    public void setContato(List<Contato> contato) {
        this.contatos = contato;
    }

    public void adicionarContato(Contato newContato) {
        if (buscarContato(newContato.getNome()) == null) {
            contatos.add(newContato);
            System.out.println(newContato.getNome() + " adicionado com sucesso!");
        } else {
            System.out.println(newContato.getNome() + " já existe na agenda.");
        }
    }

    public void removerContato(Contato newContato) {
        if (buscarContato(newContato.getNome()) != null) {
            contatos.remove(newContato);
            System.out.println(newContato.getNome() + " removido com sucesso!");
        } else {
            System.out.println(newContato.getNome() + " não existe na agenda.");
        }
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        if (contatos.size() == 0) {
            return "Não ha contatos na agenda!";
        } else {
            return "Agenda: " + contatos;
        }

    }
}