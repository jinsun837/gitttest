package Test01;

public class ex04_oper {public static void main(String[] args) {
	int value1 = 5, value2 = 2;
	
	// 연산 순서 : 현실에서 연산 순서
	// 연산 먼저하기 위해 구분>(괄호)
	// string - int 가 불가능하기 떄문
	// 소괄호를 우선순위 연산
	// 연산 순서때문에 오류 발생x 습관적 연산식과 string 이 더해질 때 따로 감싸주기
	System.out.println("value1 + value2 = " +(value1 + value2));
	System.out.println("value1 - value2 = " +(value1 + value2));
	System.out.println("value1 * value2 = " +(value1 + value2));
	System.out.println("value1 / value2 = " +(value1 % value2));
}

}
