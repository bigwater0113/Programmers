package level1;

import java.util.*;
/*
 * ���� �迭 numbers�� �־����ϴ�. numbers���� ���� �ٸ� �ε����� �ִ� �� ���� ���� �̾� ���ؼ� ���� �� 
 * �ִ� ��� ���� �迭�� ������������ ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.
 */
public class test01 {
	public static void main(String[] args) {
		int[] numbers= {2,1,3,4,1};
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<numbers.length;i++) {
			for(int j=(i+1);j<numbers.length;j++) {
				if(!list.contains(numbers[i]+numbers[j])) {
					list.add(numbers[i]+numbers[j]);
				}
			}
		}
		int[] answer=new int[list.size()];
		for(int i=0;i<list.size();i++) {
			answer[i]=list.get(i);
		}
		Arrays.sort(answer);
		for(int a:answer) {
			System.out.print(a + " ");
		}
	}
}
