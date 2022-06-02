package states;

public abstract class State {
    Paciente paciente;
    Consulta consulta;

    State(Paciente paciente){
        this.paciente = paciente;
    }

    public abstract String agendarConsulta();
    public abstract String agendarAvaliacao();
    public abstract String agendarCirurgia();
    public abstract String desmarcar();
    public abstract String negociarDebitos();

}
