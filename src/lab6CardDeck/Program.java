package lab6CardDeck;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		String[] cards = { "Ace Spades", "2 Spades", "3 Spades", "4 Spades", "5 Spades", "6 Spades", "7 Spades",
				"8 Spades", "9 Spades", "10 Spades", "Jack Spades", "Queen Spades", "King Spades", "Ace Hearts",
				"2 Hearts", "3 Hearts", "4 Hearts", "5 Hearts", "6 Hearts", "7 Hearts", "8 Hearts", "9 Hearts",
				"10 Hearts", "Jack Hearts", "Queen Hearts", "King Hearts", "Ace Clubs", "2 Clubs", "3 Clubs", "4 Clubs",
				"5 Clubs", "6 Clubs", "7 Clubs", "8 Clubs", "9 Clubs", "10 Clubs", "Jack Clubs", "Queen Clubs",
				"KingClubs", "Ace Diamonds", "2 Diamonds", "3 Diamonds", "4 Diamonds", "5 Diamonds", "6 Diamonds",
				"7 Diamonds", "8 Diamonds", "9 Diamonds", "10 Diamonds", "Jack Diamonds", "Queen Diamonds",
				"King Diamonds" };

		int[] values = { 10, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 2,
				3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
		
		
		String gameResult = randomCards(cards, values);
		System.out.println(gameResult);
	}
	
	public static String randomCards(String[] deck, int[] valueOfDec) {
		int hands1 = 0;
		int hands2 =0;

		Random rand = new Random();
		int newNum = 0;
		boolean[] usedCards = new boolean[deck.length];
		int countOfCards = 0;
		while(countOfCards <10) {
			do {
				newNum = rand.nextInt(0, deck.length);
				
			} while(usedCards[newNum]);
			
			usedCards[newNum] = true;
			
			if(countOfCards < 5) {
				System.out.printf("Hand 1 Draw: Card: %s, value: %d\n", deck[newNum], valueOfDec[newNum]);
				hands1 += valueOfDec[newNum]; 
			} else {
				System.out.printf("Hand 2 Draw: Card: %s, value: %d\n", deck[newNum], valueOfDec[newNum]);
				hands2 += valueOfDec[newNum];
			}
			countOfCards++;
		}	
		
		return hands1 > hands2 ? String.format("Hands 1 Wins with score %d", hands1) : hands1 == hands2 ? "Hands 1 & 2 Draw" : String.format("Hands 2 Wins with score %d", hands2);
		
	}
	
}
