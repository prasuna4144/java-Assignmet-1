Question 1: Find missing numbers in array -
Points: 5 
Skill Mapping: Basic


Description: Consider an array with N number of consecutive integers, in which few numbers are missing. Find and list down these missing numbers using Java.
Sample input : arrNum = {1, 2, 4, 5, 6}
Output : 3


Sample input : arrNum= {1, 2, 3, 5, 6, 8, 10, 11, 14}
Output : 4, 7, 9, 12, 13


Program:
public class NumberMissing {
    public static void main(String[] args) {
        int[] arrNum = { 1, 2, 4, 5, 6 };
        int n = arrNum.length;
        int max = arrNum[n - 1];

        System.out.print("Missing numbers are: ");
        for (int i = 0; i < n - 1; i++) {
            if (arrNum[i + 1] - arrNum[i] > 1) {
                for (int j = arrNum[i] + 1; j < arrNum[i + 1]; j++) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}
Output:
PS D:\FSD\30-01-23> javac NumbersMissing.java
PS D:\FSD\30-01-23> java NumbersMissing
Missing numbers are: 3


