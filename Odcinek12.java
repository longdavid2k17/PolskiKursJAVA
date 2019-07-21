interface Zwierze
{
    int wiek=0;

    void pokazNazwe();
    void WydajOdglos();
}

interface SuperZwierze
{

}

class Pies implements Zwierze, SuperZwierze
{
    String nazwa;
    String odglos;
    Pies(String nazwa,String odglos)
    {
        this.nazwa = nazwa;
        this.odglos = odglos;
    }

    @Override
    public void pokazNazwe()
    {
        System.out.println(nazwa+" | WIEK: "+wiek);
    }

    @Override
    public void WydajOdglos()
    {
        System.out.println("HAU HAU");
    }
}

class Kot implements Zwierze
{
    String nazwa;

    Kot(String nazwa)
    {
        this.nazwa = nazwa;
    }
    @Override
    public void pokazNazwe()
    {
        System.out.println(nazwa);
    }

    @Override
    public void WydajOdglos()
    {
        System.out.println("MIAU MIAU");
    }
}









public class Odcinek12
{
    public static void main(String[] args)
    {
        Pies p1 = new Pies("Azor", "wof");
        p1.pokazNazwe();
        p1.WydajOdglos();

        Kot k1 = new Kot("Filemon");
        k1.pokazNazwe();
        k1.WydajOdglos();
    }
}
