import java.util.*;
import java.io.*;


public class Tester {
	
	public static void main(String[] args) {
		Address a1 = new Address("232 Mountainberry");
		Invoice i1 = new Invoice(a1);
		
		i1.add(3,new Product("Shampoo", 10.99, 20));
		i1.add(1,new Product("Conditioner", 8.90, 20));
		i1.add(4,new Product("Soap", 2.80, 20));
		i1.add(0,new Product("scrub", 2.00, 20));
		System.out.println(i1.format());
	}

}
