
class MojWatek implements Runnable
{
String nazwaWatku;
Thread thread;

    MojWatek(String nazwaWatku)
    {
        setNazwaWatku(nazwaWatku);
        thread = new Thread(this,nazwaWatku);
        thread.start();
    }

    @Override
    public void run()
    {
        System.out.println("Utworzono nowy watek o nazwie "+getNazwaWatku());

        try
        {
        System.out.println("Usypiamy wątek o nazwie "+getNazwaWatku());
        Thread.sleep(2500);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Watek o nazwie "+getNazwaWatku()+" zakonczyl prace!");
    }



    public String getNazwaWatku()
    {
        return nazwaWatku;
    }

    public void setNazwaWatku(String nazwaWatku)
    {
        this.nazwaWatku = nazwaWatku;
    }
}


public class Odcinek14
{

    public static void main(String[] args)
    {
        MojWatek watek1 = new MojWatek("Watek 1");
        MojWatek watek2 = new MojWatek("Watek 2");
        MojWatek watek3 = new MojWatek("Watek 3");
        MojWatek watek4 = new MojWatek("Watek 4");

        try {
            System.out.println("uspiamy watek główny!");
            Thread.sleep(4000);
            System.out.println("Watek glowny wznowil prace");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Watek glowny zakonczyl prace!");
    }
}
