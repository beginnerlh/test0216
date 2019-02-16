/*
 * 你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
给定一个数字 n，找出可形成完整阶梯行的总行数。
n 是一个非负整数，并且在32位有符号整型的范围内。
示例 1:
n = 5
硬币可排列成以下几行:
¤
¤ ¤
¤ ¤
因为第三行不完整，所以返回2.

示例 2:
n = 8
硬币可排列成以下几行:
¤
¤ ¤
¤ ¤ ¤
¤ ¤
因为第四行不完整，所以返回3.



给定一个单词，你需要判断单词的大写使用是否正确。
我们定义，在以下情况时，单词的大写用法是正确的：
全部字母都是大写，比如"USA"。
单词中所有字母都不是大写，比如"leetcode"。
如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
否则，我们定义这个单词没有正确使用大写字母。

示例 1:
输入: "USA"
输出: True

示例 2:
输入: "FlaG"
输出: False

*/
package lianxi0216;
public class test0216 {
	public static void main(String[] args) {
		Solution S = new Solution();
		/*int n = 8;
		int count = S.arrangeCoins(n);
		System.out.println(count);*/
		String word ="Google";
		boolean a = S.detectCapitalUse(word);
		System.out.println(a);
	}

}

/*class Solution {
    public int arrangeCoins(int n) {
        int count = 0;
        int i = 1;
        while(n>=i)
        {
            n-=i;
            count ++;
            i++;
        }
        return count;
    }
}*/

class Solution {
    public boolean detectCapitalUse(String word) {
        if ( word == null || word == "" )
            return false;
        
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) <= 'Z' && word.charAt(i) >= 'A')
                count++;
        }
 
        if (count == word.length() || (count == 1 && word.charAt(0) >= 'A' 
                && word.charAt(0) <= 'Z') || count == 0)
            return true;
        return false;
    }
}

