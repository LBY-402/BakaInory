package com.baka.examination;

public class Leet0001 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        merge(nums1 , 3, nums2 , 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = m - 1;
        int k = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (j < 0){
                nums1[i] = nums2[k];
                k--;
            } else if(k < 0){
                nums1[i] = nums1[j];
                j--;
            } else if (nums1[j] > nums2[k]) {
                nums1[i] = nums1[j];
                j--;
            } else {
                nums1[i] = nums2[k];
                k--;
            }
        }

    }


    /**
     * 注意事项
     *  如果引用中间变量 并且直接将num1 赋值成中间变量  中间变量会因为num1 的变化而变化 所以导致输出错误
     *  采用双指针 新增中间变量 但是不能直接赋值 需要for循环写入
     *
     *  因为num1的后面部分都为0  所以可以从后往前写 从最大开始写
     *  又因为两个数据都是递增 所以从最后一位看是判断  大的写入即可
     */
}
