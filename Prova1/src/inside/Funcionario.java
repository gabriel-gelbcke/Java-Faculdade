package inside;

public class Funcionario {

    private String NomeFuncionario;
    private int SalarioFuncionario;
    private String CargoFuncionario;
    private Double Imposto;

    //// NomeFuncionario////
    public String getNomeFuncionario() {

        return NomeFuncionario;
    }

    public void setNomeFuncionario(String NomeFuncionario) {

        this.NomeFuncionario = NomeFuncionario;
    }

    //// SalarioFuncionario////
    public int getSalarioFuncionario() {

        return SalarioFuncionario;
    }

    public void setSalarioFuncionario(int SalarioFuncionario) {

        this.SalarioFuncionario = SalarioFuncionario;
    }

    //// CargoFuncionario////
    public String getCargoFuncionario() {

        return CargoFuncionario;
    }

    public void setCargoFuncionario(String CargoFuncionario) {

        this.CargoFuncionario = CargoFuncionario;
    }

    //// CalcularImposto////
    public Double getImposto() {

        return Imposto;
    }

    public void CalcularImposto(int SalarioFuncionario) {

        if (SalarioFuncionario <= 1500) {
            this.Imposto = SalarioFuncionario * 0.05;
        } else {
            this.Imposto = SalarioFuncionario * 0.10;
        }
    }
}
