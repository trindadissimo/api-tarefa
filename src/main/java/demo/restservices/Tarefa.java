package demo.restservices;

public class Tarefa {

    private int id;
    private String descricao;
    private boolean feita;

    // Constructors, getters, and setters

    public Tarefa(String string, boolean b) {
    }

    @Override
    public String toString() {
        return "Tarefa [id=" + id + ", descricao=" + descricao + ", feita=" + feita + "]";
    }

    public void setId(int i) {
    }

    public Integer getId() {
        return null;
    }
}
