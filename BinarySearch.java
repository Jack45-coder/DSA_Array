package BinarySearch.Qs1;

public class BinarySearch {
    static boolean binarySearch(int[] arr, int target) {
        int n = arr.length;
        int st = 0;
        int end = n - 1;

        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                st = mid + 1;
                ;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    static boolean recBinarySearch(int[] arr, int st, int end, int target) {
        if (st > end) return false;  // Base Case

        int mid =  st+(end-st)/2;
        if (target == arr[mid]) {
            return true;
        } else if (target < arr[mid]) {
            return recBinarySearch(arr, st, mid - 1, target);  // Subproblem
        } else {
            return recBinarySearch(arr, mid + 1, end, target);  // Subproblem
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 67, 90};
        int target = 11;
        while (target != 90) {
            System.out.printf("%d exist in arr: %b\n",target, recBinarySearch(arr,0,arr.length-1, target));
            System.out.printf("%d exist in arr: %b\n",target, binarySearch(arr, target));
            System.out.println();
            target++;
        }
    }
}