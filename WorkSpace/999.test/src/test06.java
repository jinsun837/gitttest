
public class test06 {

	public static void main(String[] args) {
		// 명명규칙(네이밍룰); class(.java)파일은 대문자로 시작
// 변수는 소문자로 시작하는데 의미있는 단어를 연결해서 조합함.	

		int iNum;
		int koreaScore, MathScore, EnglishScore, scienceScore, PeScore;
		koreaScore = 110;
		MathScore = 10;
		EnglishScore = 101;
		scienceScore = 10;
		PeScore = 10;
		System.out.println(koreaScore);

		// 형변환(casting) : 서로다른 타입의 변수를 변환시켜 사용
		// eg) int <-> double , string <-> int
		// int < double
		int iValue = 10;
		double dValue = iValue + 0.5;// 아무것도 한것없음==>자동 형 변환
		System.out.println("iValue 값 : " + iValue);
		System.out.println("dValue 값 : " + dValue);

		// 더 큰 데이터타입을 작은 타입에 담을 때 오류 발생
		// 개발자가 어떤 타입으로 바꿀건지 명시 후 강제로 바꿈
		// 우리가 어떤 작업을 함== 강제 형변환
		iValue = (int) dValue; // 괄호 후 형변환 - 문제발생 = 소숫점 유실
		System.out.println("iValue 값 : " + iValue);
		System.out.println("dValue 값 : " + dValue);

		String str = "1234" + 12; // 답: 123412- 문자열에 어떤 값을 더하는 것 == 합x => 결합(글자의 합침)
		int iData = 1234 + 12; // 숫자형 데이터의 합 == 합 =>값의 합침
		System.out.println(str);
		System.out.println(iData);

		// str에는 현재 123412라는 문자열이 저장되어있음.
		// 숫자로 바꾸려면 어떻게 해야할까> (""<=제거)
		// 123412의 값을 숫자로 바꾸고 +1한 결과를 출력해보기
		// int =>Integer ? , double => ? wrapperClass 첫글자가 대문자로 시작함.
		int sum = Integer.parseInt(str) + 1;
		System.out.println(sum);
		// boolean (부울형) true 또는 false 만 저장가능함.
		
		
	
		
		
		

	}

}
