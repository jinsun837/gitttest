package pack01_if;

public class Ex_05IfElse {public static void main(String[] args) {
	// if else 문으로 어떤 조건을 줄 떼 T인지 F인지 두가지 경우만 만들수가 있음.eg)짝수? Y(T)else N(F)
	// if (조건식A)
	// 조건식 A가 T일때 실행할 코드를 넣어줌
	//}else if (조건식B){
	// 조건식A가 T가 아니고 조건식B일때 실행할 코드를 넣어줌
	//}else if(조건식 C){
	// 조건식A와 B가 T가 아니고 조건식C일때 실행할 코드를 넣어줌
	//}else{
	// if와 elseif의 모든조건이 T가 아닐 때 실행부(규칙 : if문 블럭킹 끝에 붙여 사용)
	//}
	int score = 80; // 기존 방식으로 score 가 90 점 이상이면 A, 80 이상 B, 70점 이상이면 C 그외에는 D 나오게 처리
	// if else만 이용해 (&&, ||)
	
	if (score>=90) {
		System.out.println("A");
		{
			if(score<90 && score>=80)// 80이상 90보다 작으면 == T, &&<=AND(곱), ||<=OR(합)
				System.out.println("B2");
 		}
		if(score<80 && score>=70)
			System.out.println("C");
		
	}
	if(score<70) {
		System.out.println("D");}
	



   if(score>90) {
	   System.out.println("A");
   }else if (score>=80) {
	   System.out.println("B1");
   }else if (score>=70)
	   System.out.println("C");
  
   
   
   
   
   
   }
		
	
	
	
	
	
	
	
	
	
	
	
	
	


}
	
