package level1;
/*
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
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
//        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1); // 해당이름 player 1명씩..  동명이인 +1..
//        for (String player : completion) hm.put(player, hm.get(player) - 1); // 도착한사람 -1 0으로만들기.
//
//        for (String key : hm.keySet()) {
//            if (hm.get(key) != 0){
//                answer = key;
//            }
//        }
//        return answer;
	}
}
