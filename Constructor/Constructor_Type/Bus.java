public class Bus {
	int price;
	int year ;
String brand ;
	String color ;
	String arts;
	int medical;
	int engineer;
	public Bus(int pr, int ye, String br, String co) {
		price = pr;
		year = ye;
		brand = br;
		color = co;
		//this.price = price;
		//this.year = year;
		//this.brand = brand;
		//this.color = color;		
	}
	public Bus(String art, int med, int eng) {
		arts = art;
		medical = med;
		engineer = eng;
		//this.price = price;
		//this.year = year;
		//this.brand = brand;
		//this.color = color;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus decker = new Bus(4545, 2001, "vw", "red");
		System.out.println(decker.price);
		System.out.println(decker.year);
		System.out.println(decker.brand);
		System.out.println(decker.color);
		Bus colg = new Bus("srm", 23, 45);
		System.out.println(colg.arts);
		System.out.println(colg.medical);
		System.out.println(colg.engineer);
			}
}

/*public class Benz{
	int price;
	int year;
	String model;
	String color;
	public Benz(int pr, year ye, model mo, color col) {
		price=pr;
		year=ye;
		model=mo;
		color=col;
			}
	public static void main (String args[]) {
		
	}
}*/

