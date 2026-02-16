
public class PracticeOnMembers {
	public int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
	
	public int sum;
	public int subtraction;
	public int division;
	public int remainder;
	public int multiplication;
	
	public static void main(String[] args) {
		PracticeOnMembers ref1 = new PracticeOnMembers();
		ref1.a1 = 100;
		ref1.a2 = 200;
		ref1.sum = ref1.a1 + ref1.a2;
		System.out.println("The sum of "+ref1.a1 + " and "+ ref1.a2 +" is: "+ref1.sum);
		
		PracticeOnMembers ref2 = new PracticeOnMembers();
		ref2.a3 = 100;
		ref2.a4 = 50;
		ref2.subtraction = ref2.a3 - ref2.a4;
		System.out.println("The subtraction of "+ref2.a3 + " and "+ ref2.a4 +" is: "+ref2.subtraction);
		
		PracticeOnMembers ref3 = new PracticeOnMembers();
		ref3.a5 = 3;
		ref3.a6 = 2;
		ref3.division = ref3.a5 / ref3.a6;
		System.out.println("The division of "+ref3.a5 + " and "+ ref3.a6 +" is: "+ref3.division);
		
		PracticeOnMembers ref4 = new PracticeOnMembers();
		ref4.a7 = 100;
		ref4.a8 = 50;
		ref4.remainder = ref4.a7 % ref4.a8;
		System.out.println("The remainder of "+ref4.a7 + " and "+ ref4.a8  +" is: "+ref4.remainder);
		
		PracticeOnMembers ref5 = new PracticeOnMembers();
		ref5.a9 = 10;
		ref5.a10 = 10;
		ref5.multiplication = ref5.a9 * ref5.a10;
		System.out.println("The multiplication of "+ref5.a9+" and"+ref5.a10+" is: "+ref5.multiplication);
		
	}
}