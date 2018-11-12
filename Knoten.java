
public class Knoten extends Listenelement
{
    // Attribute
    private Laeufer inhalt;
    private Listenelement naechster;

    // Konstruktoren
    public Knoten(Laeufer inhalt_)
    {
        inhalt = inhalt_;
        naechster = null;
    }

    // Methoden
    public void listeAusgeben()
    {
        System.out.println(inhalt.datenGeben());
        naechster.listeAusgeben();
    }

    public void setNaechster(Listenelement elem)
    {
        naechster = elem;
    }

    public Listenelement naechsterGeben()
    {
        return naechster;
    }

    public Laeufer inhaltGeben()
    {
        return inhalt;
    }

    public Listenelement hintenEinfuegen(Laeufer person)
    {
        naechster = naechster.hintenEinfuegen(person);
        return this;
    }

    public void laufen(int laenge)
    {
        inhalt.laufen(laenge);
        naechster.laufen(laenge);
    }

    public void einzelgeschwindigkeitAusgeben(int laenge)
    {
        double v = 0;
        if (inhalt.laufzeitGeben()!= 0)
        {
            v = laenge / inhalt.laufzeitGeben();
        }
        System.out.println(inhalt.nameGeben() + " | " + v);
        naechster.einzelgeschwindigkeitAusgeben(laenge);
    }

    public double gesamtlaufzeitGeben()
    {
        return naechster.gesamtlaufzeitGeben() + inhalt.laufzeitGeben();
    }

    public int anzahlGeben()
    {
        return naechster.anzahlGeben() + 1;
    }
}
