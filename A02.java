import java.util.*;
class A02{
	double tem = 0.0;
	public static void main(String[] args){
		new A02().start();
	}
	
	void start(){
		Scanner scData = new Scanner(System.in);
		System.out.print("온도를 입력해주세요 : ");
		tem = scData.nextDouble();
		System.out.print("섭씨면 C 화씨면 F를 입력해주세요 : ");
		String CFData = scData.next();
		exchanege(CFData);
	}

	void exchanege(String s){
		if(s.equals("F"))
		{
			System.out.println(tem-32/1.8);
		} else if(s.equals("C"))
		{
			System.out.println(tem*1.8+32);
		}
		else{ System.out.println("잘못입력했습니다");  }
	}
}
