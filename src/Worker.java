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

  Worker(){
    super();
    this.department = "department";
    setExperience(0);
  }

  @Override
  public String toString() { // Формат вывода данных
    return "Работник {\nФИО: " + firstName + " " + lastName + "\nвозраст: " + age
        + "\nотдел: " + department + "\nстаж: " + experience + " }\n";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Worker obj = (Worker) o;
    return age == obj.getAge() && experience == obj.getExperience()
        && Objects.equals(firstName, obj.getFirstName())
        && Objects.equals(department, obj.getDepartment())
        && Objects.equals(lastName, obj.getLastName());
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

  public int getExperience() {
    return experience;
  }

  public String getDepartment() {
    return department;
  }

  public String greeting() {
    return "Рабочий { ФИО: " + firstName + " " + lastName + " }";
  }
}
