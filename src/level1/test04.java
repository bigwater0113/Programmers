package level1;

import java.util.ArrayList;

/*수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 
 * 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 
가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
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
					System.out.println("맞은");
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
			System.out.println(i+1 +"번째" + correct);
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
