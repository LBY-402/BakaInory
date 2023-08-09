package com.baka.examination;

/**
 * @author bakai
 */
public class Leet0005 {

    /**
     * 169. 多数元素
     */
    public static int majorityElement(int[] nums) {
        int count = 1;
        int nowValue = nums[0];

        for(int i = 1 ; i < nums.length ; i ++ ){
            if(nowValue == 0){
                nowValue = nums[i];
            }
            if(nums[i] == nowValue){
                count++;
            }
            if(nums[i] != nowValue){
                count--;
            }
            if(count == 0){
                nowValue = 0;
            }

        }
        return nowValue;
    }


    /**
     * 思路
     * 摩尔投票算法  （适用于多数元素 因为多数元素必大于n/2 所以适用
     *
     * 随机选一个值 票数为 1
     * 当出现与他相同的数字时 票数加一
     * 当出现与他不同的数字时 票数减一
     * 当票数为0后 重置当前值 并获取下一个出现的值为当前值
     * 因为 多位元素 > n/2  所以 即使其他所有元素都减掉票 它依然为正票 留下的最后的值为多位元素
     *
     *
     *
     *
     * 方法二
     *  采用排序算法 因为当前多位元素必能占数组中一半以上 所以中间的值必然是多位元素
     */
}
