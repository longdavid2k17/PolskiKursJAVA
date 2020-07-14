package com.company;

class Osoba
{
    int wiek;

    Osoba(int wiek)
    {
        try
        {
            setWiek(wiek);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            setWiek(wiek*(-1));
        }
        finally
        {
            System.out.println("Wstawiona wartość : "+getWiek());
        }
        System.out.println("Wiek: "+getWiek());
    }

    public int getWiek()
    {
        return wiek;
    }

    public void setWiek(int wiek)
    {
        if(wiek<0)
        {
            throw new IllegalArgumentException("Nie można mieć ujemnego wieku!");
        }
        else
            this.wiek = wiek;
    }
}

public class Main
{
    public static void main(String[] args)
    {
	    Osoba osoba = new Osoba(-10);
    }
}











/*
if(wiek<0)
        {
            throw new IllegalArgumentException("Nie można mieć ujemnego wieku!");
        }
 */

/*
try
        {
            setWiek(wiek);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            setWiek(wiek*(-1));
        }
        finally
        {
            System.out.println("Wstawiona wartość : "+getWiek());
        }
 */