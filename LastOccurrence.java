package BinarySearch.Qs3;

public class LastOccurrence {
    static int searchLastOccur(int[] arr, int target){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int ans = -1;

        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] == target){
                ans = mid;
                st = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 18, 20};
        int target = 10;

        int result = searchLastOccur(arr, target);
        if(result != -1)
            System.out.println("Last occurrence of " + target + " is at index: " + result);
        else
            System.out.println("Target not found.");
    }
}
