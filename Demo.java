public class Demo {
    public static void main(String[] args) {
        int nums[] = new int[100000];
        int target = 400;
        int result1 = linearSearch(nums, target);
        int result = binarySearch(nums, target);
        if(result != -1)
            System.out.println("Element found at index " + result  );
        else
            System.out.println("Element not found");
    }
    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Linear steps "+steps);
                return i;
            }
        }
        System.out.println("Linear steps "+steps);
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int steps = 0;
       int left = 0, right = nums.length - 1;
       while(left <= right){
           steps++;
           int mid = (left + right) / 2;
           if(nums[mid] == target){
               System.out.println("Binary steps "+steps);
               return mid;
           }
           else if(nums[mid] < target){
               left = mid + 1;
           }
           else{
               right = mid - 1;
           }

       }
       System.out.println("Binary steps "+steps);
        return -1;
    }
}
