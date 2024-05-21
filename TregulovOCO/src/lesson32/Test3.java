package lesson32;

public class Test3 {
	
	void marathon(int tempBega, int temperaturaVozduha) throws PodvernulNoguException {
		if(tempBega > 12) {
			throw new PodvernulNoguException("Temp bega slishkom visokiy " + tempBega);
		}
		if (temperaturaVozduha > 25) {
			throw new SveloMishtsuException("Svelo mishtsu, begat nelzya");
		}
	}
	
	public static void main(String[] args) {
		Test3 t = new Test3();
	
			try {
				t.marathon(20, 25);
			} catch (PodvernulNoguException e) {
				
				System.out.println(e.getMessage());
				
			}
		
		finally {
			System.out.println("Poluchi gramotu za uchastie");
		}
			System.out.println("Marathon okonchen");
	}

}

class PodvernulNoguException extends Exception {

	
	private static final long serialVersionUID = 1L;

	public PodvernulNoguException(String message) {
		super(message);
		
	}

	public PodvernulNoguException() {
		super();
		
	}
	
	
}


class SveloMishtsuException extends RuntimeException{
	
	
	private static final long serialVersionUID = 1L;

	public SveloMishtsuException (String message) {
		super(message);
	}
	public SveloMishtsuException () {
		super();
	}
	
}
