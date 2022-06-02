package states;

public class Paciente {
    private String nome;
    private State state;


    public Paciente(String nome) {
        this.nome = nome;
        this.state = new AtivoState(this);
    }

    public String agendarConsulta() {
        return state.agendarConsulta();
    }

    public String agendarAvaliacao() {
        return state.agendarAvaliacao();
    }

    public String agendarCirurgia() {
        return state.agendarCirurgia();
    }

    public String desmarcar() {
        return state.desmarcar();
    }

    public String negociarDebitos() {
        return state.negociarDebitos();
    }


    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}



