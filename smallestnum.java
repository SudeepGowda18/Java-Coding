import java.util.*;

public class smallestnum {
  public static void main(String args[]) {
    int arr1[] = { 2, 5, 4, 8, 3, 1 };
    System.out.println(sort(arr1));
    int arr2[] = { 14, 11, 54, 84, 17, 25 };
    System.out.println(sort(arr2));
  }
    static int sort(int arr[]){
      int min = arr[0];
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
          min = arr[i];
        }
      }
      return min;
  }
}