package programmus;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Level1_01 {
    // ���Ի�� ������ �Խ��� �ҷ� �̿��ڸ� �Ű��ϰ� ó�� ����� �Ű��� �������� �߼��ϴ� �ý����� �����Ϸ��Ѵ�.
	// ->��Ģ 1: �� ������ �ѹ��� �Ѹ��� ������ �Ű����ϴ� �� �Ű�Ƚ���� ������ ����. �ٸ� �������� ��� �Ű����ϴ�
	//           �� ������ ������ �Ű��Ҽ������� ������ ���������� �Ű�� 1ȸ�� ó���ȴ�
	// ->��Ģ 2: k�� �̻� �Ű�� ������ �Խ��� �̿��� �����Ǹ� �ش� ������ �Ű��� ��� �������� ��������� ���Ϸ� �߼��Ѵ�.
	
	//id_list�� ������ id�� ��� String�迭, report�� �� ������ �Ű��� id�� ������ ��� String�迭
	//k�� ��������ȸ���� �Ǵ� �Ű�Ƚ��
	//�� �������� ó�� ��� ������ ���� Ƚ���� �迭����� return�ϵ��� solution�Լ��� �ϼ��϶�
	//�ᱹ �ڱⰡ �Ű��� ������ ������������ �� ������ ������������� �ްԵȴ�.
	public int[] solution(String[] id_list,String[] report,int k ) {
		
		//HashSet�� Set�������̽��� ������ Ŭ������ �ߺ����� ��������ʴ´� 
		//�� ������ �ѹ��� �Ѹ��� ������ �Ű��� �� �ְ� �� ������ ������ �Ű��� �� ������ ������ ���������� �Ű�Ƚ���� 1ȸ�� ó���ȴ�
		//�׷��� ������ �ߺ����� ��������ʴ� HashSetŸ������ ����
		
		//�� ������ ���̵� �Ű��ϴ� Ƚ����ŭ �þ���� �ߺ� KEY���� �����´� 
		Map<String,HashSet<Integer>> reportId = new HashMap<>();
	     
		//�Ű��� ������ ���� ����Ƚ��
		Map<String,Integer> getMailCount = new HashMap<>();
		//�ڷ��� ������ : �迭��
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
