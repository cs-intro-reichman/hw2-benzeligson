//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	String chantWord = args[0];
        chantWord =  chantWord.toUpperCase();
        int repetitions = Integer.parseInt(args[1]);
        int letterCounter = 0;
        String aOrAn;
        String letter;
        String specialLetters = "AEFHILMNORSX";
        while (chantWord.length() > letterCounter) {
            letter = "" + chantWord.charAt(letterCounter);
            if (specialLetters.contains(letter)){
                aOrAn = "an";
            } else { 
                aOrAn = "a";
            }
            System.out.println("Give me " + aOrAn + 
            " " + letter + ": " + letter + "!");
            letterCounter++;
        }
        System.out.println("What does that spell?");
        int repetitionsCounter = 0;
        while (repetitionsCounter < repetitions) { 
                System.out.println(chantWord + "!!!");
                repetitionsCounter++;
        }
        System.out.println(" ");
        }
}