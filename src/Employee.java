import java.util.Objects;

public class Employee extends Person {

  protected String education;
  private int extendNumber;

  Employee(String firstName, String lastName, int age, int extendNumber, String education) {
    super(firstName, lastName, age);
    setExtendNumber(extendNumber);
    this.education = education;
  }

  Employee(){
    super();
    setExtendNumber(0);
    this.education = "education";
  }

  @Override
  public String toString() { // Формат вывода данных
    return "Персона {\nФИО: " + firstName + " " + lastName + "\nвозраст: " + age +
        "\nвнутренний номер: " + extendNumber + "\nобразование: " + education + " }\n";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee obj = (Employee) o;
    return age == obj.getAge() && extendNumber == obj.getExtendNumber()
        && Objects.equals(firstName, obj.getFirstName())
        && Objects.equals(education, obj.getEducation())
        && Objects.equals(lastName, obj.getLastName());
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

  public int getExtendNumber() {
    return extendNumber;
  }

  public String getEducation() {
    return education;
  }

  public String greeting() {
    return "Служащий { ФИО: " + firstName + " " + lastName + " }";
  }
}
