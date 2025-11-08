// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int startingSeed = Integer.parseInt(args[0]);
		char version = args[1].charAt(0);
		// the seed that will get functions used on
		int seed = 1;
		// the seed that will "remember" which one is currently being checked
		int updatingSeed = seed;
		// counter for amount of functions used on each seed
		int spesificSeedCounter;
		// checks if a function was used on the seed
		// for better printing and for seed = 1 (otherwise while will stop)
		boolean isFirstRepetition;
		// tests the Collatz conjecture for all seeds until the inputed seed
		while (updatingSeed <= startingSeed) 
		{ 
			isFirstRepetition = true;
			spesificSeedCounter = 1;
			// sets the seed to the next one to check
			seed = updatingSeed;
			while(seed != 1 || isFirstRepetition) {
				if (version == 'v') {
					if (isFirstRepetition) {
						System.out.print(seed);
					} else {
						System.out.print(" " + seed);
					}
				}
				if (seed % 2 == 0) {
					seed = seed / 2;
				} else {
					seed = seed * 3 + 1;
				}
				spesificSeedCounter++;
				isFirstRepetition = false;
			}
			if (version == 'v') {
				System.out.println(" 1 (" + spesificSeedCounter + ")");
			}
			updatingSeed++;
		}
		if (version == 'v' || version == 'c'){
			System.out.println("Every one of the first " +
			startingSeed + " hailstone sequences reached 1.");
		}

	}

}
		
