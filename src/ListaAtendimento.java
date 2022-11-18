import java.util.ArrayList;
import java.util.List;

public class ListaAtendimento {
    List<Atendimento> atendimentos = new ArrayList<Atendimento>();

    ListaAtendimento(ArrayList<Atendimento> atendimentos){
        this.atendimentos = atendimentos;
    }

    public void addLista(ArrayList<Atendimento> atendimentos){
        this.atendimentos = atendimentos;
    }

    public void mostrarLista(){
        for (Atendimento atendimento: atendimentos){
            System.out.println(atendimento);
        }
    }
}
