package udemy;

public class oop2 {

	public static void main(String[] args) {
		
		//���ڿ��� ���ڷιٲ㼭 �����غ��ÿ�
		//�̶�, ���ڰ����� ������ �����ؼ� ����ض�
		//�� ������ ���ڿ��� ���ڷ� ��ȯ��Ű�� ���� �ƴ��� Ȯ��
		
		
		//[1]���ڳ��� ����
		int a0 = 1;
		int b0 = 2;
		int c0 = a0 + b0;
		System.out.println("a0+b0 = "+c0); //3
		
		//[2]���ڳ��� ����
		String a1 = "1";
		String b1 = "2";
		String c1 = a1+b1;
		System.out.println("a1+b1 = " + c1); //12
		System.out.println(c1.getClass().getName()); //Ŭ���������� java.lang.String
		
		//[3]���ڿ��� ���ڷ� ��ȯ�Ͽ� ���� parseInt..Integer Ŭ������ ���
		Integer a2 = Integer.parseInt(a1); //Ŭ������.�޼ҵ�
		Integer b2 = Integer.parseInt(b1);
		int c2 = a2+b2;
		System.out.println("a2+b2 = "+ c2);
		System.out.println("a2+b2 = "+ (a2+b2)); //���ڿ��� �ϳ��� ���� �� ���ڿ��� �ν��ϱ⶧���� ��ȣ�� ������� 
	    System.out.println(a2.getClass().getName()); //Ŭ���� ������ java.lang.Integer

	}
}
