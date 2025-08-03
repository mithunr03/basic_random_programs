import java.util.Scanner;

public class CmToInces_InchesToCm{
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("1.CONVERT CM TO INCHES");
      System.out.println("2.CONVERT INCHES TO CM");
      System.out.print("Enter your choice: ");
      int choice = sc.nextInt();
      if (choice == 1){
          System.out.print("Enter length in centimeters: ");
          double cm = sc.nextDouble();
          double inches = cm / 2.54;
          System.out.printf("%.2f cm is equal to %.2f inches%n", cm, inches);
      } else if (choice == 2) {
          System.out.print("Enter length in inches: ");
          double inches = sc.nextDouble();
          double cm = inches * 2.54;
          System.out.printf("%.2f inches is equal to %.2f cm%n", inches, cm);
      } else {
          System.out.println("Invalid choice. Please select either 1 or 2.");
      }
      
    }
}