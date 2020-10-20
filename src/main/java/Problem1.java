public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
    Sort array by putting left as 0, right as 2, and we leave 1 alone.
    If the number at the start of the array is 0, we increase the array size.
    If the number is 2, we move them to the right, and the 1's are left alone.
    So now, we have set the 0's to the left, 1 is in the middle and the 2's are on the right.
     */
    // REMEMBER TO GO TO FILE > SETTINGS > BUILD, EXEC... > COMPLIER > EXCLUDES for problem 3 when 1 and 2 are done
    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int temp = 0;

        // while loop to handle right and left
        while(right >= left && temp <= right)
        {

            if(nums[temp] == 0)
            {
                // put 0 as first in the array
                nums[temp] = nums[left];
                nums[left] = 0;
                left++;
                temp++;
            }
            // put 2 on the right
            else if(nums[temp] == 2)
            {
                nums[temp] = nums[right];
                nums[right] = 2;
                right--;
            }
            // else, for 1
            else
            {
                temp++;
            }
        }
    }
}
