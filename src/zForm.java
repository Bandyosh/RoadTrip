import java.util.*;

public class zForm {
    static Scanner scanner = new Scanner(System.in);

    public static int Int(String color, String msg){
        console.color(color, msg);

        String responseString = scanner.nextLine();

        int x = 0;

        try{
            x = Integer.parseInt(responseString);
        } catch(NumberFormatException e){
            console.error("Error Handler: Invalid Input(s)");
            System.exit(0);
        }

        return x;
    }

    public static double Double(String color, String msg){
       console.color(color, msg);

        String responseString = scanner.nextLine();

        double x = 0.0;

        try{
            x = Double.parseDouble(responseString);
        } catch(NumberFormatException e){
          console.error("Error Handler: Invalid Input(s)");
            System.exit(0);

        }

        return x;
    }

}
