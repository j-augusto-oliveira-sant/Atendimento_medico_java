import java.util.Date;

public class Operacao {
    private Date inicio;
    private Date fim;

    Operacao(Date inicio,Date fim){
        this.inicio = inicio;
        this.fim = fim;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public Date tempoTotal(){
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Operacao{");
        sb.append("inicio=").append(inicio);
        sb.append(", fim=").append(fim);
        sb.append('}');
        return sb.toString();
    }
}
