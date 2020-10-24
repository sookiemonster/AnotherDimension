import java.util.*;

public class Tester {
  public static void main(String[] args) {
    int[] arr = new int[] {10, 0, -249};
    System.out.println(ArrayOps.sum(arr));

    System.out.println(ArrayOps.largest(arr));

    int[][] matrix = new int[][] {{10, 20}, {30, 24, 100, -100, 0}, {-2}};

    System.out.println(Arrays.toString(ArrayOps.sumRows(matrix)));
  }
}
