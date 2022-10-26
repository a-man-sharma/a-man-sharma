package javatutorials;

public class FloatDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float Max Value " + myMaxFloatValue);
		System.out.println("Float Min Value " + myMinFloatValue);
		
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double Max Value " + myMaxDoubleValue);
		System.out.println("Double Min Value " + myMinDoubleValue);
		
		System.out.println(Float.SIZE);
		System.out.println(Double.SIZE);
		
		int myIntValue = 5/3;
		float myFloatValue = 5f/3f;// if we don't put "f" with the number it will give error because decimals by default considered as double 
		//we can also use type cast "(float) 5.25" but it is not convenient
		// also by default java consider whole number as "int" type so to perform any operation and store in smaller size you need to type cast the result
		double myDoubleValue = 5d/3d;
		//recommended data types are int & double as we don't have to worry about memory size compared to older days when java was designed 
		//also int and double are processed faster in mordern computers and inbuilt library function returns in form of int and double format
		System.out.println("int = " + myIntValue +"\nfloat = " + myFloatValue + "\ndouble = " + myDoubleValue);
		float newf = 5f;
		double newd = 5d;
		System.out.println("newf = " + newf +" newd = "+ newf);//print and println accepts string it can accept other data type 
		
	}

}
