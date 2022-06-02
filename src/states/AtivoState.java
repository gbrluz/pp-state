package states;

public class AtivoState extends State{

    AtivoState(Paciente paciente) {
        super(paciente);
    }

    @Override
    public String agendarConsulta() {
        paciente.setState(new AgendadoState(paciente));
        return (paciente.getNome()+", sua consulta foi agendada.");
    }

    @Override
    public String agendarAvaliacao() {
        paciente.setState(new AgendadoState(paciente));
        return (paciente.getNome()+", sua avaliação foi agendada.");
    }

    @Override
    public String agendarCirurgia() {
        paciente.setState(new AgendadoState(paciente));
        return (paciente.getNome()+", sua cirurgia foi agendada.");
    }

    @Override
    public String desmarcar() {
        paciente.setState(new AtivoState(paciente));
        return (paciente.getNome()+", seu procedimento foi desmarcado");
    }

    @Override
    public String negociarDebitos() {
        return (paciente.getNome()+", você não possui nenhum débito conosco");
    }
}
