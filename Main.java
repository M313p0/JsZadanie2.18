import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Как тебя зовут?");
        String name = in.nextLine();
        System.out.println("Привет, " + name);
    }
}