package level1;

import java.util.ArrayList;

/*�����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. 
 * �����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.

1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, 
���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 * 
 * 
 */
public class test04 {
	public static void main(String[] args) {
		int[] answers= {1,2,3,4,5};
		int[][] user= {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
		int max=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<user.length;i++) {
			int correct=0;
			for(int j=0;j<answers.length;j++) {
				if(answers[j]==user[i][j%user[i].length]) {
					System.out.println("����");
					correct++;
				}
			}
			if(correct>max) {
				list.clear();
				list.add(i+1);
				max=correct;
			}else if(correct==max){
				list.add(i+1);
			}
			System.out.println(i+1 +"��°" + correct);
		}
		int[] answer=new int[list.size()];
		for(int i=0;i<list.size();i++) {
			answer[i]=list.get(i);
		}
		for(int a:answer) {
			System.out.println(a);
		}
	}
}
