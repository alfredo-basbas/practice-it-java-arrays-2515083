public class App {

  public static void printTriangle(Object[] arr) {
    for (int i = 0; i <= arr.length - 1; i++) {
      String msg = "";
      for (int k = 0; k <= i; k++) {
        // System.out.println("INDEX " + k);
        msg = msg + arr[k];
      }
      System.out.println(msg);
    }
  }

  public static void main(String args[]) {
    printTriangle(new Integer[] { 1, 2, 3, 4 });
    printTriangle(new Character[] { 'A', 'B', 'C', 'D', 'E' });
    printTriangle(new String[] {});
    printTriangle(new String[] { "Hello" });
    printTriangle(new String[] { "Hello", "There", "Friend" });
  }
}