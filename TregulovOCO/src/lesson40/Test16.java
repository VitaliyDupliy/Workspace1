package lesson40;

interface Jumpable{
	void jump();
}
class Cats implements Jumpable{

	@Override
	public void jump() {
		System.out.println(this.getClass().getSimpleName() + " jumps");
		
	}
	
}
class Tiger extends Cats{}
class House{}



public class Test16 {

	public static void main(String[] args) {
		Jumpable j = new Tiger();
		Tiger t = new Tiger();
		House h = new House();
		Cats c = new Cats();
		
//		String array[] = new String[][] {
//			new String[]{"privet", "poka", "ok"},{new String()}, {null}
//		}[2];
		
		if(j instanceof Jumpable) {
			System.out.println("j is jampable");
		}
		
		if(t instanceof Cats) {
			System.out.println("t is Cat");
		}
//		if(h instanceof Cats) {
//			System.out.println("h is Cat");
//		}
		
		t.jump();
	}
}
