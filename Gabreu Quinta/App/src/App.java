import java.util.LinkedList;

import inter.Agenda;
import inter.Contato;

public class App {
    public static void main(String[] args) throws Exception {
        Contato novoContato = new Contato("Alex", "123");
        Contato novoContato2 = new Contato("Caio", "123");
        Agenda agenda = new Agenda(new LinkedList<>());

        agenda.criarContato(novoContato);
        agenda.criarContato(novoContato2);
        agenda.criarContato(new Contato("Caiox", "1234"));

        System.out.println(agenda);

        agenda.deletarContato(novoContato2.getNome());
        agenda.deletarContato("Caiox");

        System.out.println(agenda);
    }
}