package day2p3;

public class Stock {

	private String stockName; // infosys
	private float stockPrice;  // 1300
	
	public Stock(String name, int price) {
		stockName = name;
		stockPrice = price;
	}
	
	public Stock() {
		// TODO Auto-generated constructor stub
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public float getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}

	public void changePrice(float percentageChange,boolean action)
	{
		if(action = true) {
			stockPrice=(stockPrice*(100+percentageChange))/100;
		}
		
		if(action = false) {
			stockPrice=(stockPrice*(100-percentageChange))/100;
		}
		
		
	}
	
}