import java.util.*;
class A03{
	public static void main(String[] args){
		new A03().start();
	}

	void start(){
		Scanner scData = new Scanner(System.in);
		System.out.print("날수를 입력하세요");
		int days = scData.nextInt();
		days = days * 24 * 60 * 60;
		int divide =(int)days/1000000;
		System.out.println("해당하는 기간은 "+days+"초 입니다");
		if(divide > 0)
		{
			mil(divide);
		}
	}
	
	void mil(int d){
		System.out.println("100만초가 모두 "+d+"번 포합됩니다.");
	}
	
}
