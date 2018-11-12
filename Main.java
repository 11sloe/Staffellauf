
public class Main
{
    
    public static void main(String[] args)
    {
        Staffellauf staffel;

        // Aufstellen der Staffel   
        staffel = new Staffellauf(100);
        staffel.hintenEinfuegen(new Laeufer("Anna",1));
        staffel.hintenEinfuegen(new Laeufer("Barbara",2));
        staffel.hintenEinfuegen(new Laeufer("Claus",3));
        staffel.hintenEinfuegen(new Laeufer("Doris",4));
        staffel.hintenEinfuegen(new Laeufer("Erich",5));

        System.out.println("Die neue Staffel!");
        staffel.laeuferdatenAusgeben();
   
        // Simulation eines Laufs
        staffel.laufen();
        System.out.println("Nach dem Lauf:");
        staffel.laeuferdatenAusgeben();

        // Ausgabe der Geschwindigkeiten
        System.out.println("Die Geschwindigkeiten: ");
        staffel.einzelgeschwindigkeitAusgeben();

        // Ausgabe der Durchschnittsgeschwindigekeit
        System.out.println("Durchschnittsgeschwindigkeit " + staffel.durchschnittsgeschwindigkeitGeben());
    }
}