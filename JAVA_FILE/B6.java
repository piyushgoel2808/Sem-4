public class B6 {
  //This program is Written by Piyush Goel
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
          if (arr[i] < min) {
            min = arr[i];
          }
        }
        System.out.println("The smallest element in the array is " + min);
      }
}
