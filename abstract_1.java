  
package newpackage;
abstract class Shape 
{
	public abstract void number_of_sides();
	
}
class Trapezoid extends Shape
		{
public void number_of_sides()
	{
	System.out.println("Trapezoid : 4");
	}
		}
class Triangle extends Shape

{	public void number_of_sides()
{
	System.out.println("Triangle : 3");
}}
class Hexagon extends Shape
{
	public void number_of_sides()
{
	System.out.println("Hexagon: 6");
}}
 class Demo {
public static void main (String args[])
{	
	Trapezoid tz=new Trapezoid();

	Triangle t=new Triangle();
	Hexagon h1=new Hexagon();
	tz.number_of_sides();
	t.number_of_sides();
	h1.number_of_sides();
	
}
}

	

