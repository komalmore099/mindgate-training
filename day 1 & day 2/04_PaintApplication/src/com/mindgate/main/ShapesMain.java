package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.Factory.ShapesFactory;
import com.mindgate.pojo.Shapes;

public class ShapesMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int choice;
		System.out.println("1.Circle");
		System.out.println("2.Triangle");
		System.out.println("3.Square");
		
		System.out.println("Enter your Choice");
		choice=scanner.nextInt();
		
		Shapes shapes=ShapesFactory.getshape(choice);
		if(shapes!=null)
		shapes.draw();
		else
			System.out.println("Invalid shapes choicce");
    
	}

}
