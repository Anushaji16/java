import java.util.Scanner;

public class TempConve {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n---Temperature Converter---");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.println("Select an option:");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 3) {
                System.out.println("Execution terminated");
                break;
            }

            System.out.println("Enter temperature:");
            String t = sc.nextLine();

            try {
                double temperature = Double.parseDouble(t);
                double convertedTemp;

                switch (choice) {
                    case 1:
                        convertedTemp = (temperature * 9 / 5) + 32;
                        System.out.printf("%.2f C is equal to %.2f F\n", temperature, convertedTemp);
                        break;

                    case 2:
                        convertedTemp = (temperature - 32) * 5 / 9;
                        System.out.printf("%.2f F is equal to %.2f C\n", temperature, convertedTemp);
                        break;

                    default:
                        System.out.println("Error: invalid selection. Try again");
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: invalid input. You must enter a number");
            }
        }

        sc.close(); 
    }
}
   
 


