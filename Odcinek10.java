class KontoAlpha
{
    String nazwa = "Tomek";
    int wiek = 25;
    double stanKonta = 31742.6;

    void wypisz()
    {
        System.out.println("Nazwa użytkownika: "+nazwa);
        System.out.println("Wiek użytkownika: "+wiek);
        System.out.println("Stan konta użytkownika: "+stanKonta);
    }

}

class KontoBeta extends KontoAlpha
{
    String dataWaznosci = "25.10.2020";

    void wypisz()
    {
        System.out.println("Nowa nazwa użytkownika: "+super.nazwa+"123");
        System.out.println("Data ważności konta użytkownika: "+dataWaznosci);
    }
}

class Prostokat
{
    int bok1,bok2;

    void wypisz()
    {
        System.out.println("Wymiar boku 1: "+bok1);
        System.out.println("Wymiar boku 2: "+bok2);
    }

    Prostokat(int bok1,int bok2)
    {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }
}

class Prostopadloscian extends Prostokat
{
    int bok3;

    Prostopadloscian(int bok1, int bok2, int bok3)
    {
        super(bok1,bok2);
        this.bok3 = bok3;
    }
    void wypisz()
    {
        super.wypisz();
        System.out.println("Wymiar boku 3: "+bok3);
    }
}



public class Odcinek10
{
    public static void main(String[] args)
    {
        Prostopadloscian p1 = new Prostopadloscian(3,4,10);
        p1.wypisz();
    }
}
