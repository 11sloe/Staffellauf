
public class Abschluss extends Listenelement
{

    public Abschluss()
    {
    }

    public void listeAusgeben()
    {
        //tue nichts
    }

    public Listenelement hintenEinfuegen(Laeufer person)
    {
       Knoten k = new Knoten(person);
       k.setNaechster(this);
        return k;
    }

    public void laufen(int laenge)
    {}

    public void einzelgeschwindigkeitAusgeben(int laenge)
    {}

    public double gesamtlaufzeitGeben()
    {
        return 0;
    }

    public int anzahlGeben()
    {
        return 0;
    }

}
