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
        for (int i = 0; i < this.cards.length; i++) {
            if (this.cards[i].equals("Ace")) {
                cardNum[13]++;
            } else if (this.cards[i].equals("King")) {
                cardNum[12]++;
            } else if (this.cards[i].equals("Queen")) {
                cardNum[11]++;
            } else if (this.cards[i].equals("Jack")) {
                cardNum[10]++;
            } else if (Integer.parseInt(this.cards[i]) == 10) {
                cardNum[9]++;
            } else if (Integer.parseInt(this.cards[i]) == 9) {
                cardNum[8]++;
            } else if (Integer.parseInt(this.cards[i]) == 8) {
                cardNum[7]++;
            } else if (Integer.parseInt(this.cards[i]) == 7) {
                cardNum[6]++;
            } else if (Integer.parseInt(this.cards[i]) == 6) {
                cardNum[5]++;
            } else if (Integer.parseInt(this.cards[i]) == 5) {
                cardNum[4]++;
            } else if (Integer.parseInt(this.cards[i]) == 4) {
                cardNum[3]++;
            } else if (Integer.parseInt(this.cards[i]) == 3) {
                cardNum[2]++;
            } else if (Integer.parseInt(this.cards[i]) == 2) {
                cardNum[1]++;
            } else if (Integer.parseInt(this.cards[i]) == 1) {
                cardNum[0]++;
            }
        }

        int tempPair = 0;
        int tempThree = 0;
        for (int i = 0; i < cardNum.length; i++) {
            if (cardNum[i] == 5) {
                this.handType = 6;
                return 6;
            } else if (cardNum[i] == 4) {
                this.handType = 4;
                return 4;
            } else if (cardNum[i] == 3) {
                tempThree++;
            } else if (cardNum[i] == 2) {
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


}