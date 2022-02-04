package udemy;


//���� : ��ü�� ���� �������� ��ҷ� ������ ��ü �迭�� �����ϴ� �ڵ� 
//      (��, ��ü�� ��ҵ��� �⺻��Ÿ���� �ƴ� ������Ÿ���̰� �� ������Ÿ���� �迭�� ������ ��ü�迭�� �����϶�
//       == �⺻�� Ÿ���� �ƴ� ������ Ÿ���� ��ü�� ������ ��ü�迭�� ������ �� �ִ���)
//     �ݺ����� ����϶�

class Person2{
	//[1]�ʵ� (this.name �� name �� �� �ʵ�)
	private  String name;
	private int age;
	 
	//[2]������ : ��ü ���� �� �������� ȣ��Ǵ�Ư���� �޼ҵ�
	//          �� ��ü�� ������ Ŭ������� �����ϴ�
	//          ����Ʈ�����ڸ� �������ְ� �����ڸ޼ҵ�� ��ӵ����ʴ´�
	Person2(){}
	Person2(String name,int age){
		this.name = name;
		this.age = age;
	}
	//[3]���,�޼ҵ�
	public void setName(String name) { this.name = name;}
	public String getName() {return name;}
	
	public void setAge(int age) {this.age = age;}
	public int getAge() {return age;}
}

//ƴ������ : �ϳ��� �ڹ����Ͽ� publicŬ������ �ϳ��� ���� �� �ִ� (��, ���ٸ� ���θ޼ҵ尡 �ִ� Ŭ������ �ڿ����� ������ �ȴ�)
//        �ϳ��� ���� ���� ������ 2�� �̻� ���� �� ����
//        ���� publicŰ���尡 ���� Ŭ������ �ִٸ� �� Ŭ�������� ���θ޼ҵ尡 �����ؾ��� 
public class Oop6{
	
	public static void main(String[] args) {
		//[1]: ��ü �迭 (�迭�� ������ ��ü�� �ּҰ��� �������ִ� �迭 , ���ڿ��迭 ������ �迭��� ������ �Ȱ���)
		int[] arr1 = {1,2,3,4,5};
		char[] arr2 = {'a','b','c','d','e'};
		
		//5���� ������ ������ Person2Ÿ���� ��ü �迭�� ������(==>��ü�� ������Ÿ���̴�,�� ������ Ÿ���� ��ü�� �� �迭�� ���Ұ� �ȴ�)
		Person2[] pa = new Person2[5]; 
		pa[0] = new Person2("ȫ�浿",20);
		pa[1] = new Person2("��浿",25);
		pa[2] = new Person2("���浿",30);
		pa[3] = new Person2("��浿",35);
		pa[4] = new Person2("�̱浿",40);
		
		//[2]:���
		for(int i = 0 ; i<arr1.length; i++) {
			System.out.println(i + ""); //�迭�� �ε����� ��µ�
		}
		System.out.println("--------------");
		for(int i = 0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("--------------");
		for(int i = 0; i<pa.length; i ++) {
			System.out.println(pa[i].getName()+ " ");
		}
		
		Person2[] pa1; //Person2Ÿ���� ��ü�迭 ���� ����
		pa1 = new Person2[5]; //Person2Ÿ���� ��ü�� �������� ���ҷΰ����� 5��¥�� �迭���� ����
		
		for(int i = 0; i<pa1.length; i++) {
			pa1[i] = new Person2(i+"���ĺ���",i+20); //i���Է��ϸ� int���̱⶧���� �ڿ� ���ڿ��� �ٿ���� String���� ����������
			System.out.println(pa1[i].getName()+"�� ���̰� " + pa1[i].getAge());
			System.out.printf("%s�� �ĺ����� ���̴� %d��%n",pa1[i].getName(),pa1[i].getAge());
		}
	}
}
	   

