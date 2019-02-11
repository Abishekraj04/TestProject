package learnJava;

class Java {
	private String colour;

	public String getter() {
		return colour;
	}

	public void setter(String c) {
		this.colour = c;
	}
}

public class Java1 {
	public static void main(String[] args) {
		Java j1 = new Java();
		j1.setter("Blue");
		System.out.println(j1.getter());
	}

}
