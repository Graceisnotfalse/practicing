package udemy;


//���� : getter�� setter�� ���Ե� Ŭ������ ����� �ڵ�� �����غ��ÿ�.
//     �θ�Ŭ������ Person0�̰� �ڽ�Ŭ������ Villain0�� Hero0�̴�.
class Person0{
	
     //[1]:�������,����ʵ� 
	  //(private���������� �� ��ӹ޾Ƶ� ���Ұ�, �̶� ����ϴ°� getter�� setter)
	  //�� Ŭ������������ ��밡���� ��������.�� �ܺο��� ���Ұ���
	   private String name;
	   private int age;
	   private int height;
	   private int weight;
	  
	   //[2]:�����ڸ޼ҵ�_�ش� ��ü ���� �� ȣ��Ǵ� Ư���� �޼ҵ� (�� ������ �޼ҵ�� ��ӺҰ�)
	   Person0(){}
	   Person0(String name,int age,int height, int weight){
		   this.name=name;
		   this.age = age;
		   this.height = height;
		   this.weight = weight;
	   }
	   
	  //[3]:���,�޼ҵ�
	  //static void move() { //<=���� static�� �پ����� ��ü �������ϰ� �ٷ� Ŭ����.�޼ҵ�� ȣ�Ⱑ��
	   
	   //setter�޼ҵ� ȣ�� �� ���ڰ��� ���� �Ķ���ͺ����� �ֱ⶧���� ��ü�� ���� �����Ҽ��ִ�
	   public void setName(String name) {this.name = name;}
	   public String getName() { return name;}
	   
	   public void setAge(int age) {this.age = age;}
	   public int getAge() {return age;}
	   
	   public void setHeight(int height) {this.height = height;}
	   public int getHeight() { return height;}
	   
	   public void setWeight(int weight) { this.weight = weight;}
	   public int getWeight() {return weight;}
	   
	  
	   void move() {System.out.println(name + "�̵� ��");}
	  
  }

class Villain0 extends Person0 {
	  //�ʵ�
	   private String unique_key;
	   private int weapon;   //1:��, 2:â
	   private double power;
	
	  //�����ڸ޼ҵ�
	   Villain0(){}  //��������. ������ ����Ʈ
	   //�θ𿡰Լ� ��ӹ��� �ʵ� 4��+�ڽ�Ŭ������ �����ִ� �ʵ� 3��
	   Villain0(String name,int age, int height, int weight,String unique_key,int weapon,double power){ 
		super(name,age,height,weight);//�θ�Ŭ������ �����ڸ޼ҵ尡 ����ȣ��ȴ�.���ڰ��� 4���� �޴� �����ڸ޼ҵ尡 ȣ��Ǹ鼭 ���õ�.
		this.unique_key = unique_key;
		this.weapon = weapon;
		this.power = power;
	   }
	
	  //���,�޼ҵ�
	   public void setUnique_key(String unique_key) {this.unique_key = unique_key ;}
	   public String getUnique_key() {return unique_key;}
	   
	   public void setWeapon(int weapon) { this.weapon = weapon; }
	   public int getWeapon() { return weapon;}
	   
	   public void setPower(double power) {this.power = power; }
	   public double getPower() { return power;}; 
	   
	   void display() {
		   System.out.println("�̸� : " + getName());
		   System.out.println("���� : " + getAge());
		   System.out.println("Ű : " + getHeight());
		   System.out.println("������ : " + getWeight());
		   System.out.println("��ȣ : "  + getUnique_key());
		   System.out.println("���� : " +getWeaponName(getWeapon()));
		   System.out.println("�Ŀ� : " + getPower());
		   
	   }
	   
	   void move() {
		   System.out.println("�Ǵ��� 2������� �ɾ��");
	   }
	   
	   String getWeaponName(int a) {
		   String weapon;
		   switch(a) {
		   case 1 : 
			   weapon = "Į";
			   break;
		   case 2 :
			   weapon = "â";
			   break;
		   case 3 :
			   weapon = "����";
			   break;
			   default :
				   weapon = "---";
				   break;
		   
		   }
		   return weapon;
	   }
	   
	   

}
class Hero0 extends Person0{
	    //�ʵ�
	
		//�����ڸ޼ҵ�
		 //Villain0(){}
	   //  Hero0(String name){
		//	this.name = name;
		// }
		
		//���,�޼ҵ�
}

public class Oop5{
   public static void main(String[] args) {
	  
	   //[4]��ü����   
	   //Person0.move();
	   Person0 p0 = new Person0();
	   p0.move();
	   p0.setName("ȫ�浿");
	   System.out.println(p0.getName());
	   p0.move();
	   
	   Villain0 v0 = new Villain0("����",100,490,192,"1500-12-31",4,99.5);
	   v0.display();
	   System.out.print(v0.getName());
	   v0.move();
	  // Hero0 h0 = new Hero0("�ͽ�");
	  // h0.move();
	  // h0.display();
	   System.out.println("---------------------------");
	   Villain0 v1 = new Villain0("�ͽ�",3910,163	,48,"1663-04-29",2,77.0);
	   v1.display();
	   System.out.print(v1.getName());
	   v1.move();
	  
    }
   }

	   

