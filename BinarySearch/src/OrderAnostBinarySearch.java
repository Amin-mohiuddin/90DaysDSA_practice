public class OrderAnostBinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 36, 65, 74, 85, 89, 90, 95};
        int target = 20;
        int ans = oderAgnos(arr, target);
        System.out.println(ans);
    }

    static int oderAgnos(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}


