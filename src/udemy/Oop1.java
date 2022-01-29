package udemy;

//FarmMachine의 속성과 동작을 가지는 클래스를 코드로 구현하고 객체를 생성해서
//프로그램을 동작시켜라
public class oop1 {

	public static void main(String[] args) {
		
		//[3]객체를 생성하자 
		FarmMachine fm = new FarmMachine(); 
		//=>new라는 키워드는 객체를 생성해줌.
		//=>그 생성한 객체를 FarmMachine타입의 fm이라는 변수에 담는다
		//객체는 레퍼런스타입이라 syso(fm)시에 메모리의 주소값이 찍힘

		//[4]생성된 객체에 속성 값 입력하자
		System.out.println(fm.price);
		System.out.println(fm.age);
		System.out.println(fm.color);
		fm.digging();
		fm.moving(); 
		fm.grinding();
	}

}

//
//농기계를 만들어내는 공장(Class)생성
class FarmMachine{
	 
	//[1]속성,특징
	int price = 1000000;
	int age = 2020;
	String color = "red";
	
	//[2]메소드,기능
	public  void moving() {
		System.out.print("Farm-machine is moving");		
	}
	
	public  void digging() {
		System.out.println("Farm-maching is digging");
	}
	
	public void grinding() {
		System.out.println("Farm-machine is grinding");
	}
}