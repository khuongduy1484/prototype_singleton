package prototype;

public class Demo {
  public static void main(String[] args) {
    Address address = new Address("ha noi","Ha dong","Nguyen trai");
    User user = new User("firstName", "lastName", "duy", "abc@gmail.com", address);
    User userShallowCopy = user.shallowCopy();
    User userDeepCopy = user.deepCopy();
    System.out.println("Before change address:");
    System.out.println("original user: " + user);
    System.out.println("shallow user: " + userShallowCopy);
    System.out.println("deep user: " + userDeepCopy);

    System.out.println("-----------------------------------");
    System.out.println("After shallow user change address:");
    userShallowCopy.getAddress().setDistrict("Thanh Xuan");
    System.out.println("original user: " + user);
    System.out.println("shallow user: " + userShallowCopy);
    System.out.println("deep user: " + userDeepCopy);
  }

}
