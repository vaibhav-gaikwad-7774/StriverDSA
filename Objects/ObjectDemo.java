package Objects;

class Laptop{
	String model;
	int price;
	
	public String toString() {
		return model + ": "+price;
	}

public boolean equals (Laptop that) {
	if (this.model.equals(that.model)&& this.price == that.price) {
		return true;
	}
	else
		return false;
}

public class ObjectDemo {
	public static void main(String[] args) {
		Laptop obj = new Laptop();
		obj.model = "Lenovo";
		obj.price = 19000;
		System.out.println(obj);
		
		Laptop obj1 = new Laptop();
		obj1.model = "Lenovo";
		obj1.price = 19000;
		System.out.println(obj1);
		
		boolean result = obj.equals(obj1);
		System.out.println(result);
				
	}
}}
