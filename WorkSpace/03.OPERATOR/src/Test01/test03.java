package Test01;

import java.util.Scanner;

public class test03 {public static void main(String[] args) {
	// 다항연산자 또는 이항연산자를 이용해 문제 풀기
	// Scanner 이용
	Scanner sc = new Scanner(System.in); // 스캐너 준비
	String inputData1 = sc.nextLine(); // enter를 치기 전 데이터 가져옴
	//Method(메소드) == 미리 만들어놓은 기능을 호출해 사용==
	//sc.nextLine()하고나서 결과는 항상 string==sc.nextLine==string
    
	//String result=Integer.parseInt(sc.nextLine()) %2== 1 ? "홀수" : "짝수";
	//System.out.println(result);
	// 스트링 변수를 인트로 변환 
	// int num=Integer.parseInt(sc.nextLine())
	
	int num1 = Integer.parseInt(sc.nextLine());
	int num2 = Integer.parseInt(sc.nextLine());
	System.out.println("num1+num2 = " + (num1 + num2));
	System.out.println("num1-num2 = " + (num1 + num2));
	System.out.println("num1*num2 = " + (num1 + num2));
	System.out.println("num1/num2 = " + (num1 + num2));
	
	
	// 콘솔창을 통해 입력받아온 String 데이터를 int 로 바꾼 후 해당 숫자가 짝수인지 홀수인지 판단해
	// 콘솔창에 출력해라. 1=> 홀수, 2=>짝수 ...
	
	// "num1"
	String result = num1==num2? "같음" :  num1 < num2 ? "num2" : "num1"; 
	
	// 콘솔창을 통해 String 데이터를 (숫자) 두개 입력 받는다.
	// 각각의 숫자는 num1과 num2로 구분한다
	// 두숫자의 더하기, 빼기 , 곱하기 , 나누기 한 결과 출력
	
	// 두 숫자중더 큰숫자가 어떤숫자인지 표시
	
	
	
	
	//int a = Integer.parseInt(inputData1);
	//String result1 = a % 2 == 1 ? "홀수" : "짝수";
// System.out.println(result1);
	
	//int num1 = 2 , num2 = 3 ; 
	//System.out.println("num1+num2 = ");
	
}

}
