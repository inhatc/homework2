import java.util.*;
class A04{
	public static void main(String[] args){
		new A04().start();
	}

	void start(){
		Scanner scData = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int lan = scData.nextInt();
		System.out.print("영어 점수 : ");
		int eng = scData.nextInt();
		System.out.print("수학 점수 : ");
		int math = scData.nextInt();
		double avg = (lan+eng+math)/3;
		int tot = lan+eng+math;
		System.out.println("평균점수 : "+avg+"총점 : "+tot);
		score(lan,eng,math);
	}

	void score(int l, int e, int m){
		if(l>=90){ System.out.println("국어점수가 우수합니다");}
		if(e>=90){ System.out.println("영어점수가 우수합니다");}
		if(m>=90){ System.out.println("수학점수가 우수합니다");}
	}
}
