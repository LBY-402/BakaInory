package com.baka.examination;

/**
 * @author bakai
 */
public class Leet0004 {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));;
    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length <= 2){
            return nums.length;
        }
        int left = 2;
        for(int right = 2 ; right < nums.length ; right ++){
            if (nums[left - 2] != nums[right]){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }


    /**
     * 思路及解法
     * 在阅读本题前，读者们可以先尝试解决「26. 删除有序数组中的重复项」。
     * 因为给定数组是有序的，所以相同元素必然连续。我们可以使用双指针解决本题，遍历数组检查每一个元素是否应该被保留，如果应该被保留，就将其移动到指定位置。
     * 具体地，我们定义两个指针 slow 和 fast 分别为慢指针和快指针，其中慢指针表示处理出的数组的长度，快指针表示已经检查过的数组的长度，
     * 即 nums[fast] 表示待检查的第一个元素，nums[slow−1]为上一个应该被保留的元素所移动到的指定位置。
     * 因为本题要求相同元素最多出现两次而非一次，所以我们需要检查上上个应该被保留的元素 nums[slow−2] 是否和当前待检查元素 nums[fast] 相同。
     * 当且仅当 nums[slow−2]=nums[fast]时，
     * 当前待检查元素 nums[fast] 不应该被保留（因为此时必然有 nums[slow−2]=nums[slow−1]=nums[fast]）。
     * 最后，slow 即为处理好的数组的长度。
     * 特别地，数组的前两个数必然可以被保留，因此对于长度不超过 222 的数组，我们无需进行任何处理，对于长度超过 222 的数组，我们直接将双指针的初始值设为 222 即可。
     */
}
