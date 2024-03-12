import java.util.Scanner;

public class Valid {

  private final static Scanner input = new Scanner(System.in);

  //Проверка на ввеление числового символа
  public static int getNextInt() {
    int i;
    while (true) {
      if (input.hasNextInt()) {
        i = input.nextInt();
        input.nextLine();
        break;
      }
      System.out.print("Пожалуйста введите числовой символ\n-->");
      input.nextLine();
    }
    return i;
  }

  public static String getNextLine(){
    String s = "";
    while (!(s.matches("^[а-яА-Я][^\\d_]+$"))){
      s = input.nextLine();
      if (!s.matches("^[а-яА-Я][^\\d_]+$")) {
        System.out.print("Ошибка ввода. Пожалуйста попробуйте снова\n--> ");
      }
    }
    return s;
  }

  public static void printError(int err) {
    System.out.println(switch (err) {
      case 100 -> "Ошибка. Некоректный пункт меню.";
      case 101 -> "Список элементов пуст.";
      default -> null;
    });
  }

  public static void close() {
    input.close();
  }
}
