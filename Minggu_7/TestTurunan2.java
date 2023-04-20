class Satu
{
    Satu(String S)
    {
        System.out.println ("satu......"+S);
    }
}

class Dua extends Satu
{
    Dua(String S)
    {
        super(S);
        System.out.println ("dua......");
    }
}


class Tiga extends Dua
{
    Tiga(String S)
    {
        super(S);
        System.out.println ("tiga......");
    }
}

class Empat extends Tiga
{
    Empat(String S)
    {
        super(S);
        System.out.println ("Empat......");
    }
}

public class TestTurunan2{
    public static void main (String[]args)
    {
        new Empat("Kiriman untuk mbah buyut ........ alfatihah");
    }
}