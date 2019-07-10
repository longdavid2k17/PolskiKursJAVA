class Matematyka
{
    static int mnozenie(int liczba1,int liczba2)
    {
        return liczba1*liczba2;
    }

    static double dzielenie(double liczba1,double liczba2)
    {
        return liczba1/liczba2;
    }

    static double Pi = 3.14;
}


public class Odcinek11
{
    static void PoleKola(int r)
    {
        System.out.println("Pole kola wynosi: "+Matematyka.Pi*(r*r));
    }
    public static void main(String[] args)
    {
        System.out.println(Matematyka.mnozenie(7,9));
        System.out.println(Matematyka.dzielenie(75.5,6));
        PoleKola(5);
    }
}
