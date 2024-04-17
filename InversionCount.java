public class InversionCount {
    // *************** Brute Force Approach ****************
    // public static int getInversion(int arr[]) {
    // int inversionCount = 0;
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] > arr[j]) {
    // inversionCount++;

    // }
    // }

    // }
    // return inversionCount;
    // }

    public static int mergeSort(int arr[], int left, int right) {
        int inversionCount = 0;
        if (right > left) {
            int mid = (left + right) / 2;

            inversionCount = mergeSort(arr, left, mid);
            inversionCount += mergeSort(arr, mid + 1, right);
            inversionCount += merge(arr, left, mid + 1, right);
        }

        return inversionCount;
    }

    public static int merge(int arr[], int left, int mid, int right) {
        int inversionCount = 0;
        int temp[] = new int[right - left + 1];
        int i = left;
        int j = mid;
        int k = 0;

        while (i < mid && j <= right) {
            if (arr[i] > arr[j]) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j];
                inversionCount += (mid - i);
                j++;
            }
            k++;

        }
        while (i < mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
        return inversionCount;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 20, 6, 4, 5 };
        System.out.println(mergeSort(arr, 0, arr.length - 1));
    }
}
