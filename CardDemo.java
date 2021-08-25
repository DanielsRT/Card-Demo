import java.util.*;
import java.io.*;
public class CardDemo {
    
    static Random rand = new Random();
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    
    public static void main(String[] args){
        int card1 = rand.nextInt(52);
        int suit1 = card1 / 13;
        int rank1 = card1 % 13 + 1;
        System.out.println(rank1 + " of " + suits[suit1]);
        
    }
}