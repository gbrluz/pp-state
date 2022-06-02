package states;

public class InativoState extends State{
    InativoState(Paciente paciente) {
        super(paciente);
    }

    @Override
    public String agendarConsulta() {
        return (paciente.getNome()+", como você está inativo, deve marcar uma nova avaliação");
    }

    @Override
    public String agendarAvaliacao() {
        paciente.setState(new AgendadoState(paciente));
        return (paciente.getNome()+", sua avaliação foi agendada.");
    }

    @Override
    public String agendarCirurgia() {
        return (paciente.getNome()+", como você está inativo, deve marcar uma nova avaliação");
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
