
public class Unique {
    public static void main(String[] args) {
      int[] arrNum = {1, 2, 2, 1, 3, 4, 3, 4, 1, 5, 3, 5};
      int n = arrNum.length;
      int[] unique = new int[n];
      int count = 0;
  
      for (int i = 0; i < n; i++) {
        boolean flag = true;
        for (int j = 0; j < count; j++) {
          if (arrNum[i] == unique[j]) {
            flag = false;
            break;
          }
        }
        if (flag) {
          unique[count++] = arrNum[i];
        }
      }
  
      System.out.print("Unique numbers are: ");
      for (int i = 0; i < count; i++) {
        System.out.print(unique[i] + "");
}
}
  } 

