package states;

public class AgendadoState extends State{

    AgendadoState(Paciente paciente) {
        super(paciente);
    }

    @Override
    public String agendarConsulta() {
        return (paciente.getNome()+", não foi possível agender sua consulta, você já possui algum procedimento marcado.");
    }

    @Override
    public String agendarAvaliacao() {
        return (paciente.getNome()+", não foi possível agender sua avaliação, você já possui algum procedimento marcado.");
    }

    @Override
    public String agendarCirurgia() {
        return (paciente.getNome()+", não foi possível agender sua cirurgia, você já possui algum procedimento marcado.");
    }

    @Override
    public String desmarcar() {
        paciente.setState(new AtivoState(paciente));
        return (paciente.getNome()+", seu procedimento foi desmarcado.");
    }

    @Override
    public String negociarDebitos() {
        return (paciente.getNome()+", você não possui nenhum débito conosco");
    }
}
