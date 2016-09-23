import java.util.*;
class A05{
	public static void main(String[] args){
		new A05().start();
	}

	void start(){
		Scanner scData = new Scanner(System.in);
		System.out.print("태어난 연도 : ");
		int birth_year = scData.nextInt();
		int age = 2016 - birth_year +1;
		if(age>=0) { start2(age); } 
		else { System.out.println("태어난 연도를 확인하세요.");}
	}

	void start2(int age){
		if(age < 7) { System.out.println("유아");}
		else if(age>6 && age<13) { System.out.println("어린이");}
		else if(age>12 && age<20) { System.out.println("청소년");}
		else if(age>19 && age<30) { System.out.println("청년");}
		else if(age>29 && age<60) { System.out.println("중년");}
		else if(age>59) { System.out.println("노년");} 		
	}
}
