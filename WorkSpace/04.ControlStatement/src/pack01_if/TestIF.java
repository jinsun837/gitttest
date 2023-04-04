package pack01_if;

public class TestIF {
public static void main(String[] args) {
	// int 형 변수 code 를 만든다. code 의 값이 1이면'남자' 2이면 ' 여자' 3이면 '남자' 4이면 '여자' 그외에 값은'오류'출력

	int code = 1;
	
	if(code == 1){
		System.out.println("남자");
	}else if(code == 2) {
		System.out.println("여자");
	}else if(code == 3) {
		System.out.println("남자");
	}else if(code == 4 ) {
		System.out.println("여자");
	}else {
		System.out.println("오류");
	}
	
	
	//int random = (int) (MaTh.random() * 6) + 1; <= 해당 코드가 실행되고나면 1~6까지가 랜덤할당이 됨
		// 조건문을 이용해 random의 숫자가 몇인지를 출력하기 
		//ex)random(1) : 이 출력되었습니다... 6까지
		
	int random = (int)(Math.random() * 6) + 1;
	System.out.println(random );
	
	
	if(random == 1) {
		System.out.println("남자입니다");
	}
	if(random == 2) { 
		System.out.println("여자입니다");}
	if(random == 3) {
		System.out.println("남자입니다");}
	if(random == 4) {
		System.out.println("여자입니다");}
	if (random == 5) {
		System.out.println("남자입니다");}
	if(random == 6) {
		System.out.println("여자입니다");} // 조건이 여러개일 때 느림. else if 빠름. 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//main
}//class
