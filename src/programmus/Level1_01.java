package programmus;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Level1_01 {
    // 신입사원 지민은 게시판 불량 이용자를 신고하고 처리 결과를 신고한 유저에게 발송하는 시스템을 개발하려한다.
	// ->규칙 1: 각 유저는 한번에 한명의 유저만 신고가능하다 단 신고횟수에 제한은 없다. 다른 유저들을 계속 신고가능하다
	//           한 유저를 여러번 신고할수있지만 동일한 유저에대한 신고는 1회로 처리된다
	// ->규칙 2: k번 이상 신고된 유저는 게시판 이용이 정지되며 해당 유저를 신고한 모든 유저에게 정지사실을 메일로 발송한다.
	
	//id_list는 유저의 id가 담긴 String배열, report는 각 유저가 신고한 id의 정보가 담긴 String배열
	//k는 정지기준회숫가 되는 신고횟수
	//각 유저별로 처리 결과 메일을 받은 횟수를 배열에담아 return하도록 solution함수를 완성하라
	//결국 자기가 신고한 유저가 정지당했으면 그 유저의 수에따라메일을 받게된다.
	public int[] solution(String[] id_list,String[] report,int k ) {
		
		//HashSet은 Set인터페이스를 구현한 클래스로 중복값을 허용하지않는다 
		//각 유저는 한번에 한명의 유저를 신고할 수 있고 한 유저를 여러번 신고할 수 있지만 동일한 유저에대한 신고횟수는 1회로 처리된다
		//그렇기 때문에 중복값을 허용하지않는 HashSet타입으로 지정
		
		//각 유저가 아이디를 신고하는 횟수만큼 늘어나지만 중복 KEY값은 못갖는다 
		Map<String,HashSet<Integer>> reportId = new HashMap<>();
	     
		//신고한 유저가 받을 메일횟수
		Map<String,Integer> getMailCount = new HashMap<>();
		//자료형 변수명 : 배열명
		for(String id : id_list) {
			getMailCount.put(id, 0);
			reportId.put(id, new HashSet<>());
			
		}
		
		for(String rep : report) {
			String[] checkReport = rep.split(" ");
			reportId.get(checkReport[1]).add(checkReport[0]);
		};
		//
		
		int[] answer = {};
		return answer;
	}
}
