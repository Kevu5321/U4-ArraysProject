import java.util.Arrays;

public class Hand {
    private String[] cards;
    private int handType;
    private int rank;
    private int bidvalue;

    public Hand (String[] numbers) {
        this.cards = numbers;
        this.handType = 0;
        this.rank = 0;
        this.bidvalue = 0;
    }

    public void determineHandType() {
        int[] cardNum = new int[13];
        for (int i = 0; i < this.cards.length; i++) {
            if (this.cards[i].equals("Ace")) {
               cardNum[12]++;
            } else if (this.cards[i].equals("King")) {
                cardNum[11]++;
            } else if (this.cards[i].equals("Queen")) {
                cardNum[10]++;
            } else if (this.cards[i].equals("Jack")) {
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

        //use "break"(?)
//            for (i = 0; i < cardNum.length-1; i++){
//                if (cardNum[i] == 5) {
//
//                }
//            }

        System.out.println(Arrays.toString(cardNum));
    }

}
