import java.util.InputMismatchException;
import java.util.Scanner;

public class Valid {
  public static int getInt(Scanner input) {
    int i = 0;
    while(true){
      if (input.hasNextInt()) {
        i = input.nextInt();
        break;
      }
      System.out.println("Пожалуйста введите числовой символ");
      input.nextLine();
    }
    return i;
  }
}
