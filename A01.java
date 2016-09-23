import java.util.*;
class A01{
	int age = 0;
	public static void main(String[] args){
		new A01().start();
	}

	void start()
	{
		Scanner scData = new Scanner(System.in);
		System.out.print("태어난 년도 : ");
		int year = scData.nextInt();
		this.age = 2016 - year +1;
		print();
	}
	void print()
	{
		if(this.age<20)
			System.out.println("미성년자입니다.");
		else
			System.out.println("성인입니다.");
	}
}
