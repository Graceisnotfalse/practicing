package udemy;

public class oop2 {

	public static void main(String[] args) {
		
		//문자열을 숫자로바꿔서 연산해보시오
		//이때, 인자값으로 진수를 지정해서 출력해라
		//이 문제는 문자열을 숫자로 변환시키는 것을 아는지 확인
		
		
		//[1]숫자끼리 연산
		int a0 = 1;
		int b0 = 2;
		int c0 = a0 + b0;
		System.out.println("a0+b0 = "+c0); //3
		
		//[2]문자끼리 연산
		String a1 = "1";
		String b1 = "2";
		String c1 = a1+b1;
		System.out.println("a1+b1 = " + c1); //12
		System.out.println(c1.getClass().getName()); //클래스정보는 java.lang.String
		
		//[3]문자열을 숫자로 변환하여 연산 parseInt..Integer 클래스를 사용
		Integer a2 = Integer.parseInt(a1); //클래스명.메소드
		Integer b2 = Integer.parseInt(b1);
		int c2 = a2+b2;
		System.out.println("a2+b2 = "+ c2);
		System.out.println("a2+b2 = "+ (a2+b2)); //문자열이 하나라도 있을 시 문자열로 인식하기때문에 괄호로 묶어야함 
	    System.out.println(a2.getClass().getName()); //클래스 정보는 java.lang.Integer

	}
}
