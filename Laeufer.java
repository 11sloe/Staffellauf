
/**
 *  Person
 */
public class Laeufer
{
    // Attribute
    private String name;
    private int position;
    private double laufzeit;

    // Konstruktor
    public Laeufer(String name_, int position_)
    {
        name = name_;
        position = position_;
        laufzeit = 0;
    }

    // Methoden
    public String datenGeben()
    {
        return name + " | " + position + " | " + laufzeit;
    }

    public String nameGeben()
    {
        return name;
    }

    public double laufzeitGeben()
    {
        return laufzeit;
    }

    public void laufen(int laenge)
    {
        
        laufzeit = laenge / 8.0 + 3 * Math.random();
    }

}
