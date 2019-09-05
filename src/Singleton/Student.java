package Singleton;

public class Student {
  public Student(){};
  private static Student student;

  public static Student getStudent() {
    if (student == null){
      student = new Student();
    }
    return student;
  }
  public void ask(){
    System.out.println("hello");
  }
}
