public class FindTargetInRotatedArray {
    public static void main(String[] args) {
        int [] array = {7, 8, 9, 10, 12, 24, 4, 5, 6};
        int target = 5;
        int pivot = findpivot(array);
        System.out.println(pivot);
        int targetfound = findtarget(array, target, 0, pivot);
        System.out.println(targetfound);
        if(targetfound == -1){
            System.out.println(findtarget(array, target, pivot, array.length-1));
        }
    }

    static int  findtarget(int[] array, int target, int start, int end) {
        int pivot = findpivot(array);
        if (pivot == -1) {
            return binarysearch(array, target, 0, array.length - 1);
        }
        if(array[pivot] == target){
            return pivot;
        }
        if(target >= array[0]){
            return binarysearch(array, target, 0, pivot-1);
        }
        return binarysearch(array, target, pivot+1, array.length-1);

    }


    static int binarysearch(int[] array, int target, int start, int end) {
      while(start <= end){
              int mid = start + (end - start)/2;
              if(array[mid] == target){
                  return mid;
              }
              if(target> array[mid]){
                  start = mid+1;

              }
              if(target< array[mid]){
                  end = mid-1;
              }}
          return -1;
      }

    static int  findpivot(int[] array) {
    int start = 0;
    int end = array.length-1;
    while(start <= end){
        int mid = start + (end - start)/2;
        if (mid < end && array[mid] > array[mid +1]){
            return mid;
        }
        if (mid > start && array[mid] < array[mid-1]){
            return mid-1;
        }
        if(array[start] >= array[mid]) {
            end = mid - 1;
        }else{
            start = mid+1;
        }
    }
    return -1;}
}
