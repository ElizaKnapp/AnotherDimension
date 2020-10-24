import java.io.*;
import java.util.*;

public class Tester {
  public static void main(String[] args) {
    //Where all the test cases and print statements are
    int[] test1 = {1, 3, 4};
    System.out.println(ArrayOps.sum(test1)); //8
    System.out.println(ArrayOps.largest(test1)); //4

    int[][] test2 = { {3, 2, 5}, {2, 1, 6}, {6, 7, 8}};
    System.out.println(Arrays.toString(ArrayOps.sumRows(test2))); //10, 9, 21
    System.out.println(Arrays.toString(ArrayOps.largestInRows(test2))); //5, 6, 8
    System.out.println(ArrayOps.sum(test2)); //40

    //Part 5
    System.out.println(Arrays.toString(ArrayOps.sumCols(test2))); //11, 10, 19

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

    int[][] E = { { 2,  4, 2 }, {  2, 2, 2 } };
    System.out.println(ArrayOps.isLocationMagic(E, 0, 1)); //false
    System.out.println(ArrayOps.isLocationMagic(E, 1, 1)); //true
  }
}
