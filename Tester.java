import java.io.*;
import java.util.*;

public class Tester {
  public static void main(String[] args) {
    //Where all the test cases and print statements are
    int[] test1 = {1, 3, 4};
    System.out.println(ArrayOps.sum(test1));
    System.out.println(ArrayOps.largest(test1));

    int[][] test2 = { {3, 2, 5}, {2, 1, 6}, {6, 7, 8}};
    System.out.println(Arrays.toString(ArrayOps.sumRows(test2)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(test2)));
    System.out.println(ArrayOps.sum(test2));

    //Part 5
    System.out.println(Arrays.toString(ArrayOps.sumCols(test2)));

    int[][] test3 = { {  1,  2, 3, 4 },{  2, 3,  4,  1 }, { 3, 4,  1, 2 } };
    System.out.println(ArrayOps.isRowMagic(test3)); //true
    System.out.println(ArrayOps.isRowMagic(test2)); //false

    int[][] test4 = { {  1,  1, 1 },   {  2, 2, 2 },{ 3,  3, 3 } };
    System.out.println(ArrayOps.isColMagic(test3)); //false
    System.out.println(ArrayOps.isColMagic(test2)); //false
    System.out.println(ArrayOps.isColMagic(test4)); //true

    int[][] test5 = { {  2,  2, 2 },{  2, 2, 2 } };
    System.out.println(ArrayOps.isRowMagic(test5));
    System.out.println(ArrayOps.isColMagic(test5));
  }
}
