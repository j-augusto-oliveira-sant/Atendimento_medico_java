import java.util.Date;

public class Pessoa {
    private String nome;
    private Date Dtnasc;

    Pessoa(String nome, Date Dtnasc){
        this.nome = nome;
        this.Dtnasc = Dtnasc;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDtnasc() {
        return Dtnasc;
    }
    public void setDtnasc(Date Dtnasc) {
        this.Dtnasc = Dtnasc;
    }

    public int calcularIdade(){
        return 0;
    }

}
