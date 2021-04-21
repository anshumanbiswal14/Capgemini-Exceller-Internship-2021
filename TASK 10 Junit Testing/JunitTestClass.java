package day13p1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;


public class JunitTestClass {
	
	@BeforeAll
	public static void doInit() {
		System.out.println("Testing.....");
	}
	
	@Test
	void testDoAdd() {
		
		System.out.println("Testing.....add");
		MyApp obj = new MyApp();
		int actual = obj.doAdd(2, 1);
		assertEquals(3,actual);
	
		
	}
	
	@Test
	void testDoSubtract() {
		System.out.println("Testing.....sub");
		MyApp obj = new MyApp();
		int actual = obj.doSubtract(5, 1);
		assertEquals(4,actual);
	}
	
	@Test
	void testDoMul() {
		System.out.println("Testing.....mul");
		MyApp obj = new MyApp();
		int actual = obj.doMul(5, 2);
		assertEquals(10,actual);
	}
	
	@Test
	void testDoDiv() {
		System.out.println("Testing.....div");
		MyApp obj = new MyApp();
		int actual = obj.doDiv(10, 2);
		assertEquals(5,actual);
	}

}
