package JavaBasic;

public class DataType_And_Variables {

    public static void main(String [] args ){
        /* Primitive Data Type*/
        byte by = 127;//when you create a variable, DataType is must. Within the same variable you cannot change the data type
        by=50;
        //you can change the value of variable and the latest is always count.
        System.out.println("The value of by variable is:" + by);//conncatenation

        short sh = 32767;
        System.out.println("The value of float variable is;" + sh);

        int j = 1234567890;
        System.out.println("The value of integer variable is:" + j);

        long l = 3847568234765871l;
        System.out.println("The value of long variable is:" + l);

        float f = 2345.8236f;
        System.out.println("The value of float variable is:" + f);

        double d = 38472342356.772345d;
        System.out.print("The value of double variable is:" +d);

        Boolean b = false;
        System.out.println("The value of boolean variable is:" + b);

        char c = 'A'; /* only one character with single qoute*/
        System.out.println("The value of char variable is:" + c);

        /* Non-Primitive Data Type*/
        String s ="SSLKJ";/* collection of charaters with double qoute*/
        System.out.println("The value of string variable is:" + s);
        /* Arrays: Arrays in Java are homogeneous data structures implemented in Java as objects. Arrays stare one or more values of store one or more values of a specific data type and provide indexed access to store the same. A specific element in an array is accessed by its index.
           Classes: A class in Java is blueprint which includes all your data. A class contains fields(variables) and methods to (variables and methods to describe the behavior of an object
           Interface: Life a class, an interface can have methods and variables, but the methods declared in interface are by default in interface are by default abstract (only method signature, no body).*/

    }
}
