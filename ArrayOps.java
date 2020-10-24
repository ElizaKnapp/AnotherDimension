public class ArrayOps {
  //here is where the methods will be
  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static int largest(int[] arr) {
    int largest = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }
    return largest;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] ans = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      ans[i] = sum(matrix[i]);
    }
    return ans;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] ans = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      ans[i] = largest(matrix[i]);
    }
    return ans;
  }

  public static int sum(int[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += sum(arr[i]);
    }
    return sum;
  }

  public static int[] sumCols(int[][] matrix) {
    int[][] swapped = new int[matrix[0].length][matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        swapped[j][i] = matrix[i][j];
      }
    }
    return sumRows(swapped);
  }

  public static boolean isRowMagic(int[][] matrix) {
    int[] sums = sumRows(matrix);
    boolean ans = true;
    for (int i = 0; i < sums.length - 1; i++) {
      if (sums[i] != sums[i + 1]) {
        ans = false;
      }
    }
    return ans;
  }

  public static boolean isColMagic(int[][] matrix) {
    int[] sums = sumCols(matrix);
    boolean ans = true;
    for (int i = 0; i < sums.length - 1; i++) {
      if (sums[i] != sums[i + 1]) {
        ans = false;
      }
    }
    return ans;
  }

}
