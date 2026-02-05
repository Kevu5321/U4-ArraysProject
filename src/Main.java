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

        for (String line : lines) {
            int bar = line.indexOf("|");

            String hand = line.substring(0, bar);
            String bid = line.substring(bar + 1);

            String[] numbers = hand.split(",");

            int[] values = new int[numbers.length];

            System.out.println(Arrays.toString(numbers));
            Hand hand1 = new Hand(numbers);
            hand1.determineHandType();
            System.out.println(numbers[0]);
            System.out.println(numbers[4]);


            System.out.println();
//            System.out.println(Arrays.toString(values));
        }

//        System.out.println("Number of five of a kind hands: " );
//        System.out.println("Number of full house hands: " );
//        System.out.println("Number of four of a kind hands: " );
//        System.out.println("Number of three of a kind hands: " );
//        System.out.println("Number of two pair hands: " );
//        System.out.println("Number of one pair hands: " );
//        System.out.println("Number of high card hands: " );
    }
}

//Scrap code?

//            for (int i = 0; i < numbers.length; i++) {
//                if (numbers[i].equals(",") || numbers[i].equals("|")) {
//
//                } else if(numbers[i].equals("J")) {
//                    values[i] = 11;
//                    i += 4;
//                } else if (numbers[i].equals("Q")) {
//                    values[i] = 12;
//                    i += 5;
//                } else if (numbers[i].equals("K")) {
//                    values[i] = 13;
//                    i += 4;
//                } else if (numbers[i].equals("A")) {
//                    values[i] = 14;
//                    i += 3;
//                } else {
//                    values[i] = Integer.parseInt(numbers[i]);
//                }
//            }

//            int inc = 0;
//            for (int i = 0; i < numbers.length-1; i++) {
//                if (values[i] <= values[i+1]){
//                    inc++;
//                }
//            }
//