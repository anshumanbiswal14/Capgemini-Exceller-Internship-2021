package day7p1;

// entity class or bean class or pojo 
public class Engine {
	
	private int basepower;
	
	public Engine() {
		
	}

	public Engine(int basepower) {
		this.basepower = basepower;
	}
	
	public int getBasepower() {
		return basepower;
	}

	public void setBasepower(int basepower) {
		this.basepower = basepower;
	}

	

	public int doStartEngine(String fuelType)
	{
	
		if(fuelType.equals("petrol"))
		{
			return basepower*100;
		}
		else if(fuelType.equals("diesel"))
		{
			return basepower*250;
		}
		else if(fuelType.equals("cng"))
		{
			return basepower*50;
		}
		else 
		{
			return basepower*90;
		}
		
	}

}
