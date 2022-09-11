public class Usingcar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car honda = new Car("red", "xz", 89, 2001, "nivash");
		System.out.println(honda.color);
		System.out.println(honda.model);
		System.out.println(honda.year);
		System.out.println(honda.price);
		System.out.println(honda.name);
		Car hyun = new Car("green", "sport", 6953, 2018, "dhruva");
		System.out.println(hyun.color);
		System.out.println(hyun.model);
		System.out.println(hyun.year);
		System.out.println(hyun.price);
		System.out.println(hyun.name);
		Car ford = new Car("white", "fiesta", 9485, 2022, "diya");
		System.out.println(ford.color);
		System.out.println(ford.model);
		System.out.println(ford.year);
		System.out.println(ford.price);
		System.out.println(ford.name);
		//Car kia = new Car(); //Default constructor
			}
}
