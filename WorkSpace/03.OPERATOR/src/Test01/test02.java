package Test01;

public class test02 {public static void main(String[] args) {
	int x = 1;
	int y = 1; 
	int result1 = ++x + 10; //(선)연산 후 명령 실행.(할당)
	int result2 = y++ + 10; // (후)명령 후 연산 실행
	System.out.println(result1);
	System.out.println();
}

}
