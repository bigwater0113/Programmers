package level1;
/*
 * ������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.
�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, 
�������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 * participant	completion	return
["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"
 */
import java.util.Arrays;

public class test03 {
	public static void main(String[] args) {
		String[] participant= {"leo", "kiki", "eden"};
		String[] completion= {"eden", "kiki"};
		Arrays.sort(participant);
		Arrays.sort(completion);
		String answer=participant[participant.length-1];
		for(int i=0;i<completion.length;i++) {
			if(!participant[i].equals(completion[i])) {
				answer=participant[i];
				break;
			}
		}
		System.out.println(answer);
//		String answer = "";
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1); // �ش��̸� player 1��..  �������� +1..
//        for (String player : completion) hm.put(player, hm.get(player) - 1); // �����ѻ�� -1 0���θ����.
//
//        for (String key : hm.keySet()) {
//            if (hm.get(key) != 0){
//                answer = key;
//            }
//        }
//        return answer;
	}
}
