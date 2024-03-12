import java.util.Objects;

class Worker extends Person {

  protected int experience;
  protected String department;

  Worker(String firstName, String lastName, int age, String department,
      int experience) {
    super(firstName, lastName, age);
    this.department = department;
    setExperience(experience);
  }

  @Override
  public String toString() { // Формат вывода данных
    return "Работник {\nФИО: " + firstName + " " + lastName + "\nвозраст: " + age
        + "\nотдел: " + department + "\nстаж: " + experience + " }\n";
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, age, department, experience);
  }

  public void setExperience(int experience) {
    if (experience < 0) {
      this.experience = 0;
    } else {
      this.experience = experience;
    }
  }

  public String greeting() {
    return "Рабочий { ФИО: " + firstName + " " + lastName + " }";
  }
}
