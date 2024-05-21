package lesson28;

public interface Speakable {

	default void speak() {
		System.out.println("Somebody speaks");
	}
//	 void speak();
}
