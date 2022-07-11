public class Weapon {

    private String descricao;
    private int dano;

    public Weapon() {

    }

    public Weapon(String descricao, int dano) {
        this.descricao = descricao;
        this.dano = dano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

}
