public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
    Search array, and if i is not the same as j, then keep searching through array.
    If it is the same, then use index as replacement number, then keep searching.
    Returns index at the end when done searching.

     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {

        int i = 0;
        int index = 1;

        for (int j = 0; j < nums.length; j++)
        {
            // if j not the same as i, keep searching
            if(nums[j] != nums[i])
            {
                i++;
                nums[i] = nums[j];
                index++;
            }
        }

        return index; // place holder
    }
}
