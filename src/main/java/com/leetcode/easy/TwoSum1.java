package com.leetcode.easy;

/**
 * @Description 两数之和
 * @Author Ray.Wong
 * @Date 2020/4/19 上午12:58
 **/

/**
 *  给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 *  你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 *  
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoSum1 {

    public int[] towSum(int[] nums,int target){
        int[] subscriptArr = new int[2];
        if(nums.length < 2){
            return subscriptArr;
        } else {

            for(int i = 0; i < nums.length; i++) {
              int j = 1;
                for(; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target && i != j){
                        subscriptArr[0] = i;
                        subscriptArr[1] = j;
                        return subscriptArr;
                    }
                }
            }
        }

        return subscriptArr;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,5,11};
        TwoSum1 twoSum1 = new TwoSum1();
        int[] subscripArr = twoSum1.towSum(nums,10);
        System.out.println(subscripArr[0]);
        System.out.println(subscripArr[1]);

        int[] nums2 = {2,7,11,15};
        TwoSum1 twoSum3 = new TwoSum1();
        int[] subscripArr2 = twoSum3.towSum(nums2,9);
        System.out.println(subscripArr2[0]);
        System.out.println(subscripArr2[1]);

    }
}
