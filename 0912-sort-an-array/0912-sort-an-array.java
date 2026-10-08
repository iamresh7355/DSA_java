class Solution {
    public int[] sortArray(int[] nums) {
        
//         for(int i=0;i<nums.length-1;i++) {
//             for(int j=0;j<nums.length-1-i;j++){
//          if(nums[j]>nums[j+1]) {
//          int temp = nums[j];
//            nums[j]=nums[j+1];
//            nums[j+1]=temp;
//         }
//         }
//         }
//         return nums;
//     }
// }


        int min = nums[0];
        int max = nums[0];

    
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        
        int[] count = new int[max - min + 1];
        for (int num : nums) {
            count[num - min]++;
        }

    
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[index++] = i + min;
                count[i]--;
            }
        }

        return nums;
    }
}