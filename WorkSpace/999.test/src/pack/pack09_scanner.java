package pack;

import java.util.Scanner;

public class pack09_scanner {
	public static void main(String[] args) {

		// scanner(입력)=> 자바(출력)=> 콘솔창
		Scanner sc = new Scanner(System.in);// 클래스의 초기화식(5장)
		// 외부에서 들어오는 데이터를 사용해보기위해서 외워서 사용

		System.out.println("대기할껀지?");
		String inputData = sc.nextLine();
		System.out.println("여기까지 왔는지?");
		System.out.println(inputData);
		// 외부에서 입력한 숫자는 String형태로 inputData라는 변수에 들어온다
		// 데이터에 +10을 한 결과를 출력해보세요
		System.out.println(inputData+10);
		int a = Integer.parseInt(inputData);
		
		
		
	
		

	}

}
