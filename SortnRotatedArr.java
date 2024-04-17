// sorted and rotated array code

public class SortnRotatedArr {
    public static int search(int arr[], int target, int si, int ei) {

        // Base case
        if (si > ei) {
            return -1;
        }

        // find out mid
        int mid = si + (ei - si) / 2;
        // case found
        if (arr[mid] == target) {
            return mid;
        }
        // mid on L1

        if (arr[si] <= arr[mid]) {
            // case a: left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            }
            // case:b right
            else {
                return search(arr, target, mid + 1, ei);
            }
        }

        else {

            // case c: left
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
                // case d: right
            } else {
                return search(arr, target, si, mid - 1);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);
    }

}
