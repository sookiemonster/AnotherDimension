import java.util.*;

public class Tester {
  public static void main(String[] args) {
    // Part 4 ---------------------------------------------------------------
    int[] arr = new int[] {10, 0, -249};
    System.out.println( ArrayOps.sum(arr));

    System.out.println( ArrayOps.largest(arr));

    int[][] matrix = { {10, 20},
                       {30, 24, 100, -100, 0},
                       {-2},
                       {-1000, -24, -36} };

    System.out.println( Arrays.toString(ArrayOps.sumRows(matrix)));

    System.out.println( Arrays.toString(ArrayOps.largestInRows(matrix)));

    System.out.println( ArrayOps.sum(matrix));

    int[][]  A = { {  1,  0, 12, -1 },
                   {  7, -2,  2,  1 },
                   { -5, -2,  2, -9 } };
    System.out.println(ArrayOps.sum(A));

    int[]  B  =   {  1, 3, 5 };

    System.out.println( ArrayOps.sum(B));
    System.out.println("\n\n");

    // Part 5 ---------------------------------------------------------------

    System.out.println( Arrays.toString(ArrayOps.sumCols(A)));
    System.out.println();

    System.out.println("Row Magic");
    int[][] C = { {  1, 2, 3, 4 },
                  {  2, 3, 4, 1 },
                  {  3, 4, 1, 2 } };
    System.out.println( ArrayOps.isRowMagic(A));
    System.out.println( ArrayOps.isRowMagic(C));
    System.out.println();

    int[][] D = { {  1, 1, 1 },
                  {  2, 2, 2 },
                  {  3, 3, 3 } };

    System.out.println("Col Magic");
    System.out.println( ArrayOps.isColMagic(A));
    System.out.println( ArrayOps.isColMagic(C));
    System.out.println( ArrayOps.isColMagic(D));
    System.out.println();

    System.out.println("Both Magic");
    int [][] E = { {  2, 2, 2 },
                   {  2, 2, 2 } };

    System.out.println( ArrayOps.isColMagic(E));
    System.out.println( ArrayOps.isRowMagic(E));
  }
}
