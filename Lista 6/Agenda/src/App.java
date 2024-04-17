import inter.Agenda;
import inter.Contato;

public class App {
    public static void main(String[] args) throws Exception {
        Agenda agenda = new Agenda();
        Contato c1 = new Contato("Caiox", "41 9-12345678");
        Contato c2 = new Contato("Pedrox", "41 9-32165487");
        Contato c3 = new Contato("Felipox", "41 9-111222333");

        System.out.println(agenda);

        agenda.adicionarContato(c1);
        agenda.adicionarContato(c2);

        System.out.println(agenda);

        agenda.adicionarContato(c1);
        agenda.removerContato(c3);

        System.out.println(agenda);

        agenda.removerContato(c1);
        agenda.removerContato(c2);

        System.out.println(agenda);

    }
}
