public class Bubble {
    public static void main(String[] args) {
        int nums[] = {5,6,7,3,19,2, 4, 10,20,1, 12, 14, 48, 67, 11};
int temp = 0;
        System.out.println("Before sorting");

        for(int num:nums){
            System.out.print(num + " ");
        }
int size = nums.length;
   for(int i = 0; i < size; i++){
       for(int j = 0; j < size - i- 1; j++){
           if(nums[j] > nums[j+1]){
               temp = nums[j];
               nums[j] = nums[j+1];
               nums[j+1] = temp;
           };
       }
       System.out.println();
       for(int num:nums){
           System.out.print(num + " ");
       }

   }
        System.out.println();
        System.out.println("After sorting"  );
        for(int num:nums){
            System.out.print(num + " ");
        }


    }
}
