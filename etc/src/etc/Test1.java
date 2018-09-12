package etc;

public class Test1 {
	public static void main(String[] args) {
		
		String str1 = new String("joker");
		String str2 = new String("joker");
		if(str1==str2){ //주소값 비교
			System.out.println("같은 주소값 입니다.");
		}else{
			System.out.println("다른 주소값 입니다.");
		}
	}
	
	//자바에서 문자열 변수도 다른 동적할당과 동일한 원리로 적용
	//즉, 동일한 문자열이더라도 RAM의 각각의 공간에 저장됨 = 주소값 다름
	




}
