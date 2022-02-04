package udemy;


//문제 : getter와 setter가 포함된 클래스의 상속을 코드로 구현해보시오.
//     부모클래스는 Person0이고 자식클래스는 Villain0과 Hero0이다.
class Person0{
	
     //[1]:멤버변수,멤버필드 
	  //(private접근제어자 시 상속받아도 사용불가, 이때 사용하는게 getter와 setter)
	  //이 클래스내에서만 사용가능한 지역변수.즉 외부에선 사용불가능
	   private String name;
	   private int age;
	   private int height;
	   private int weight;
	  
	   //[2]:생성자메소드_해당 객체 생성 시 호출되는 특별한 메소드 (이 생성자 메소드는 상속불가)
	   Person0(){}
	   Person0(String name,int age,int height, int weight){
		   this.name=name;
		   this.age = age;
		   this.height = height;
		   this.weight = weight;
	   }
	   
	  //[3]:기능,메소드
	  //static void move() { //<=만약 static이 붙었으면 객체 생성안하고 바로 클래스.메소드로 호출가능
	   
	   //setter메소드 호출 시 인자값을 받을 파라미터변수가 있기때문에 객체의 값을 세팅할수있다
	   public void setName(String name) {this.name = name;}
	   public String getName() { return name;}
	   
	   public void setAge(int age) {this.age = age;}
	   public int getAge() {return age;}
	   
	   public void setHeight(int height) {this.height = height;}
	   public int getHeight() { return height;}
	   
	   public void setWeight(int weight) { this.weight = weight;}
	   public int getWeight() {return weight;}
	   
	  
	   void move() {System.out.println(name + "이동 중");}
	  
  }

class Villain0 extends Person0 {
	  //필드
	   private String unique_key;
	   private int weapon;   //1:총, 2:창
	   private double power;
	
	  //생성자메소드
	   Villain0(){}  //생략가능. 어차피 디폴트
	   //부모에게서 상속받은 필드 4개+자식클래스가 갖고있는 필드 3개
	   Villain0(String name,int age, int height, int weight,String unique_key,int weapon,double power){ 
		super(name,age,height,weight);//부모클래스의 생성자메소드가 먼저호출된다.인자값을 4개를 받는 생성자메소드가 호출되면서 세팅됨.
		this.unique_key = unique_key;
		this.weapon = weapon;
		this.power = power;
	   }
	
	  //기능,메소드
	   public void setUnique_key(String unique_key) {this.unique_key = unique_key ;}
	   public String getUnique_key() {return unique_key;}
	   
	   public void setWeapon(int weapon) { this.weapon = weapon; }
	   public int getWeapon() { return weapon;}
	   
	   public void setPower(double power) {this.power = power; }
	   public double getPower() { return power;}; 
	   
	   void display() {
		   System.out.println("이름 : " + getName());
		   System.out.println("나이 : " + getAge());
		   System.out.println("키 : " + getHeight());
		   System.out.println("몸무게 : " + getWeight());
		   System.out.println("번호 : "  + getUnique_key());
		   System.out.println("무기 : " +getWeaponName(getWeapon()));
		   System.out.println("파워 : " + getPower());
		   
	   }
	   
	   void move() {
		   System.out.println("악당은 2배빠르게 걸어간다");
	   }
	   
	   String getWeaponName(int a) {
		   String weapon;
		   switch(a) {
		   case 1 : 
			   weapon = "칼";
			   break;
		   case 2 :
			   weapon = "창";
			   break;
		   case 3 :
			   weapon = "방패";
			   break;
			   default :
				   weapon = "---";
				   break;
		   
		   }
		   return weapon;
	   }
	   
	   

}
class Hero0 extends Person0{
	    //필드
	
		//생성자메소드
		 //Villain0(){}
	   //  Hero0(String name){
		//	this.name = name;
		// }
		
		//기능,메소드
}

public class Oop5{
   public static void main(String[] args) {
	  
	   //[4]객체생성   
	   //Person0.move();
	   Person0 p0 = new Person0();
	   p0.move();
	   p0.setName("홍길동");
	   System.out.println(p0.getName());
	   p0.move();
	   
	   Villain0 v0 = new Villain0("좀비",100,490,192,"1500-12-31",4,99.5);
	   v0.display();
	   System.out.print(v0.getName());
	   v0.move();
	  // Hero0 h0 = new Hero0("귀신");
	  // h0.move();
	  // h0.display();
	   System.out.println("---------------------------");
	   Villain0 v1 = new Villain0("귀신",3910,163	,48,"1663-04-29",2,77.0);
	   v1.display();
	   System.out.print(v1.getName());
	   v1.move();
	  
    }
   }

	   

