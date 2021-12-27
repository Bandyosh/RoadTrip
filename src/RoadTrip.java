
public class RoadTrip {

    public static void main(String[] args) {
    int distance = zForm.Int(ANSI.YELLOW(), ANSI.ESCAPE()+ "How many miles are you going? (MILES)\n");
    int averageSpeed = zForm.Int(ANSI.YELLOW(),"What is the average speed in this trip? (MPH)\n");
    int blinksPerMinute = zForm.Int(ANSI.YELLOW(),"How many blinks per minute on average? (Minutes)\n");
    double durationOfABlink = zForm.Double(ANSI.YELLOW(), "What is the average duration of a blink? (Seconds)\n");

     console.color(ANSI.CYAN(), "You are going on a trip to Florida with these Stats:"); ///Print Given
     console.color(ANSI.orange(), "Distance: " + distance + " Miles"); ///Print Given
     console.color(ANSI.orange(), "Average Speed: " + averageSpeed + " MPH"); ///Print Given
     console.color(ANSI.orange(), "Blinks Per Minute: " + blinksPerMinute + " Blinks"); ///Print Given
     console.color(ANSI.orange(), "Duration of a Blink: " + durationOfABlink + " Seconds\n"); ///Print Given

     console.color(ANSI.lightRed(),zCalculations.totalTime(distance, averageSpeed) + "\n");
     console.color(ANSI.lightRed(), zCalculations.eyesClosedTime(durationOfABlink, blinksPerMinute, distance, averageSpeed) + "\n");
     console.color(ANSI.lightRed(), zCalculations.eyesClosedMiles(durationOfABlink, blinksPerMinute, distance, averageSpeed) + "\n");

     Lives lives = new Lives();
    }
}
