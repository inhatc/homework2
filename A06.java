import java.util.*;

class A06{
	
	double tot = 0.0;	

	public static void main(String[] args){
	new A06().start();
	}

	void start(){
	String name = "";
	int lan = 0;
	int math = 0;
	int eng = 0;
	Scanner scData = new Scanner(System.in);
	System.out.print("이름 : ");
	name = scData.next();
	System.out.print("국어점수 입력 : ");
	lan = scData.nextInt();
	System.out.print("수학점수 입력 : ");
	math = scData.nextInt();
	System.out.print("영어점수 입력 : ");
	eng = scData.nextInt();
	totprint(lan,math,eng);
	grade();
	
	}

	void totprint(int l, int m, int e){
		tot = (l+m+e)/3;
		System.out.println("평균은 "+tot+"이고"); 
	}

	void grade(){
		String hak = "";
		if(tot>=95){ hak = "A+";}
		else if(tot<95 && tot >= 90) { hak = "A";}
		else if(tot<90 && tot >=85) { hak = "B+";}
		else if(tot<85 && tot >= 80) { hak = "B";}
		else if(tot<80 && tot >= 75) { hak = "C+";}
		else { hak = "F";}
		System.out.println("학점은 " + hak + " 입니다");
	}
}
