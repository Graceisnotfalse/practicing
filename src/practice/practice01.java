package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class practice01 { //Ŭ������ ��ü�� ��������� ���赵
	public static void main(String[] args) {
	int value; //������������ �ʱ�ȭ�� �ȵ� ���ͷ����� ���� 
	           //value�� main�޼ҵ� ��Ͽ��� ����� ��������
    value =30;
    int result = value+30;
	System.out.println(result);
	int value1;
	if(1==1) {
		value1 = 40;
	}
	value1 =50;
	System.out.println(value1);
	
	//�÷��������ӿ�ũ,
	//�����͸� ���� ȿ�������� ó���� �� �ִ� ǥ��ȭ�� ����� �����ϴ� Ŭ������ ����
	//�� �����͸� �����ϴ� �ڷᱸ���� �����͸� ó���ϴ� �˰����� ����ȭ�Ͽ� Ŭ������ �����Ѱ�
	//�����͸� �����ϴ� �ڷᱸ���������� ������� ����Ǵ� ������� List��
	//������ ������� Set�������̽� key-value�� ������ ����Ǵ� Map�������̽��� �ִ�
	
	//�����͸� �迭ó�� �����ϰ�ʹ��ϸ� List�÷����� ����Ѵ�
	//List�÷����� ���α����� �迭�� �Ǿ��־ ������� ���� ����ǰ�
	//����� index������� ������ �Ǳ⶧���� �� �ߺ��� ���
	List<Integer> list = new ArrayList<>();
	list.add(3);
	list.add(5);
	list.add(5);
	System.out.println("list�� �ε��� 1�� : "+list.get(1));
	System.out.println("list�� ũ�� : "+list.size());
	System.out.println(list);
	
	//�� ��ü�� key�� �ǹǷ� ���� �ߺ��ɼ�����
	//�ߺ����ſ����� Set�÷����� ����Ѵ�
	Set<Integer> set = new HashSet<>(); 
	set.add(1);
	set.add(3);
	set.add(3); //add�޼ҵ��� ��ȯ�� Ÿ���� boolean�̴�
	System.out.println(set);
    System.out.println(set.add(7)); //true 
	System.out.println(set.size()); //�������� �ߺ������� ��������ʱ⶧���� ������� 
	
	//map�� key�� value �ΰ����� ��Եȴ�
	//HashMap�� Map�̶�� �������̽��� �����ϴ� ���� ��ǥ���� Ŭ����
	//keyŸ��(�Ӽ�)�� valueŸ���� �־��ش�.
	//value�� �ڷ������� ���ڵ� �ְ� �������ְ������ Object ����ϸ�ȴ�
	Map<String,String> map = new HashMap<>();
	map.put("name", "����");
	map.put("age", "29");
	map.put("title", "���� �����ΰ�");
	System.out.println(map);
	map.put("title", "��");
	System.out.println(map.get("title"));
	System.out.println(map.put("name", "����"));} //�������
}
