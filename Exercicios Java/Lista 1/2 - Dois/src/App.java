public class App {
    public static void main(String[] args) throws Exception {

        double IPI = 10;

        Produto produto1 = new Produto("Celular", 1, 1000, 20);
        Produto produto2 = new Produto("Notebook", 2, 3000, 5);

        double formula = ((produto1.getValor()*produto1.getQtd()) + (produto2.getValor()*produto2.getQtd())) * (IPI/100 + 1);

        System.out.printf("%.2f", formula);
    }
}