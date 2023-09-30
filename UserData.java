import java.util.Scanner;

public class UserData {
    public static void main(String[] args) {

    Scanner readname = new Scanner(System.in);

    System.out.println("Name:");
    String name = readname.nextLine();

    Scanner readage = new Scanner(System.in);

    System.out.println("Age:");
    int age = readage.nextInt();

    Scanner readweight = new Scanner(System.in);

    System.out.println("Weight:");
    float weight = readweight.nextFloat();

    System.out.printf("Name: %s\nAge: %x\nWeight: %.1f", name, age, weight);

    }
}