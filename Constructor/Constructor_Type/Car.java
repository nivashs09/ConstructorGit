public class Car {   //Constructor Basics
  String model;
  String  color;
  int price;
  int year;
  String name;  
    public Car(String color, String model, int price, int year, String name) { 
    	//Parameterise construcor with any arguments
	  this.color = color;
	  this.model = model;
	  this.price = price;
	  this.year = year;
	  this.name = name;
  }
    public Car() {   //Default constructor without any arguments
    	System.out.println("java is a language");
    }    
	//public static void main(String[] args) {
		
				
	//}

}
