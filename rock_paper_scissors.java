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
        if(player.equalsIgnoreCase("rock")  && computer.equalsIgnoreCase("scissors")){
            System.out.println("Congratulations,You Won!");
        }
        else if(player.equalsIgnoreCase("rock") && computer.equalsIgnoreCase("paper")){
            System.out.println("Sorry,You Lose!");
        }
        else if(player.equalsIgnoreCase("scissors") && computer.equalsIgnoreCase("rock")) {
            System.out.println("Sorry,You Lose!");
        }
        else if(player.equalsIgnoreCase("scissors") && computer.equalsIgnoreCase("paper")) {
            System.out.println("Congratulations,You Won!");
        }
        else if(player.equalsIgnoreCase("paper") && computer.equalsIgnoreCase("rock")) {
            System.out.println("Congratulations,You Won!");
        }
        else if(player.equalsIgnoreCase("paper") && computer.equalsIgnoreCase("scissors")) {
            System.out.println("Sorry,You Lose!");
        }