import java.io.*;

class Samochod implements Serializable
{
    String marka;
    String model;
    int pojemnoscSilnika;

    public Samochod(String marka, String model, int pojemnoscSilnika)
    {
        setMarka(marka);
        setModel(model);
        setPojemnoscSilnika(pojemnoscSilnika);

        try
        {
            ObjectOutputStream wyjscie = new ObjectOutputStream(new FileOutputStream("zapisObiektu.bin"));
            wyjscie.writeObject(this);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public String getMarka()
    {
        return marka;
    }

    public void setMarka(String marka)
    {
        this.marka = marka;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getPojemnoscSilnika()
    {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(int pojemnoscSilnika)
    {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", pojemnoscSilnika=" + pojemnoscSilnika +
                '}';
    }
}

class peugeot extends Samochod
{
    String znaczekModelu = "Lew";

    public peugeot( String model, int pojemnoscSilnika)
    {
        super("Peugeot", model, pojemnoscSilnika);
    }

    @Override
    public String toString()
    {
        return "peugeot " + '\'' + ", model='" + model + '\'' +
                ", pojemnoscSilnika=" + pojemnoscSilnika +
                ", znaczekModelu='" + znaczekModelu + '\'' +
                '}';
    }
}

class Kontener
{
    private Object kopiaSamochodu;

    public Kontener(Object pierwowzor)
    {
        this.kopiaSamochodu = pierwowzor;
    }

    public Object getKopiaSamochodu()
    {
        return kopiaSamochodu;
    }
}

public class Odcinek15
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        Samochod matiz = new Samochod("Daewoo","Matiz",1000);
        System.out.println(matiz.toString());

        //peugeot model206 = new peugeot("206",1400);
        //System.out.println(model206.toString());

        Kontener kontener = new Kontener(matiz);

        //Samochod superMatiz = (Samochod) kontener.getKopiaSamochodu();
        //System.out.println(superMatiz.toString());
        //System.out.println(matiz.equals(model206));

        Samochod AutoWejsciowe = null;
        try
        {
            ObjectInputStream wejscie = new ObjectInputStream(new FileInputStream("zapisObiektu.bin"));
            AutoWejsciowe = (Samochod) wejscie.readObject();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(AutoWejsciowe.toString());
    }
}
