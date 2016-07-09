import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PAO5_POT {

    public static void main(String[] args) throws IOException {

	BufferedReader reading = new BufferedReader(new InputStreamReader(System.in));
	int quantity = Integer.parseInt(reading.readLine());

	String values[];

	for (int i = 0; i < quantity; i++) {
	    values = reading.readLine().split(" ");
	    long basis = Integer.parseInt(values[0]);
	    long index = Integer.parseInt(values[1]);
	    System.out.println(powDigits(basis, index));
	}
    }

    /*
     * przypadki dla cyfr 0 - 9
     * 
     * @return score
     */
    private static int powDigits(long basis, long index) {

	int lastDigitFromBasis = lastDigit(basis);
	int score = lastDigit(basis);
	int restOfDivide = (int) ((index - 1) % 4);

	switch (lastDigitFromBasis) {
	case 0:
	case 1:
	case 5:
	case 6:
	    break;
	case 2:

	    int[] tabForTwo = { 2, 4, 8, 6 };
	    score = getScore(tabForTwo, restOfDivide);
	    break;

	case 3:

	    int[] tabForThree = { 3, 9, 7, 1 };
	    score = getScore(tabForThree, restOfDivide);
	    break;

	case 4:

	    if (index % 2 == 0) {
		score = 6;
	    } else {
		score = 4;
	    }
	    break;

	case 7:

	    int[] tabForSeven = { 7, 9, 3, 1 };
	    score = getScore(tabForSeven, restOfDivide);
	    break;

	case 8:

	    int[] tabForEight = { 8, 4, 2, 6 };
	    score = getScore(tabForEight, restOfDivide);
	    break;

	case 9:

	    if (index % 2 == 0) {
		score = 1;
	    } else {
		score = 9;
	    }
	    break;
	}
	return score;
    }

    /*
     * ostatnia cyfra z liczby
     * 
     * @return digit
     */
    private static int lastDigit(long a) {

	int digit = (int) (a % 10);

	return digit;
    }

    /*
     * pobranie wartosci z reszty z dzielenia
     * 
     * @return score
     */
    private static int getScore(int[] tab, int a) {

	int score = 0;

	for (int i = 0; i < tab.length; i++) {
	    if (a == i) {
		score = tab[i];
		break;
	    }
	}
	return score;
    }
}
