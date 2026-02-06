import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileData = "";
        try {
            File f = new File("src/input");
            Scanner s = new Scanner(f);

            while (s.hasNextLine()) {
                String line = s.nextLine();
                fileData += line + "\n";
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        String[] lines = fileData.split("\n");

        int fiveOfAKind = 0;
        int fullHouse = 0;
        int fourOfAKind = 0;
        int threeOfAKind = 0;
        int twoPair = 0;
        int pair = 0;
        int highCard = 0;

        for (String line : lines) {
            int bar = line.indexOf("|");

            String hand = line.substring(0, bar);
            String bid = line.substring(bar + 1);

            String[] numbers = hand.split(",");

            int[] values = new int[numbers.length];
            Hand hand1 = new Hand(numbers);

            if (hand1.determineHandType() == 6){
                fiveOfAKind++;
            } else if (hand1.determineHandType() == 5) {
                fullHouse++;
            } else if (hand1.determineHandType() == 4) {
                fourOfAKind++;
            } else if (hand1.determineHandType() == 3) {
                threeOfAKind++;
            } else if (hand1.determineHandType() == 2) {
                twoPair++;
            } else if (hand1.determineHandType() == 1) {
                pair++;
            } else if (hand1.determineHandType() == 0) {
                highCard++;
            }

            System.out.println();
        }

        //Not sure why there is a gap above when printed
        System.out.println("Number of five of a kind hands: " + fiveOfAKind);
        System.out.println("Number of full house hands: " + fullHouse);
        System.out.println("Number of four of a kind hands: " + fourOfAKind);
        System.out.println("Number of three of a kind hands: " + threeOfAKind);
        System.out.println("Number of two pair hands: " + twoPair);
        System.out.println("Number of one pair hands: " + pair);
        System.out.println("Number of high card hands: " + highCard);
    }
}

//To see array
//            System.out.println(Arrays.toString(numbers));