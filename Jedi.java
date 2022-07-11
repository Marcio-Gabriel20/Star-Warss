import java.util.ArrayList;

public class Jedi implements Force {

    private String nome, titulo;
    ArrayList<Weapon> armas = new ArrayList<Weapon>();

    public Jedi() {

    }

    public Jedi(String nome, String titulo) {

        this.nome = nome;
        this.titulo = titulo;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void mindControl() {
        System.out.println("[Jedi]: Do what I wish");
    }

    @Override
    public void farseeing() {
        System.out.println("[Jedi]: Prevendo...");
    }

    @Override
    public void telepath() {
        System.out.println("[Jedi]: Teleportando...");
    }

    @Override
    public void levitation() {
        System.out.println("[Jedi]: Levitating Something");
    }

    public void patience() {
        System.out.println("[Jedi]: Pacienciente...");
    }

    public void lightning() {
        System.out.println("[Jedi]: Shuzzzz...");
    }

    public void drop(Weapon arma) {
        armas.remove(arma);
        for (Weapon a : armas) {
            System.out.println("[Jedi]: Dropou " + a.getDescricao());
        }
    }

    public void pickUp(Weapon arma) {
        armas.add(arma);
        for (Weapon a : armas) {
            System.out.println("[Jedi]: Pegou " + a.getDescricao());
        }
    }

}
