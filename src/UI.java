import java.util.ArrayList;
import java.util.Scanner;

public class UI {

  private final Scanner input = new Scanner(System.in);

  public void startUI() {
    System.out.println("Добро пожаловать!");
    int menuChoise;
    ArrayList<Person> list = new ArrayList<>();
    do {
      //Меню
      System.out.print("""
          Меню:
          1 - Добавить новый элемент
          2 - Удалить элемент по индексу.
          3 - Вывод всех элементов в консоль.
          4 - Сравнение двух элементов на равенство (по индексам).
          0 - Завершение работы приложения.
          -->\s""");
      menuChoise = Valid.getNextInt();

      switch (menuChoise) {
        case 1:
          System.out.print("""
              Добавить:
              1 - Персону
              2 - Рабочего
              3 - Инженера
              4 - Служащего
              0 - Отмена
              \s""");
          menuChoise = Valid.getNextInt();
          String firstName, lastName, department, education;
          int age, experience, rank, extendNumber;
          switch (menuChoise) {
            case 1:
              System.out.print("Введите имя: ");
              firstName = input.next("\\D");
              System.out.print("Введите фамилию: ");
              lastName = input.next("\\D");
              System.out.print("Введите возраст(>0): ");
              age = Valid.getNextInt();
              list.add(new Person(firstName, lastName, age));
              break;
            case 2:
              System.out.print("Введите имя: ");
              firstName = input.next("\\D");
              System.out.print("Введите фамилию: ");
              lastName = input.next("\\D");
              System.out.print("Введите возраст(>0): ");
              age = Valid.getNextInt();
              System.out.print("Введите название отдела: ");
              department = input.next("\\D");
              System.out.print("Введите стаж(>=0): ");
              experience = Valid.getNextInt();
              list.add(new Worker(firstName, lastName, age, department, experience));
              break;
            case 3:
              System.out.print("Введите имя: ");
              firstName = input.next("\\D");
              System.out.print("Введите фамилию: ");
              lastName = input.next("\\D");
              System.out.print("Введите возраст(>0): ");
              age = Valid.getNextInt();
              System.out.print("Введите название отдела: ");
              department = input.next("\\D");
              System.out.print("Введите стаж(>=0): ");
              experience = Valid.getNextInt();
              System.out.print("Введите разряд(0-6): ");
              rank = Valid.getNextInt();
              System.out.print("Введите уровень образования: ");
              education = input.next("\\D");
              list.add(new Engineer(firstName, lastName, age, department, experience, rank,
                  education));
              break;
            case 4:
              System.out.print("Введите имя: ");
              firstName = input.next("\\D");
              System.out.print("Введите фамилию: ");
              lastName = input.next("\\D");
              System.out.print("Введите возраст(>0): ");
              age = Valid.getNextInt();
              System.out.print("Введите внутренний номер сотрудника(>=1): ");
              extendNumber = Valid.getNextInt();
              System.out.print("Введите уровень образования: ");
              education = input.next("\\D");
              list.add(new Employee(firstName, lastName, age, extendNumber, education));
              break;
            case 0:
              break;
            default:
              Valid.printError(100);
              break;
          }
          break;
        case 2:
          if (list.isEmpty()) {
            Valid.printError(101);
          } else {
            for (int i = 0; i < list.size(); i++) {
              System.out.println("ID [" + i + "]: " + list.get(i).greeting());
            }
          }
          System.out.print("Выберите элемент из списка для удаления(0-" + list.size() + "): ");
          int id = Valid.getNextInt();
          list.remove(id);
          System.out.println("Успешно");
          break;
        case 3:
          System.out.println("Информация о всех элементах:");
          if (list.isEmpty()) {
            Valid.printError(101);
          } else {
            for (int i = 0; i < list.size(); i++) {
              System.out.println("ID [" + i + "]: " + list.get(i));
            }
          }
          break;
        case 4:
          if (list.isEmpty()) {
            Valid.printError(101);
          } else {
            for (int i = 0; i < list.size(); i++) {
              System.out.println("ID [" + i + "]: " + list.get(i).greeting());
            }
          }
          System.out.print("Выберите **первый** элемент для сравнения(0-" + list.size() + "): ");
          int id1 = Valid.getNextInt();
          System.out.print("Выберите **второй** элемент для сравнения(0-" + list.size() + "): ");
          int id2 = Valid.getNextInt();
          if (id1 >= 0 && id1 < list.size() && id2 >= 0 && id2 < list.size()) {
            if (list.get(id1).equals(list.get(id2))) {
              System.out.println("Элементы равны");
            } else {
              System.out.println("Элементы не равны");
            }
          } else {
            System.out.println("Элементы не найдены");
          }
          break;
        case 0:
          System.out.println("Завершение работы приложения.");
          this.input.close();
          Valid.close();
          return;
        default:
          Valid.printError(100);
      }
    } while (true);
  }
}
