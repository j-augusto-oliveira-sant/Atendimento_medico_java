import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Medico extends Pessoa {
    private List<Especialidade> especialidades = new ArrayList<Especialidade>();

    Medico(String nome, Date Dtnasc, ArrayList<Especialidade> especialidades){
        super(nome,Dtnasc);
        this.especialidades = especialidades;
    }

    public List<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

}
