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

	    
	    //[4]parseInt메소드를 사용하여 문자열을 숫자로 변환 시 진수를 지정하는 방법
        //10진수로 변환하라 가 아니라 값을 10진수로 지정하는것 즉 변환하고자하는 String값,첫번째인자값은 현재 10진수다,8진수다,2진수다 라고 말하고
	    //모든 진수들은 10진수로 변환한다
	    //지정안할시 무조건 10진수로 변환됨
	    System.out.println("[진수미지정]---------------------------");
        System.out.println(Integer.parseInt("2022"));  
        System.out.println("[10진수 지정]---------------------------");
        System.out.println(Integer.parseInt("2022",10));
        System.out.println("[8진수 지정]---------------------------");
        System.out.println(Integer.parseInt("2022",8)); 
        System.out.println("[2진수 지정]---------------------------");
        System.out.println(Integer.parseInt("1001",2)); //1001을 2진수로 지정해줬으니 10진수로 변환 시 9
        System.out.println(Integer.parseInt("1004",8));
        System.out.println(Integer.parseInt("1001")); //1001 출력
        System.out.println(Integer.parseInt("A",16)); //A라는 문자열의 값을 16진수로 지정하고 10진수로 변환할것
        System.out.println(Integer.parseInt("F",16)); //F라는 문자열의 값을 16진수로 지정하고 10진수로 변환 할것
        System.out.println(Integer.parseInt("FF",16)); //16진수FF는 10진수로 변환 시 15*16 0승 더하기 15*16 1승 더하면 255
        // 10진수 : 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16
        // 16진수 : 0,1,2,3,4,5,6,7,8,9,A, B, C, D, E, F, G
}
}
