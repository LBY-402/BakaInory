package com.baka.examination;

/**
 * @author bakai
 */
public class Leet0006 {

    /**
     * 轮转数组
     */
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate2(nums , k);
        for (int i : nums){
            System.out.println(i);
        }
    }

    /**
     * 方法1
     *  空间复杂度 O（n） 时间复杂度 O（n）
     *  首先确定k 取余之后的值
     *
     *  然后取出nums中最后几位的数
     *  之后将前面的数据后移
     *  最后将取出的值放到最前面
     *
     *  复杂 但是有效
     */
    public void rotate(int[] nums, int k) {
        if (k % nums.length == 0) {
            return;
        }
        k = k % nums.length;
        int n = nums.length;
        int[] re = new int[k];
        int cur;
        for (int i = 0; i < k; i++) {
            cur = nums[i + n - k];
            re[i] = cur;
        }
        for (int i = 0; i < n - k; i++) {
            cur = nums[n - 1 - i - k];
            nums[nums.length - 1 - i] = cur;
        }
        for (int i = 0; i < k; i++) {
            cur = re[i];
            nums[i] = cur;
        }
    }



    /**
     *  方法2
     *  空间复杂度O（1）
     *  时间复杂度O(n*n)
     *  提交的时候超时了
     */
    public static void rotate2(int[] nums, int k) {
        if (k % nums.length == 0) {
            return;
        }
        k = k % nums.length;
        int n = nums.length;
        int cur;
        for (int i = 0 ; i < k ; i++){
            cur = nums[n - 1];
            for (int j = 0 ; j < n - 1 ; j ++){
                nums[n - 1 - j] = nums[n - 2 - j];
            }
            nums[0] = cur;
        }
    }


    /**
     *  方法3
     *  空间复杂度O（1）
     *  时间复杂度O(n)
     *  反转数组
     *
     *  首先将数组全部反转
     *  然后反转前k个  相当于轮转了K个到前面
     *  然后反转剩余的 相当于将之前的后推k位
     */
    public static void rotate3(int[] nums, int k) {
        if (k % nums.length == 0) {
            return;
        }
        k = k % nums.length;
        int n = nums.length;
        reserve(nums , 0 , n - 1);
        reserve(nums , 0 , k - 1);
        reserve(nums , k , n - 1);
    }

    private static void reserve(int[] nums, int start, int end) {
        int cur;
        while (start < end){
            cur = nums[end];
            nums[end] = nums[start];
            nums[start] = cur;
            start++;
            end--;
        }
    }
}
