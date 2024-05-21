package lesson26;

public class Test2 {

	public static void main(String[] args) {
		Mouse mouse = new Mouse();
	mouse.showInfoAnimal();
	mouse.showInfoMouse();
}
}

 class Animal{
	
	 String showName(){
		 return "Some Animal";
	 }
	 
	 void showInfoAnimal() {
		 System.out.println("Animal's name: " + showName());
	 }
}
 
 class Mouse extends Animal{
		
	 String showName(){
		 return "Jarry";
	 }
	 
	 void showInfoMouse() {
		 System.out.println("Mous' name: " + showName());
	 }
}
