package All_Exercise_7_Arrays;

import java.util.Arrays;

public class task_for_test {

	public static void main(String[] args) {

		int[][] packOfCards = new int[2][26];

		for (int i = 0; i < packOfCards.length; i++) {
			for (int j = 0; j < packOfCards[i].length; j++) {
				int cards = (int) (Math.random() * 14);
				packOfCards[i][j] = cards;

				String[] playerNames = { "Itamar", "Vered" };
			}
//			if (packOfCards[i][j] > )

			System.out.println(Arrays.toString(packOfCards[i]));

			for (int game : packOfCards[i]) {

			}

		}

	}

}
