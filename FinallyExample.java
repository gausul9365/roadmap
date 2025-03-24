





public class FinallyExample {
  public static void main(String[] args) {
      try {
          System.out.println(10 / 0);
      } catch (ArithmeticException e) {
          System.out.println("Cannot divide by zero.");
      } finally {
          System.out.println("This will always execute.");
      }
  }
}
