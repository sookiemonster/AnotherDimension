import java.util.*;

public class Tester {
  public static void main(String[] args) {
    int[] arr = new int[] {10, 0, -249};
    System.out.println( ArrayOps.sum(arr));

    System.out.println( ArrayOps.largest(arr));

    int[][] matrix = new int[][] {{10, 20}, {30, 24, 100, -100, 0}, {-2}, {-1000, -24, -36}};

    System.out.println( Arrays.toString(ArrayOps.sumRows(matrix)));

    System.out.println( Arrays.toString(ArrayOps.largestInRows(matrix)));

    System.out.println( ArrayOps.sum(matrix));

    int[][]  A = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
    System.out.println(ArrayOps.sum(A));

    int[]  B  =   {  1, 3, 5 };

    System.out.println( ArrayOps.sum(B));
  }
}
