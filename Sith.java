import java.util.ArrayList;

public class Sith implements Force {

    private String nome, titulo;
    ArrayList<Weapon> armas = new ArrayList<Weapon>();

    public Sith() {

    }

    public Sith(String nome, String titulo) {

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
        System.out.println("[Sith]: Do what I wish");
    }

    @Override
    public void farseeing() {
        System.out.println("[Sith]: Prevendo...");
    }

    @Override
    public void telepath() {
        System.out.println("[Sith]: Teleportando...");
    }

    @Override
    public void levitation() {
        System.out.println("[Sith]: Levitating Something");
    }

    public void drop(Weapon arma) {
        armas.remove(arma);
        for (Weapon a : armas) {
            System.out.println("[Sith]: Dropou " + a.getDescricao());
        }
    }

    public void pickUp(Weapon arma) {
        armas.add(arma);
        for (Weapon a : armas) {
            System.out.println("[Sith]: Pegou " + a.getDescricao());
        }
    }

}
