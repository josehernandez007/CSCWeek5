import java.util.ArrayList;
import java.util.Scanner;

public class TemperatureTracker {

	public static void main(String[] args) {
		ArrayList<String> daysOfWeek = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter the day of the week (e.g., Monday) or 'week' for weekly average: ");
            String day = scanner.nextLine();
            
            if (day.equalsIgnoreCase("Week")) {
                break;
            }
            
            daysOfWeek.add(day);
            System.out.print("Enter the average temperature for " + day + ": ");
            double temp = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            temperatures.add(temp);
        }
        
        for (int i = 0; i < daysOfWeek.size(); i++) {
            System.out.println("Day: " + daysOfWeek.get(i));
        }
        
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        
        double weeklyAverage = sum / temperatures.size();
        System.out.println("Weekly average temperature: " + weeklyAverage);
    }
}