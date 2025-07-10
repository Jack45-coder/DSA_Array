package BinarySearch.Qs2;

public class UnsortedArray {
    static void binarySearch(int[] arr, int target){
        int st = 0;
        int end = (arr.length)-1;
        boolean found = false;
        while(st <= end){
            int mid = st+(end-st)/2;
            if(arr[mid] == target){
                System.out.println("Target "+ target + " found at index: "+mid);
                found = true;
                break;
            } else if (target > arr[mid]) {
                end = mid - 1;
            }else {
                st = mid+1;
            }
        }
        if(!found){
            System.out.println("Target " + target + " not found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {90, 78, 56, 45, 34, 12};
        int target = 34;
        binarySearch(arr, target);
    }
}
