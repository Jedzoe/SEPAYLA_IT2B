import java.util.Scanner;

public class Activity1 {
    Scanner sc = new Scanner(System.in);

    public void userGreetings(){

        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Birth year: ");
        int byear = sc.nextInt();
        System.out.print("Enter gender: ");
        String gender = sc.next();

        System.out.println("========================================================");
        System.out.println("Hello "+name+" ! Welcome to Java");
        System.out.println("You were born in "+byear+" and your gender is "+gender);
        System.out.println("========================================================");
    }

}
