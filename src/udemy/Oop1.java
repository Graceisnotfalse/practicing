package udemy;

//FarmMachine�� �Ӽ��� ������ ������ Ŭ������ �ڵ�� �����ϰ� ��ü�� �����ؼ�
//���α׷��� ���۽��Ѷ�
public class oop1 {

	public static void main(String[] args) {
		
		//[3]��ü�� �������� 
		FarmMachine fm = new FarmMachine(); 
		//=>new��� Ű����� ��ü�� ��������.
		//=>�� ������ ��ü�� FarmMachineŸ���� fm�̶�� ������ ��´�
		//��ü�� ���۷���Ÿ���̶� syso(fm)�ÿ� �޸��� �ּҰ��� ����

		//[4]������ ��ü�� �Ӽ� �� �Է�����
		System.out.println(fm.price);
		System.out.println(fm.age);
		System.out.println(fm.color);
		fm.digging();
		fm.moving(); 
		fm.grinding();
	}

}

//
//���踦 ������ ����(Class)����
class FarmMachine{
	 
	//[1]�Ӽ�,Ư¡
	int price = 1000000;
	int age = 2020;
	String color = "red";
	
	//[2]�޼ҵ�,���
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