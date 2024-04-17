public class MajorityElement {

    // Brute Force Approach

    // public static int majorityele(int ar[]) {
    // for (int i = 0; i < ar.length; i++) {
    // int count = 1;
    // for (int j = i + 1; j < ar.length; j++) {
    // if (ar[i] == ar[j]) {
    // count++;
    // }
    // }

    // if (count > ar.length / 2) {
    // return ar[i];
    // }
    // }
    // return -1;
    // }

    // public static void main(String[] args) {
    // int ar[] = { 3, 2, 3 };
    // System.out.println(majorityele(ar));
    // }
    // }

    // Optimized code
    // Bayer Moore Majority Voting Algorithm.

    // public static int majorityele(int arr[]) {

    // int maj = arr[0];
    // int count = 1;
    // for (int i = 0; i < arr.length; i++) {
    // if (maj == arr[i]) {
    // count++;
    // } else {
    // count--;
    // }
    // if (count == 0) {
    // maj = arr[i];
    // count = 1;
    // }

    // }
    // return maj;
    // }

    // public static void main(String[] args) {
    // int arr[] = { 3, 2, 3 };
    // System.out.println(majorityele(arr));
    // }

    // }

    // Given an array A of N elements. Find the majority element in the array. A
    // majority element in an array A of size N is an element that appears strictly
    // more than N/2 times in the array.
    public static int majorityele(int arr[]) {
        int maj = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (maj == arr[i]) {
                count++;
            } else {
                count--;

            }
            if (count == 0) {
                maj = arr[i];
                count = 1; // reinitialize count as 1
            }
        }
        // for loop to iterate each ele and count the maj
        int totalCount = 0;
        for (int value : arr) {
            if (value == maj) {
                totalCount++;
            }
        }
        if (totalCount > arr.length / 2) {
            return maj;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        System.out.println(majorityele(arr));
    }

}