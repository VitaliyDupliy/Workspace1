package lesson32.homework;

public class Tiger {

	void eat(String s) {
		if (!s.equals("myaso")) {
			throw new NeMyasoException("Tiger ne est " + s);
		}
		System.out.println("Tiger est myaso");
	}

	void drink(String s) throws NeVodaException {
		if (!s.equals("voda")) {
			throw new NeVodaException("Tiger do not drinks " + s);
		}
		System.out.println("Tiger drinks");
	}

	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.eat("myaso");

		try {
			t.drink("voda");
			try {
				t.drink("pivo");
			} catch (NeVodaException e) {
//				e.printStackTrace();
				System.out.println(e.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("This is inner finally block");
			}
		} catch (RuntimeException e) {

			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
