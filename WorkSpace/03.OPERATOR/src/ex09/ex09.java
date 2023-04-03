package ex09;

public class ex09 {public static void main(String[] args) {
	// 비교연산자 : 조건문에 많이 사용
	// 조건 : 어떤 식이 참 or 거짓 판단
	// eg) id 와 pw 가 내 입력한 값과 DB에 잇는 값이 일치하는지에 - " 로그인' : " 아이디 또는 비밀번호를 확인"
	// 조건은 반드시 True 와 False 의 값을 얻을 수 있어야 함.
	int num1 = 10 , num2 = 10;
	// == , !-= , <= , >= , < , >
	// 같다, 같지않다, 이상 , 이하, 초과, 미만
	// 조건식을 사용 후 결과가 반드시 나와야 함.
	
	boolean result1  = num1 == num2 ; //T
	boolean result2 = num1 != num2 ;//F
	boolean result3 = num1 <= num2 ;//T
	
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	
	
	System.out.println(num1 == num2);//T
	System.out.println(num1 != num2);// F
	System.out.println(num1 <= num2);//T
	
	// 식을 연결 ※ 논리 연산자 (여러개의 조건 판단)
	// 최종적인 결과 T OR F의 결과로만 나옴
	// 조건식A&&조건식B : 조건식 A가 참이고 조건식B도 참일경우 => TRUE 그 외에 False
	// &&(AND , * , 논리곱) : 1 * 1 = 1 , 1*0 = 0; 엔드 곱하기
	
	// 조건식A ||조건식B : 조건식A가 참이면 뒤에 조건과 상관없이 T
	// || (OR, + , shsflgkq) : 1 + ? = 0, 0 + 0 = 0; A이거나 , B또는 
	System.out.println(10>5 && 20>5); // 1*1 = TRUE*TRUE) = > TRUE
	System.out.println(10>5 && 20<5); // 앞T 뒤 F 1*0 = 0 =>F
	System.out.println(5 > 10 && 20>5);// F
	System.out.println(5>10 && 5 > 20);// F 앞의 식이 F이기 떄문에 계산을 해도 의미가 없음.
	
	System.out.println("구분");
	// 하나의 T가 발생하면 뒤의 조건 보지 x 무조건적 T
	System.out.println(10>5 || 20>5); // 1+1=T (T+T)=>T
	System.out.println(10>5 || 20<5); // 1+0=T (T+F)=>F 
	System.out.println(5 > 10 || 20>5); 
	System.out.println(5>10 || 5 > 20);
	// 조건식 연결은 &&와 ||을 이용해 몇개든 가능 
	System.out.println(10 > 5 && 20 > 5 || 5 > 10 );
}

}
