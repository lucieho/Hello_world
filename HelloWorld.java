public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, Sweng !");
    System.out.println("The ultimate question of Life, The Universe, and Everything is: " + computeUltimateQuestion());
    System.out.println("The answer to the ultimate question of Life, The Universe, and Everything is: " + computeUltimateAnswer());
  }

  public static String computeUltimateQuestion() {
    return "still searching...";
  }

  public static int computeUltimateAnswer() {
	return 6 * 7;
  }
}
