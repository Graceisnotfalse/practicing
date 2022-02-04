package udemy;


//문제 : 객체에 대한 참조값을 요소로 가지는 객체 배열을 생성하는 코드 
//      (즉, 객체의 요소들이 기본형타입이 아닌 참조형타입이고 그 참조형타입을 배열로 가지는 객체배열을 생성하라
//       == 기본형 타입이 아닌 참조형 타입의 객체가 원소인 객체배열을 구현할 수 있는지)
//     반복문을 사용하라

class Person2{
	//[1]필드 (this.name 의 name 이 이 필드)
	private  String name;
	private int age;
	 
	//[2]생성자 : 객체 생성 시 가정먼저 호출되는특별한 메소드
	//          그 객체를 만들어내는 클래스명과 동일하다
	//          디폴트생성자를 가지고있고 생성자메소드는 상속되지않는다
	Person2(){}
	Person2(String name,int age){
		this.name = name;
		this.age = age;
	}
	//[3]기능,메소드
	public void setName(String name) { this.name = name;}
	public String getName() {return name;}
	
	public void setAge(int age) {this.age = age;}
	public int getAge() {return age;}
}

//틈새복습 : 하나의 자바파일에 public클래스가 하나도 없을 수 있다 (단, 없다면 메인메소드가 있는 클래스가 자연스레 제목이 된다)
//        하나도 없을 수는 있지만 2개 이상 있을 순 없다
//        만약 public키워드가 붙은 클래스가 있다면 그 클래스에는 메인메소드가 존재해야함 
public class Oop6{
	
	public static void main(String[] args) {
		//[1]: 객체 배열 (배열의 공간에 객체의 주소값을 가지고있는 배열 , 문자열배열 정수형 배열등과 개념이 똑같음)
		int[] arr1 = {1,2,3,4,5};
		char[] arr2 = {'a','b','c','d','e'};
		
		//5개의 공간을 가지는 Person2타입의 객체 배열이 생성됨(==>객체는 참조형타입이다,즉 참조형 타입의 객체가 이 배열의 원소가 된다)
		Person2[] pa = new Person2[5]; 
		pa[0] = new Person2("홍길동",20);
		pa[1] = new Person2("김길동",25);
		pa[2] = new Person2("히길동",30);
		pa[3] = new Person2("노길동",35);
		pa[4] = new Person2("이길동",40);
		
		//[2]:출력
		for(int i = 0 ; i<arr1.length; i++) {
			System.out.println(i + ""); //배열의 인덱스가 출력됨
		}
		System.out.println("--------------");
		for(int i = 0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("--------------");
		for(int i = 0; i<pa.length; i ++) {
			System.out.println(pa[i].getName()+ " ");
		}
		
		Person2[] pa1; //Person2타입의 객체배열 변수 선언
		pa1 = new Person2[5]; //Person2타입의 객체의 참조값을 원소로가지는 5개짜리 배열공간 생성
		
		for(int i = 0; i<pa1.length; i++) {
			pa1[i] = new Person2(i+"번후보자",i+20); //i만입력하면 int형이기때문에 뒤에 문자열을 붙여줘야 String값을 보낼수있음
			System.out.println(pa1[i].getName()+"의 나이가 " + pa1[i].getAge());
			System.out.printf("%s번 후보자의 나이는 %d살%n",pa1[i].getName(),pa1[i].getAge());
		}
	}
}
	   

