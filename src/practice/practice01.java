package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class practice01 { //클래스는 객체를 만들기위한 설계도
	public static void main(String[] args) {
	int value; //선언은했지만 초기화가 안됨 리터럴값이 없어 
	           //value는 main메소드 블록에서 선언된 지역변수
    value =30;
    int result = value+30;
	System.out.println(result);
	int value1;
	if(1==1) {
		value1 = 40;
	}
	value1 =50;
	System.out.println(value1);
	
	//컬렉션프레임워크,
	//데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합
	//즉 데이터를 저장하는 자료구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현한것
	//데이터를 저장하는 자료구조유형에는 순서대로 저장되는 목록형인 List와
	//순서가 상관없는 Set인터페이스 key-value가 쌍으로 저장되는 Map인터페이스가 있다
	
	//데이터를 배열처럼 관리하고싶다하면 List컬렉션을 사용한다
	//List컬렉션의 내부구조는 배열로 되어있어서 순서대로 값이 저장되고
	//저장시 index순서대로 저장이 되기때문에 값 중복을 허용
	List<Integer> list = new ArrayList<>();
	list.add(3);
	list.add(5);
	list.add(5);
	System.out.println("list의 인덱스 1번 : "+list.get(1));
	System.out.println("list의 크기 : "+list.size());
	System.out.println(list);
	
	//값 자체가 key가 되므로 값이 중복될순없다
	//중복제거용으로 Set컬렉션을 사용한다
	Set<Integer> set = new HashSet<>(); 
	set.add(1);
	set.add(3);
	set.add(3); //add메소드의 반환값 타입은 boolean이다
	System.out.println(set);
    System.out.println(set.add(7)); //true 
	System.out.println(set.size()); //데이터의 중복저장을 허용하지않기때문에 사이즈는 
	
	//map은 key와 value 두가지를 담게된다
	//HashMap은 Map이라는 인터페이스를 구현하는 가장 대표적인 클래스
	//key타입(속성)과 value타입을 넣어준다.
	//value에 자료형으로 문자도 넣고 정수도넣고싶으면 Object 사용하면된다
	Map<String,String> map = new HashMap<>();
	map.put("name", "지민");
	map.put("age", "29");
	map.put("title", "나는 누구인가");
	System.out.println(map);
	map.put("title", "네");
	System.out.println(map.get("title"));
	System.out.println(map.put("name", "지윤"));} //지민출력
}
