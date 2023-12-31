package lessonendproject;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

public class Shape {

	public void displayArea() {
        System.out.println("This shape does not have a specific area calculation method.");
    }

}

package javaproject;

public class Rectangle extends Shape {
	
	  private int length;
	    private int width;

	    public Rectangle(int length, int width) {
	        this.length = length;
	        this.width = width;
	    }

	    @Override
	    public void displayArea() {
	        System.out.println("Area of the Rectangle: " + calculateArea());
	    }

	    public double calculateArea() {
	        return length * width;
	    }

}


package javaproject;

public class Square extends Shape {
	
	  private int length;
	  

	    public Square(int length) {
	        this.length = length;
	      
	    }

	    @Override
	    public void displayArea() {
	        System.out.println("Area of the Square: " + calculateArea());
	    }

	    public double calculateArea() {
	        return length * length;
	    }

}


package javaproject;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Shape> shapes = new ArrayList<>();
		
		
		 try {
	           
	            shapes.add(new Rectangle(4, 6));
	           shapes.add(new Square(4));

	            for (Shape shape : shapes) {
	                shape.displayArea();
	            }
	        } catch (Exception e) {
	            System.err.println("An error occurred: " + e.getMessage());
	        } finally {
	            System.out.println("Program execution completed.");
	        }

		

	}

}