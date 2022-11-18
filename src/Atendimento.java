public class Atendimento {
    private int prioridade;
    private int estado;

    protected Medico medico;
    protected Paciente paciente;

    Atendimento(int prioridade,int estado){
        this.prioridade = prioridade;
        this.estado = estado;
    }

    public void calculaPrioridade(boolean[] respostas){
        int verdadeiras = 0;
        for (boolean resposta: respostas){
            verdadeiras += 1;
        }
        setPrioridade(verdadeiras);
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
