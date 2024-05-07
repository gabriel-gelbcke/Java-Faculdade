package inter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;   

public class Relatorio {
    private String horario;
    private String relatorio;
    

    public Relatorio(String relatorio) {
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormatada = data.format(formato);

        this.horario = dataFormatada;
        this.relatorio = relatorio;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public String toString() {
        return "\n[" + horario + "] " + relatorio + "";
    }
}
