import java.util.Objects;

class Person {

  protected String firstName;
  protected String lastName;
  protected int age;

  Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    setAge(age);
  }

  Person(){
    this.firstName = "firstName";
    this.lastName = "lastName";
    setAge(0);
  }

  @Override
  public String toString() { // Формат вывода данных
    return "Персона {\nФИО: " + firstName + " " + lastName + "\nвозраст: " + age + " }\n";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person obj = (Person) o;
    return age == obj.getAge() && Objects.equals(firstName, obj.getFirstName())
        && Objects.equals(lastName, obj.getLastName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, age);
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age < 0) {
      this.age = 0;
    } else {
      this.age = age;
    }
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String greeting() {
    return "Персона { ФИО: " + firstName + " " + lastName + " }";
  }

}

