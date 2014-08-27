import java.util.*;

public class java_Vector
{
	public static void main(String[] args)
	{
		Vector v1 = new Vector();
		Integer integer1 = new Integer(1);
		v1.addElement("one");
		v1.addElement(integer1);
		v1.addElement(integer1);
		v1.addElement(new Integer(2));
		v1.addElement("two");
		System.out.println("Vector£º"+v1);
		//insert the element of three at the index of 2
		v1.insertElementAt("three", 2);
		// set the element at the index of 3 as setElement
		v1.setElementAt("setElement", 3);
		System.out.println("Vector£º"+v1);
		v1.removeElementAt(0);
		Enumeration enum1 = v1.elements();
		while(enum1.hasMoreElements())
		{
			System.out.println(enum1.nextElement()+ " ");
		}
		System.out.println("Vector£º"+v1);
		System.out.println("find the element of two in the direction of bottom £º"+v1.indexOf("two"));
		System.out.println("find the element of 2 in the direction of top  £º"+v1.lastIndexOf(2));
	}
}