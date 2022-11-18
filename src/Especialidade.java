public class Especialidade {
    private String descricao;

    Especialidade(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Especialidade{");
        sb.append("descricao='").append(descricao).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
