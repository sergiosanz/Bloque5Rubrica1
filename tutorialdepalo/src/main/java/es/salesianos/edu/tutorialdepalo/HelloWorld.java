package es.salesianos.edu.tutorialdepalo;

public class HelloWorld {
	private String message1;

	public void setMessage(String message1) {
		this.message1 = message1;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message1);
	}
}