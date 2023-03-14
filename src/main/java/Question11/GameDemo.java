package Question11;
import game.Player;

public class GameDemo {
    public static void main(String[] args) {
        Player player1 = new Player("Salil", 100, 5);
        Player player2 = new Player("Jitin", 150, 6);

        System.out.println("Player 1:");
        System.out.println("Name: " + player1.getName());
        System.out.println("Score: " + player1.getScore());
        System.out.println("Level: " + player1.getLevel());
        System.out.println();

        System.out.println("Player 2:");
        System.out.println("Name: " + player2.getName());
        System.out.println("Score: " + player2.getScore());
        System.out.println("Level: " + player2.getLevel());
        System.out.println();

        player1.setScore(200);
        player2.setLevel(7);

        System.out.println("Player 1:");
        System.out.println("Name: " + player1.getName());
        System.out.println("Score: " + player1.getScore());
        System.out.println("Level: " + player1.getLevel());
        System.out.println();

        System.out.println("Player 2:");
        System.out.println("Name: " + player2.getName());
        System.out.println("Score: " + player2.getScore());
        System.out.println("Level: " + player2.getLevel());
        System.out.println();
    }
}
