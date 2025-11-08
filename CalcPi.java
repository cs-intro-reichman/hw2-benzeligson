// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int repetitions = Integer.parseInt(args[0]);
		int repetitionsCounter = 0;
		double pi = 0;
		while (repetitionsCounter < repetitions) { 
			int addingOrSubstracting = 1;
			if (repetitionsCounter % 2 == 1)
			{
				addingOrSubstracting = -1;
			}
			pi = pi + addingOrSubstracting * (1.0 / (repetitionsCounter * 2 + 1)) * 4;
			repetitionsCounter++;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + pi);
	}
}
