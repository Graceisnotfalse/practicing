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

	    
	    //[4]parseInt�޼ҵ带 ����Ͽ� ���ڿ��� ���ڷ� ��ȯ �� ������ �����ϴ� ���
        //10������ ��ȯ�϶� �� �ƴ϶� ���� 10������ �����ϴ°� �� ��ȯ�ϰ����ϴ� String��,ù��°���ڰ��� ���� 10������,8������,2������ ��� ���ϰ�
	    //��� �������� 10������ ��ȯ�Ѵ�
	    //�������ҽ� ������ 10������ ��ȯ��
	    System.out.println("[����������]---------------------------");
        System.out.println(Integer.parseInt("2022"));  
        System.out.println("[10���� ����]---------------------------");
        System.out.println(Integer.parseInt("2022",10));
        System.out.println("[8���� ����]---------------------------");
        System.out.println(Integer.parseInt("2022",8)); 
        System.out.println("[2���� ����]---------------------------");
        System.out.println(Integer.parseInt("1001",2)); //1001�� 2������ ������������ 10������ ��ȯ �� 9
        System.out.println(Integer.parseInt("1004",8));
        System.out.println(Integer.parseInt("1001")); //1001 ���
        System.out.println(Integer.parseInt("A",16)); //A��� ���ڿ��� ���� 16������ �����ϰ� 10������ ��ȯ�Ұ�
        System.out.println(Integer.parseInt("F",16)); //F��� ���ڿ��� ���� 16������ �����ϰ� 10������ ��ȯ �Ұ�
        System.out.println(Integer.parseInt("FF",16)); //16����FF�� 10������ ��ȯ �� 15*16 0�� ���ϱ� 15*16 1�� ���ϸ� 255
        // 10���� : 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16
        // 16���� : 0,1,2,3,4,5,6,7,8,9,A, B, C, D, E, F, G
}
}
