import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Pessoa leia = new Pessoa();
        Blast bla = new Blast();
        Saber sbr = new Saber();
        ArrayList<Jedi> jedis = new ArrayList<Jedi>();
        ArrayList<Sith> siths = new ArrayList<Sith>();
        ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
        ArrayList<Weapon> armas = new ArrayList<Weapon>();

        leia.setNome("Leia");
        leia.setSobrenome("Organa");
        leia.setSexo('F');

        Pessoa luke = new Pessoa("Luke", "Skywalker", 'M');

        pessoa.add(luke);

        Jedi owk = new Jedi("Obi-Wan Kenobi", "Mestre");
        Sith dv = new Sith("Darth Vader", "Darth");

        jedis.add(owk);
        siths.add(dv);

        dv.mindControl();
        dv.levitation();
        System.out.println("\n");
        owk.mindControl();
        owk.levitation();

        Weapon sla = new Weapon("Sabre de luz azul", 20);
        Weapon slv = new Weapon("Sabre de luz vermelho", 20);
        Weapon bl = new Weapon("Blast laser", 15);

        armas.add(sla);
        armas.add(slv);
        armas.add(bl);

        dv.pickUp(slv);
        dv.pickUp(sbr);
        owk.pickUp(sla);
        owk.pickUp(bl);
        owk.pickUp(bla);

        ((Saber) dv.armas.get(1)).slash();
        ((Blast) owk.armas.get(2)).shot();

        owk.drop(bl);

    }
}
