package states;

public class Consulta {
    private Paciente paciente;
    private String dentista;

    public Consulta (Paciente paciente, String dentista){
        this.paciente = paciente;
        this.dentista = dentista;
    }

    public String getDentista (){
        return dentista;
    }



}
