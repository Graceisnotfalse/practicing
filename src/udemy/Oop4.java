package udemy;


//[1]:OOP의 상속 (inheretence)
//    부모클래스가 가지고있는 속성(변수,상태)나 기능(메소드)를 물려받아서 새로운 로직을 구현
//    상속을 활용 시 물려받은 것들은 그대로 쓰면됨
//    물려주는 슈퍼클래스,부모클래스,상위클래스의 속성과 기능을 물려받는 서브클래스,자식클래스,하위클래스


//[2]:상속의 장점
//    재활용가능하다~
//    상속을 받아서 필요한것만 추가/수정해서 사용
//    부모클래스에 정의되어있는 속성을 멤버필드 혹은 멤버변수라고하는데 이들을 상속받아서 사용하면된다
//    상속받은 메소드라해도 필요에따라 자식클래스에서 용도를 변경해서 사용하는 것도 가능하다.

//[3]:상속의 사용
//    기존부모클래스를 확장한다=>extends키워드 사용
//    부모클래스의 멤버필드,메소드는 상속이 가능하나 생성자 메소드는 상속불가능
//    부모클래스의 접근제어자,접근제한자가 private인 경우엔 아무리 자식클래스가 상속받아도 접근불가능

public class Oop4{
   public static void main(String[] args) {
	   
	   //[1]객체생성
	   Person1 p1 = new Person1();
	   p1.walk(); //Person1타입에 없는 메소드 호출 시 The method eat() is undefined for the type Person1
	   
	   //h0객체가 생성될 때 호출되는 생성자메소드는 인자값을 저장할 파라미터변수가 없는 생성자메소드이다
	   Hero1 h0 = new Hero1();
	   //그 메소드를 호출 할때 먼저 부모클래스의 생성자메소드가 호출되기때문에 부모클래스의 필드의 값들이 세팅된다
	   h0.displayPerson();
	   //h1이라는 객체는 Person1클래스를 상속받은 Hero1클래스 타입이라서
	   //Hero1(String name,int age){} 생성자메소드를 호출할때 부모클래스에서 상속받은 필드(변수)인 power와 gender를 가장 먼저 초기화한다
	   Hero1 h1 = new Hero1("지민",29);
	   h1.walk();
	   h1.eat();
	   
	   //name과 age 변수가 선언만되어있고 리터럴값은 없다면?
	   //String의기본인 null과 int의 기본인 0이 출력된다
	   h1.displayPerson();
	   
	   //객체.변수로 값을 선언해준다면 값이 출력되곘지
	   h1.name= "지민";
	   h1.age = 10;
	   h1.power = 90; //부모클래스의 필드를 재정의해줌
	   h1.gender = 0; //부모클래스의 변수를 재정의해줌
	   h1.displayPerson();
	   
	   Hero1 h2 = new Hero1();
	  System.out.println(h2.power); //부모클래스가 갖고있던 멤버변수의 초기값을 불러온다
	  
	  //원더우먼객체생성
	  Hero1 h3 = new Hero1("원더우먼",30);
	  
	  h3.displayPerson();
	  h3.gender = 2;
	  h3.displayPerson();
}
}

//사람이 가지는 공통되는 속성이나 기능을 자식클래스닌 Hero1과 Villan1클래스에 물려준다
class Person1{
	
	//[2]:멤버필드,멤버변수
	int gender;
	int power;

	//[3]:생성자메소드
	Person1(){
		this.gender =1;
		this.power = 100;
	};
	//기능,메소드
	void walk() {
		System.out.println("걸어가고있다");
	}
}
class Hero1 extends Person1 {
	//변수,필드=>상속받은거 gender 랑 power
	String name;
	int age;
	
	//생성자메소드 : 객체가 생성될 때 가장 먼저 호출되는 특별한 메소드
	//            생성자메소드를 오버로딩!!할꺼면 디폴트생성자도 선언해줘야댐=> 오버로딩? 같은 이름의 메소드여도 호출하는 인자의 유형이나 갯수에따라 컴파일러가
	//            어떤 메소드를 부를지 알 수 있다
	Hero1(){}
	Hero1(String name,int age){
		//바로 아래코드가 부모클래스의 생성자메소드 호출하는 단계지만 생략해도 컴파일러가 자동으로 부모클래스로 가서 부모클래스의 생성자메소드를 호출한다
		super();
		this.name = name; 
		this.age = age;
		}
	//기능,메소드 : 상속받은 메소드를 재정의하겠다 오버라이딩!!
	//만약 아래의 walk메소드를 오버라이딩안했다면? 부모클래스가 갖고있는 메소드가 호출된다
	void walk() {
		System.out.println("두배는 빠르게 걸어가고있다");
	}
	
	void eat() {
		System.out.println("꼬북칩을 먹고있다");
	}
	
    void displayPerson(){
    	 System.out.println("이름 : " + name +",나이 :" + age +",파워:" + power + ",성별 : " + gender);
    }
    }
class Villain1 extends Person1{
	
	//변수,필드

	//생성자메소드
	Villain1(){}
}


