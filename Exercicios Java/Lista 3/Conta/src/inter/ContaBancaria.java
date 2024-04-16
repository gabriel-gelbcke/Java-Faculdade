package inter;

public class ContaBancaria {
    private String tutilar;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String tutilar, int numeroConta, double saldo) {
        this.tutilar = tutilar;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public String getTutilar() {
        return tutilar;
    }
    public void setTutilar(String tutilar) {
        this.tutilar = tutilar;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double depositado) {
        this.saldo = saldo + depositado;

        System.out.println("Deposito efetuado.");
    }

    public void sacar(double sacado) {

        if(saldo < sacado){
            System.out.println("Não há esse valor na conta para ser sacado.");
        }else{
            this.saldo = saldo - sacado;
            System.out.println("Saque efetuado.");
        }

        
    }

    public void imprimir(){
        System.out.println("Saldo atual: " + saldo);
    }

    @Override
    public String toString() {
        return "ContaBancaria [tutilar=" + tutilar + ", numeroConta=" + numeroConta + ", saldo=" + saldo + "]";
    }
}
