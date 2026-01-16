import java.util.Arrays;

public class App {

  public static void main(String[] args) {
    double[] lotteryNums = { 42, 92, 32, 33, 21 }; // new double[5];
    System.out.println(lotteryNums[2]);
    lotteryNums[2] = 40;
    System.out.println(lotteryNums[2]);

    for (int i = 0; i < lotteryNums.length; i++) {
      System.out.println(lotteryNums[i]);
    }
    System.out.println();

    for (int i = lotteryNums.length - 1; i >= 0; i--) {
      System.out.println(lotteryNums[i]);
    }
    System.out.println();

    for (double item : lotteryNums) {
      System.out.println(item);
    }
    System.out.println("STREAMS");

    Arrays.stream(lotteryNums).forEach(System.out::println);
  }
}