
// Final - variable method and class

 class Calc{
	public final void show() {
		System.out.println("by navin");
	}
	public void add(int a, int b) {
		System.out.println(a+b);
	}
}
class AdvCalc extends Calc{
//	public void show() {
//		System.out.println("by john");
//	}
}

public class FinalKeywordDemo {
	public static void main(String[] args) {
		AdvCalc obj = new AdvCalc();
		obj.show();
		obj.add(3, 5);
		
	}
}
