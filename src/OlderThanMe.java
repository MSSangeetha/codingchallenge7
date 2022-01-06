import java.util.Scanner;

public class OlderThanMe {

//    Scanner input = new Scanner(System.in);
//        System.out.println("Enter your name : ");
//    String p1 = input.nextLine();

    public static String p1 = "Samuel";

//        System.out.println("Enter your age : ");
//    private static int p1Age = input.nextInt();
    public static int p1Age = 24;

//        System.out.println("Enter your name : ");
//    String p2 = input.nextLine();
public static String p2 = "Joel";

//        System.out.println("Enter your age : ");
//    private static int p2Age = input.nextInt();
public static int p2Age = 36;

    public static String p3 = "Lily";
    public static int p3Age = 24;


    public static void main (String[] args){
        ageCompare(p1Age,p2Age,p1,p2);
        ageCompare(p1Age,p3Age,p1,p3);
    }
    public static void ageCompare(int age1, int age2, String p1, String p2){
        if(age1>age2){
            System.out.println(p1 + " is older than " + p2);
        }
        else if(age1<age2){
            System.out.println(p1 + " is younger than " + p2);
        }
        else if(age1 == age2){
            System.out.println(p1 + " is the same age as " + p2);
        }
    }
}
