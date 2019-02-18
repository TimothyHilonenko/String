import java.util.Random;

public class Main
{
    public static String NameTranformation(String FirstName, String LastName)
    {
        Random rand = new Random();

        return FirstName.substring(0,1)  + LastName.substring(0,5) + rand.nextInt(100);
    }

    public static void main(String[] args)
    {
        System.out.println(NameTranformation("Timothy", "Hilonenko"));
        System.out.println(NameTranformation("Maria", "Hilonenko"));
    }
}