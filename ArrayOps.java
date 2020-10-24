public class ArrayOps {
  public static int sum(int[] arr) {
    int result = 0;
    for (int i = 0; i < arr.length; i++) {
      result += arr[i];
    }
    return result;
  }

  public static int largest(int[] arr) {
    int result = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (result < arr[i]) {
        result = arr[i];
      }
    }
    return result;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] result = new int[matrix.length];
    for (int i = 0; i < result.length; i++) {
      result[i] = sum(matrix[i]);
    }
    return result;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] result = new int[matrix.length];
    for (int i = 0; i < result.length; i++) {
      result[i] = largest(matrix[i]);
    }
    return result;
  }

  public static int sum(int[][] matrix) {
    int result = 0;
    for (int i = 0; i < matrix.length; i++) {
      result += sum(matrix[i]);
    }
    return result;
  }

  public static int[] sumCols(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[] result = new int[cols];
    for (int i = 0; i < cols; i++) {
      for (int j = 0; j < rows; j++) {
        result[i] += matrix[j][i];
      }
    }
    return result;
  }
}
