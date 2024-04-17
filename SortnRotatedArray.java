// By using for loop

public class SortnRotatedArray {
    public static void target(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            int si = 0;
            int ei = arr.length - 1;

            // Base Case
            if (si > ei) {
                System.out.println(-1);
                return;
            }

            // mid
            int mid = si + (ei - si) / 2;
            if (arr[mid] == key) {
                System.out.println(mid);
                return;
            }

            // L1
            if (arr[si] <= arr[mid]) {
                // case a: left
                if (arr[si] <= key && key <= arr[mid]) {

                    return;
                }
                // case:b right
                else {
                    System.out.println(mid + 1);
                    return;
                }
            }

            else {

                // case c: left
                if (arr[mid] <= key && key <= arr[ei]) {
                    System.out.println(mid + 1);
                    return;
                    // case d: right
                } else {
                    System.out.println(mid - 1);
                    return;
                }

            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int key = 4;
        target(arr, key);

    }

}
