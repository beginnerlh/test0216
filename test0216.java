/*
 * ���ܹ��� n öӲ�ң�����Ҫ�����ǰڳ�һ��������״���� k �оͱ��������� k öӲ�ҡ�
����һ������ n���ҳ����γ����������е���������
n ��һ���Ǹ�������������32λ�з������͵ķ�Χ�ڡ�
ʾ�� 1:
n = 5
Ӳ�ҿ����г����¼���:
��
�� ��
�� ��
��Ϊ�����в����������Է���2.

ʾ�� 2:
n = 8
Ӳ�ҿ����г����¼���:
��
�� ��
�� �� ��
�� ��
��Ϊ�����в����������Է���3.



����һ�����ʣ�����Ҫ�жϵ��ʵĴ�дʹ���Ƿ���ȷ��
���Ƕ��壬���������ʱ�����ʵĴ�д�÷�����ȷ�ģ�
ȫ����ĸ���Ǵ�д������"USA"��
������������ĸ�����Ǵ�д������"leetcode"��
������ʲ�ֻ����һ����ĸ��ֻ������ĸ��д�� ���� "Google"��
�������Ƕ����������û����ȷʹ�ô�д��ĸ��

ʾ�� 1:
����: "USA"
���: True

ʾ�� 2:
����: "FlaG"
���: False

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

