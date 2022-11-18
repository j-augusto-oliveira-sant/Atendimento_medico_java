public class Atestado {
    private int cid;

    public void emitirAtestado(Atendimento atendimento){
        System.out.println(atendimento.paciente+"doente");
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
