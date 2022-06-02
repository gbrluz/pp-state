package states;

public class Teste {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Gabriel");
        Paciente paciente2 = new Paciente("Mateus");
        Paciente paciente3 = new Paciente("Lucas");

        System.out.println(paciente.getState());
        System.out.println(paciente.agendarConsulta());
        System.out.println(paciente.getState());
        System.out.println(paciente.agendarConsulta());
        System.out.println(paciente.desmarcar());
        System.out.println(paciente.getState());

        paciente.setState(new InadimplenteState(paciente));
        System.out.println(paciente.getState());
        System.out.println(paciente.agendarConsulta());
    }
}
