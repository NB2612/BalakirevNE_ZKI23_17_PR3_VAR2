import java.util.Objects;

public class Employee extends Person {

  protected String education;
  private int extendNumber;

  Employee(String firstName, String lastName, int age, int extendNumber, String education) {
    super(firstName, lastName, age);
    setExtendNumber(extendNumber);
    this.education = education;
  }

  @Override
  public String toString() { // Формат вывода данных
    return "Персона {\nФИО: " + firstName + " " + lastName + "\nвозраст: " + age +
        "\nвнутренний номер: " + extendNumber + "\nобразование: " + education + " }\n";
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, age, extendNumber, education);
  }

  public void setExtendNumber(int extendNumber) {
    if (extendNumber < 1) {
      this.extendNumber = 1;
    } else {
      this.extendNumber = extendNumber;
    }
  }

  public String greeting() {
    return "Служащий { ФИО: " + firstName + " " + lastName + " }";
  }
}
