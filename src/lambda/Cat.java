package lambda;
@FunctionalInterface
public interface Cat {
  default void xzzz(){
    System.out.println("hello");
  }
  default void add(){
    System.out.println("duy");
  }
  int cos(int a);
//  int hat(int a);
}
