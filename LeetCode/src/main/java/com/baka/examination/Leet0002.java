package com.baka.examination;

public class Leet0002 {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    /**
     * 双指针 一个指向遍历数组 一个指向要写入的位置  当遍历不为所在值的变量时  写入位置写入 并向前移动一位
     */
}
