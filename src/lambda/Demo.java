package lambda;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;

public class Demo {
  public static void main(String[] args) {
Tom tom = new Tom();
tom.add();
    System.out.println(tom.cos(5));

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    int sum = list.stream().map(x -> x * x).reduce((x, y) -> x + y).get();
    System.out.println(sum);
    List<Integer> lists = Arrays.asList(1,2,3,4,5,6,7);
    lists.stream().map((x) -> x*x).forEach(System.out::println);
  }
}
