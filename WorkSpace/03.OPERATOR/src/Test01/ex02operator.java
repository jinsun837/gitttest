package Test01;

public class ex02operator {
	public static void main(String[] args) {
		// * 증감과 가감은 많이 씀
		// ++ , --
		// 현실 사용 x
		// ++ 현재 수 + 1
		int num1 = 1, num2 = 1;
		System.out.println(num1++);// 후행연산 - 뒤에 증감식이 붙은것
		System.out.println(++num2);// 선행연산 - 앞에 증감식이 붙은것
		System.out.println("증감식 후 : " + num1);
		System.out.println("증감식 후 : " + num2);
		System.out.println(num1--);// 출력 후 2-1 = 1
		System.out.println(--num2); // 2-1 = 1 연산 후 출력

	}

}
