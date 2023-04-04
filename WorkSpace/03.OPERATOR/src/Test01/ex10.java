package Test01;

public class ex10 {public static void main(String[] args) {
	// 변수타입 변수명 = 값 비교식 ? "반환값1" : "반환값2"
	// int result = num < 10 ? 1 : 식 2 ? 식3 ... : 모든식이 참이 아닐 때
	// score 라는 변수가 있음. 해당 변수의 값이 90보다 크다면 A 등급, 80보다 크다면 B등급.. D등급
	int score = 91; 
	String grade = score > 90 ?"A" : score > 80 ? "B" : score > 70 ? "c" : score > 60? "D" : "E";;
	System.out.println(grade);
	// 70보다 큼 C등급
	// 60보다 큼 D등급
	// 그외 E
	




}

}
