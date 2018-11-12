
/**
 *  Liste für Personen
 */
public class Staffellauf
{
    // Attribute
    private Listenelement erster;
    private int laenge;

    // Konstruktor
    public Staffellauf(int laenge_)
    {
        erster = new Abschluss();
        laenge = laenge_;
    }

    public void hintenEinfuegen(Laeufer person)
    {
        erster = erster.hintenEinfuegen(person);
    }

    public void laeuferdatenAusgeben() 
    {
        erster.listeAusgeben();
    }

    public void laufen()
    {
        erster.laufen(laenge);
    }

    public void einzelgeschwindigkeitAusgeben()
    {
        erster.einzelgeschwindigkeitAusgeben(laenge);
    }

    public double gesamtlaufzeitGeben()
    {
        return erster.gesamtlaufzeitGeben();
    }

    public int anzahlGeben()
    {
        return erster.anzahlGeben();
    }

    public double durchschnittsgeschwindigkeitGeben()
    {
        return anzahlGeben() * laenge / gesamtlaufzeitGeben();
    }

}