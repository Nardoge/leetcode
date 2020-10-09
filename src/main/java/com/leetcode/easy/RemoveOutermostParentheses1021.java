package com.leetcode.easy;

/**
 * @Description: 删除最外层括号
 * @Author Ray.W
 * @Date 2020/8/11 11:34
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 有效括号字符串为空 ("")、"(" + A + ")" 或 A + B，其中 A 和 B 都是有效的括号字符串，+ 代表字符串的连接。例如，""，"()"，"(())()" 和 "(()(()))" 都是有效的括号字符串。
 * <p>
 * 如果有效字符串 S 非空，且不存在将其拆分为 S = A+B 的方法，我们称其为原语（primitive），其中 A 和 B 都是非空有效括号字符串。
 * <p>
 * 给出一个非空有效字符串 S，考虑将其进行原语化分解，使得：S = P_1 + P_2 + ... + P_k，其中 P_i 是有效括号字符串原语。
 * <p>
 * 对 S 进行原语化分解，删除分解中每个原语字符串的最外层括号，返回 S 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入："(()())(())"
 * 输出："()()()"
 * 解释：
 * 输入字符串为 "(()())(())"，原语化分解得到 "(()())" + "(())"，
 * 删除每个部分中的最外层括号后得到 "()()" + "()" = "()()()"。
 * 示例 2：
 * <p>
 * 输入："(()())(())(()(()))"
 * 输出："()()()()(())"
 * 解释：
 * 输入字符串为 "(()())(())(()(()))"，原语化分解得到 "(()())" + "(())" + "(()(()))"，
 * 删除每个部分中的最外层括号后得到 "()()" + "()" + "()(())" = "()()()()(())"。
 * 示例 3：
 * <p>
 * 输入："()()"
 * 输出：""
 * 解释：
 * 输入字符串为 "()()"，原语化分解得到 "()" + "()"，
 * 删除每个部分中的最外层括号后得到 "" + "" = ""。
 *  
 * <p>
 * 提示：
 * <p>
 * S.length <= 10000
 * S[i] 为 "(" 或 ")"
 * S 是一个有效括号字符串
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-outermost-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RemoveOutermostParentheses1021 {

    private boolean isLeftBrackets(char bracket) {
        return bracket == 40;
    }

    public String removeOuterParentheses(String S) {
        char[] bracketsArr = S.toCharArray();
        Stack stack = new Stack();
        List removeList = new ArrayList();
        int cursor = 0;
        for (char bracket : bracketsArr) {

            stack.push(bracket);
            if (isLeftBrackets(bracket)) {
                cursor++;
            } else {
                cursor--;
                if (cursor == 0) {
                    int stackSize = stack.size();
                    if (stackSize == 2) {

                    } else {
                        removeList.addAll(stack.subList(1, stack.size() - 1));

                    }
                    stack.clear();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Object c : removeList){
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveOutermostParentheses1021 removeOutermostParentheses1021 = new RemoveOutermostParentheses1021();
        System.out.println(removeOutermostParentheses1021.removeOuterParentheses("(()())(())(()(()))"));
    }
}
