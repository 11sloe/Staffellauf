
public abstract class Listenelement
{

    public abstract void listeAusgeben();

    public abstract Listenelement hintenEinfuegen(Laeufer person);
    
    public abstract void laufen(int laenge);
    
    public abstract void einzelgeschwindigkeitAusgeben(int laenge);
    
    public abstract double gesamtlaufzeitGeben();
  
    public abstract int anzahlGeben();
}
