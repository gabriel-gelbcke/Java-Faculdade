public class App {
    public static void main(String[] args) throws Exception {
    int[] a = {15, 69, 55, 666, 250};
    float[] b = {15.05f, 69.43f, 55.13f, 66.66f, 25.09f};
    // float[] b = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};

    //// PI    
    Funcao.PI();
    
        System.out.println();

    //// FATORIAL
    Funcao.Fatorial(5);
        
        System.out.println();
        System.out.println();
        
    //// MAIOR
    Funcao.Maior(a);
    
        System.out.println();

    //// FLOAT
    Funcao.Float(b);

        System.out.println();

    Funcao.Dados("João", "Silva", 41, 12346543);

    }
}