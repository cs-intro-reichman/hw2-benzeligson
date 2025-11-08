public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesAdded = Integer.parseInt(args[1]);
        int totalInMinutes = (hours * 60) + minutes + minutesAdded;
        hours = (totalInMinutes / 60) % 24;
        minutes = totalInMinutes % 60;
        //convert new minutes and hours to strings
        String hoursString = "" + hours;
        String minutesString = "" + minutes;
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }
        if (minutes < 10) {
            minutesString = "0" + minutesString;
        }
        System.out.println(hoursString + ":" + minutesString);
    }
}
