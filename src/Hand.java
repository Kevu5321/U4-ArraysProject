import java.util.Arrays;

public class Hand {
    private String[] cards;
    private int handType;
    private int rank;
    private int bidvalue;

    public Hand (String[] numbers, int bidvalue) {
        this.cards = numbers;
        this.handType = 0;
        this.rank = 0;
        this.bidvalue = bidvalue;
    }

    public int determineHandType() {
        int[] cardNum = new int[14];
        for (String card : this.cards) {
            if (card.equals("Ace")) {
                cardNum[13]++;
            } else if (card.equals("King")) {
                cardNum[12]++;
            } else if (card.equals("Queen")) {
                cardNum[11]++;
            } else if (card.equals("Jack")) {
                cardNum[10]++;
            } else if (Integer.parseInt(card) == 10) {
                cardNum[9]++;
            } else if (Integer.parseInt(card) == 9) {
                cardNum[8]++;
            } else if (Integer.parseInt(card) == 8) {
                cardNum[7]++;
            } else if (Integer.parseInt(card) == 7) {
                cardNum[6]++;
            } else if (Integer.parseInt(card) == 6) {
                cardNum[5]++;
            } else if (Integer.parseInt(card) == 5) {
                cardNum[4]++;
            } else if (Integer.parseInt(card) == 4) {
                cardNum[3]++;
            } else if (Integer.parseInt(card) == 3) {
                cardNum[2]++;
            } else if (Integer.parseInt(card) == 2) {
                cardNum[1]++;
            } else if (Integer.parseInt(card) == 1) {
                cardNum[0]++;
            }
        }

        int tempPair = 0;
        int tempThree = 0;
        for (int j : cardNum) {
            if (j == 5) {
                this.handType = 6;
                return 6;
            } else if (j == 4) {
                this.handType = 4;
                return 4;
            } else if (j == 3) {
                tempThree++;
            } else if (j == 2) {
                tempPair++;
            }
        }

        if (tempPair == 1 && tempThree == 1) {
            this.handType = 5;
            return 5;
        } else if (tempThree == 1) {
            this.handType = 3;
            return 3;
        } else if (tempPair == 2) {
            this.handType = 2;
            return 2;
        } else if (tempPair == 1) {
            this.handType = 1;
            return 1;
        } else {
            return 0;
        }
    }

// not sure how to make two hand objects at once when using
// (String line : lines) loop in main

//    public int compareHands (Hand x) {
//        for (int i = 0; i < this.cards.length; i++) {
//            if (Integer.parseInt(this.cards[i]) == Integer.parseInt(x[i])) {
//
//            }
//        }
//
//        return 0;
//    }
}