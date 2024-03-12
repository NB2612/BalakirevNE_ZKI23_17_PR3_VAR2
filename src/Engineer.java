import java.util.Objects;

public class Engineer extends Worker {

  protected int rank;
  protected String education;

  Engineer(String firstName, String lastName, int age, String department, int experience, int rank,
      String education) {
    super(firstName, lastName, age, department, experience);
    setRank(rank);
    this.education = education;
  }

  Engineer(){
    super();
    setRank(0);
    this.education = "education";
  }

  @Override
  public String toString() { // Формат вывода данных
    return "Инженер {\nФИО: " + firstName + " " + lastName + "\nвозраст: " + age
        + "\nотдел: " + department + "\nстаж: " + experience + "\nразряд: " + rank
        + "\nобразование: " + education + " }\n";
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, age, department, experience,
        rank, education);
  }

  public void setRank(int rank) {
    if (rank < 0) {
      this.rank = 0;
    } else if (rank > 6) {
      this.rank = 6;
    } else {
      this.rank = rank;
    }
  }

  public String greeting() {
    return "Инженер { ФИО: " + firstName + " " + lastName + " }";
  }
}
