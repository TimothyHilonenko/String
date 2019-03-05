import java.util.Random;

public class Main
{
    private static String nameTranformation(String firstName, String lastName)
    {
        Random rand = new Random();

        return firstName.substring(0,1)  + lastName.substring(0,5) + rand.nextInt(100);
    }

    public static void main(String[] args)
    {
        System.out.println(nameTranformation("Timothy", "Hilonenko"));
        System.out.println(nameTranformation("Maria", "Hilonenko"));
    }
}