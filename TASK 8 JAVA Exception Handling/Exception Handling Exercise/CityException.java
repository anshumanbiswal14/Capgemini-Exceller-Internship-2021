package day10p2;

public class CityException extends Exception{
	private String excMsg = "";

	public CityException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CityException(String message) {
		super(message);
		this.excMsg = message;
	}

	@Override
	public String toString() {
		return "City Exception :- "+excMsg;
	}
}