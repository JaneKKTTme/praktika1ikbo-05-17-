import java.util.ArrayDeque;
import java.util.Scanner;

public class TestGame{
	public static void setCards(ArrayDeque<Integer> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cards: ");
        for (int i = 0; i < 5; i++) 
        {
        	array.addLast(sc.nextInt());
        }
	}
	
	public static void main(String[] args) {
		ArrayDeque<Integer> firstPlayer = new ArrayDeque<Integer>();
		ArrayDeque<Integer> secondPlayer = new ArrayDeque<Integer>();
		setCards(firstPlayer);
		setCards(secondPlayer);
		int firstCard;
		int secondCard;
		for (int i = 1; i <= 106; i++) {
			firstCard = firstPlayer.pollFirst();
			secondCard = secondPlayer.pollFirst();
			if (((firstCard > secondCard) && (firstCard != 9 && secondCard != 0)) || (firstCard == 0 && secondCard == 9)) {
				firstPlayer.addLast(firstCard);
				firstPlayer.addLast(secondCard);
				if (secondPlayer.peekFirst() == null) {
					System.out.println("First player win! Steps for win: " + i);
					return ;
				}
			}
			else if (((firstCard < secondCard) && (firstCard != 0 && secondCard != 9)) || (firstCard == 9 && secondCard == 0)) {
				secondPlayer.addLast(firstCard);
				secondPlayer.addLast(secondCard);
				if (firstPlayer.peekFirst() == null) {
					System.out.println("Second player win! Steps for win: " + i);
					return ;
				}
			}
		}
		System.out.println("Botva!");
	}

}
