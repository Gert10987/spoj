import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FZI_STEF {

    public static void main(String[] args) throws IOException {

	BufferedReader reading = new BufferedReader(new InputStreamReader(System.in));
	int quantity = Integer.parseInt(reading.readLine());
	int[] cities = new int[quantity];

	for (int i = 0; i < quantity; i++) {
	    cities[i] = Integer.parseInt(reading.readLine());
	}
	algorithm(cities);
    }

    private static void algorithm(int[] tab) {

	int value = 0;
	int maxValue = 0;

	for (int i = 0; i < tab.length; i++) {
	  
	    value += tab[i];
	  
	    if (value > maxValue) {
		
		maxValue = value;
		
	    } else if (value < 0) {
		
		value = 0;
	    }
	    value = tab[i];
	}

	System.out.println(maxValue);
    }
}
