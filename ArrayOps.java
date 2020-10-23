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

  public static String arrToString(int[] arr) {
    if (arr.length == 0) return "{}";
    String ans = "{";
    for (int i = 0; i < arr.length - 1;i++) {
      ans += Integer.toString(arr[i]) + ", ";
    }
    return ans + Integer.toString(arr[arr.length - 1]) + "}";
  }

}
