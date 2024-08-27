public class DataStructures {

        public static void main(String[] args) {
            int nums[] = new int[100000];
            int target = 400;
            int result1 = linearSearch(nums, target);
            int result = binarySearch(nums, target, 0, nums.length - 1);
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

        public static int binarySearch(int[] nums, int target, int left, int right) {

      if(left <= right) {
          int mid = (left + right) / 2;
          if(nums[mid] == target)
              return mid;

          else if(nums[mid] > target)
              return binarySearch(nums, target, left, mid - 1);

          else
              return binarySearch(nums, target, mid + 1, right);

      }
            return -1;
        }
    }


