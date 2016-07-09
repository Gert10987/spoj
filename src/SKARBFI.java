import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SKARBFI {
  
    static int north = 0;
    static int south = 1;
    static int west = 2;
    static int east = 3;
    static int center = 0;
    static String well = "Studnia";

    public static void main(String[] args) throws IOException {

	String[] values;
	int northSouth;
	int eastWest;
	int tips, steps;
	
	BufferedReader reading = new BufferedReader(new InputStreamReader(System.in));
	int quantity = Integer.parseInt(reading.readLine());

	for (int i = 0; i < quantity; i++) {
	  
	    int numbersOfTips = Integer.parseInt(reading.readLine());
	    northSouth = 0;
	    eastWest = 0;

	    for (int j = 0; j < numbersOfTips; j++) {
		
		values = reading.readLine().split(" ");
		tips = Integer.parseInt(values[0]);
		steps = Integer.parseInt(values[1]);

		switch (tips) {
		case 0:
		    northSouth += steps;
		    break;
		case 1:
		    northSouth -= steps;
		    break;
		case 2:
		    eastWest -= steps;
		    break;
		case 3:
		    eastWest += steps;
		    break;
		}
	    }
	    
	    if (northSouth == center && eastWest == center) {
		System.out.println(well);
	    } else {
		
		if (northSouth > 0) {
		    System.out.println(north + " " + northSouth);
		} else if (northSouth < 0) {
		    System.out.println(south + " " + (northSouth * -1));
		}
		if (eastWest > 0) {
		    System.out.println(east + " " + eastWest);
		} else if (eastWest < 0) {
		    System.out.println(west + " " + (eastWest * -1));
		}
	    }
	}
    }
}
