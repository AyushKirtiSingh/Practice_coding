import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your move('ROCK', 'PAPER', 'SCISSORS'): ");
        String player = sc.nextLine();
        String[] mystring = {"ROCK", "PAPER" , "SCISSORS"};
        Random random = new Random();
        int idx = random.nextInt(mystring.length);
        String computer = (mystring[idx]);
        System.out.println("The computer chose " + computer);