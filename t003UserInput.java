import java.util.Scanner;

public class t003UserInput {
    String name;

    public t003UserInput()
    {
        System.out.println("Please state your name for the record: \n");
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
    }

    public static void main(String[] args)
    {
        t003UserInput myObj = new t003UserInput();
        System.out.println("Welcome " + myObj.name);
    }
}
