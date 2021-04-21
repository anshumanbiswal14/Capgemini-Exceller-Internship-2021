package day12p1;

import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;

public class Product
{
     String productName;
     int productCost;
     int startRating;
     Date  manifacturingDate;

	public Product() {
		super();

	}

	public Product(String productName, int productCost, int startRating, Date manifacturingDate) {
		super();
		this.productName = productName;
		this.productCost = productCost;
		this.startRating = startRating;
		this.manifacturingDate = manifacturingDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((manifacturingDate == null) ? 0 : manifacturingDate.hashCode());
		result = prime * result + productCost;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + startRating;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (manifacturingDate == null) {
			if (other.manifacturingDate != null)
				return false;
		} else if (!manifacturingDate.equals(other.manifacturingDate))
			return false;
		if (productCost != other.productCost)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (startRating != other.startRating)
			return false;
		return true;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductCost() {
		return productCost;
	}

	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}

	public int getStartRating() {
		return startRating;
	}

	public void setStartRating(int startRating) {
		this.startRating = startRating;
	}

	public Date getManifacturingDate() {
		return manifacturingDate;
	}

	public void setManifacturingDate(Date manifacturingDate) {
		this.manifacturingDate = manifacturingDate;
	} 
}
