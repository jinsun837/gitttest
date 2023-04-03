package Test01;

public class Test01 {private static double dNum2;
private static int num;

public static void main(String[] args) {
	// int, double , string
	
	
	//num = 100;			//(할당(값을 넣어줌 값= 리터럴)
	//double dNum1 = 3.14; //  초기화 (선언과 동시에 할당)
	//double dNum3 ; // 나열 (선언을 여러개 동시에 함 , 초기화 가능)
	
	
	String Str ="문자열";
	
	//-- 캐스팅--
	String numStr = "123"; // 123이라는 숫자를 문자열로 바꾸고 +10 결과
			System.out.println(numStr + 10); // 133 ㅌ 12310 = string에 어떤 값 더하면 string임
			int numInt = Integer.parseInt(numStr);
			System.out.println( numInt + 10);
			String numStr2 =""+ numInt; //133=>'133' ??
			System.out.println(numStr2);
			
	
			
	
	
	
	
	
	
	
}

}
