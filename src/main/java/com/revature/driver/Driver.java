package com.revature.driver;
import com.revature.planes.*;
import com.revature.tree.*;

public class Driver {

	public static void main(String args[])
	{
		Tree oakTree = new Tree(110, "Quercus ajoensis", 10);
		Tree mapleTree = new Tree(10, "Acer saccharum", 85);
		
		Plane boeing737 = new Plane(3200, 30000, "Boeing");
		Plane p51D_Mustang = new Plane(1650, 0, "North American Aviation");
		
		System.out.println("Hello, I hope you have a good day. I think your discord handle is hillarious.");
	}
	
	
}
