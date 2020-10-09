package com.leetcode.easy;

/**
 * @Description: 替换数组元素
 * @Author Ray.W
 * @Date 2020/8/13 11:44
 */

import java.util.Arrays;

/**
 * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 * <p>
 * 完成所有替换操作后，请你返回这个数组。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：arr = [17,18,5,4,6,1]
 * 输出：[18,6,6,6,1,-1]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= arr.length <= 10^4
 * 1 <= arr[i] <= 10^5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReplaceElementsWithGreatestElementOnRightSide {

    /**
     *  暴力循环从左边比较的思路当然是很简单的，很有可能效率太低通过不了。
     *  将题目转化，从右开始把数字取出后向左比较，比左边的数字大则替换数组元素。
     *  比左边数字小则将比较的数字改变。
     */
    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            int[] intArr = {-1};
            return intArr;
        }

        Integer last = arr[arr.length - 1];
        int[] replaceArr = new int[arr.length];
        replaceArr[arr.length - 1] = -1;
        replaceArr[arr.length - 2] = last;

        for (int i = arr.length - 2; i > 0; i--) {
            if (last > arr[i]) {
                replaceArr[i - 1] = last;
            } else {
                last = arr[i];
                replaceArr[i - 1] = last;
            }
        }
        return replaceArr;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};

        ReplaceElementsWithGreatestElementOnRightSide test = new ReplaceElementsWithGreatestElementOnRightSide();
        int[] resultArr = test.replaceElements(arr);
        Arrays.stream(resultArr).forEach(System.out::println);
    }

}
