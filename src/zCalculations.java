public class zCalculations {

    public static String totalTime(int distance, int averageSpeed) {
        int timeInt = distance / averageSpeed; //Total Hours

        double timeDouble = ((double) distance - ((double) timeInt * (double) averageSpeed)) / averageSpeed * 60.0; //Minutes (Excluding Hours)

        return timeInt + " hours " + timeDouble + " minutes to drive to Flordia";
    }

    public static String eyesClosedTime(double durationOfABlink, int blinksPerMinute, int distance, int averageSpeed) {

        double timeMinutes = ((double) distance / (double) averageSpeed) * 60.0; //Total Minutes for entire trip

        double eyesClosed = (timeMinutes * blinksPerMinute) * (durationOfABlink / 60.0);//Minutes Eyes Closed

        String response = null;

        if ((int) (eyesClosed / 60) > 0) { //Checks if the eyeClosed is more than a hour

            double eyesClosedMinutes = ((eyesClosed / 60) - ((int) eyesClosed / 60)) * 60;

            int eyesClosedHours = (int) (eyesClosed / 60);

            response = eyesClosedHours + " hours and " + eyesClosedMinutes + " minutes with eyes closed";

        } else {
            if ((int) (eyesClosed / 60) == 0) {

                response = "0 hours and " + eyesClosed + " minutes with eyes closed";

            }
        }
        return response;
    }

    public static String eyesClosedMiles(double durationOfABlink, int blinksPerMinute, int distance, int averageSpeed){

        double timeMinutes = ((double) distance / (double) averageSpeed) * 60.0;

        double eyesClosed = (timeMinutes*blinksPerMinute)*(durationOfABlink/60.0);

        return (eyesClosed *((double)averageSpeed/60)) + " miles with eyes closed";
    }
}
