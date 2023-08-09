package com.baka.examination;

public class Leet0003 {
    public int removeDuplicates(int[] nums) {
        int left = 1;
        for(int right = 1 ; right < nums.length ; right++){
            if(nums[right] != nums[right -1]){
                nums[left] = nums[right];
                left ++;
            }
        }
        return left;
    }

    /**
     *  第0位肯定不会又变化 所以双指针从第一位开始
     *  分快慢指针 慢指针指向要写入的位置
     *  快指针指向遍历数组
     *  当快指针与前一个值相同时，则进行下一个遍历
     *  当快指针与前一个不同时 则写入慢指针位置 最后返回慢支针的数值即可
     */
}
