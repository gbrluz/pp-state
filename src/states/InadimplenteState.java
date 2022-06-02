package states;

public class InadimplenteState extends State{
    InadimplenteState(Paciente paciente) {
        super(paciente);
    }

    @Override
    public String agendarConsulta() {
        return (paciente.getNome()+", não foi possível agendar sua consulta. Entre em contato para negociar seus débitos.");
    }

    @Override
    public String agendarAvaliacao() {
        return (paciente.getNome()+", não foi possível agendar sua avaliação. Entre em contato para negociar seus débitos.");
    }

    @Override
    public String agendarCirurgia() {
        return (paciente.getNome()+", não foi possível agendar sua cirurgia. Entre em contato para negociar seus débitos.");
    }

    @Override
    public String desmarcar() {
        return (paciente.getNome()+", você não possui nenhum procedimento agendado.");
    }

    @Override
    public String negociarDebitos() {
        paciente.setState(new AtivoState(paciente));
        return (paciente.getNome()+", você está sem débitos conosco.");
    }
}
