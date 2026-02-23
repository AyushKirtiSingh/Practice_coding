import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        String var = "chandler";

        switch (var) {
            case "ross" -> {
                System.out.println("You are going to become an adult!");
                System.out.println("You are going to become an adult!");
                System.out.println("You are going to become an adult!");
            }
            case "chandler" -> System.out.println("You are going to join a job!");
            case "joey" -> System.out.println("You are going to retire!");
            default -> System.out.println("Enjoy your life!");
        }
        System.out.println("Thanks for using my java code!");
    }

}    