package day12p1;

import java.time.LocalDate;
import java.util.*;
import java.util.Iterator;
import java.util.Scanner;

public class ProductMain {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		HashSet<Product>  set = new HashSet<>();
		
		Product p1 = new Product("HP-Laptop",2000, 5,LocalDate.of(2020,2,4));
		Product p2 = new Product("Dell-Laptop",1600,5,LocalDate.of(2020,5,17));
		Product p3 = new Product("Apple-Laptop",20000,5, LocalDate.of(2020,6,30));
		Product p4 = new Product("HP-Laptop",1000,5,LocalDate.of(2020,6,15));
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		System.out.println("Enter the  Range from");
		int p=sc.nextInt();
		System.out.println("TO");
		int c=sc.nextInt();
		for(Product b:set){ 
			if(b.productCost>=p && b.productCost<=c)
            System.out.println(b.productName+" "+b.productCost+" "+b.startRating+" "+b.manifacturingDate);    
        }  
		/*Iterator<Product> itr=set.iterator();    
	    while(itr.hasNext()){    
	       System.out.println(itr.next());    
	    }    */
	}
}