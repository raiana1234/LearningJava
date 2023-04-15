package JavaBasic;

public class Operators {

    public static void main(String[] args) {
        //Java Operator:Symbol which will perform certain operation
        /* This called an expression. Here + is an operator and = is an operator too and a, b is an operands
        1) Arithmetic Operators + - * / %
        2) Relational / Comparison operators > >= < <=! = ==
        3) Logical operators && // ! [and or not/negation]
        4) Increment & Decrement operators ++ --
        5) Assignment = += -= *= /= %=
        6) Conditional / ternary operator? : */

        int x = 20;
        int y = 20;
        int result = x+y;

        //1) Arithmetic Operators + - * / %
        System.out.println("Sum of X and Y is: "+result); //20
        System.out.println("Substructure of X and Y is: "+(x-y)); //10
        System.out.println("Multiplication of X and Y is: "+(x*y)); //100
        System.out.println("Division of X and Y is: "+(x/y)); //1
        System.out.println("Modulus Division of X and Y is: "+(x%y)); //

        //2) Relational / Comparison operators > >= < <= != == [Return only Boolean value]
        System.out.println(x>y);//returns is true
        System.out.println(x<y);//returns is false
        y=20;
        System.out.println(x>=y);//returns is ture, at-least one is true
        System.out.println(x!=y);//returns is false
        System.out.println(x==y);//returns is true,double operators(==) compare and single(=) is assign

        //3) Logical operators && // ! 1. works only 2 or more boolean values not for string or int, 2. returns True or False

        /*
        * x       Y       x&&y     X//Y     !x       !Y

        * True    True    True     True     False    False
        * True    False   False    True              True
        * False   True    False    True     True
        * False   False   False    False
         */

        Boolean a = true;
        Boolean b = false;
        System.out.println("This is the value coming from logical operators: "+(a&&b));//false
        System.out.println("This is the value coming from logical operators: "+(a||b)); //true
        System.out.println("This is the value coming from logical operators: "+!a);//false

        boolean b1 = 10>20;//10 is not greater than 20 so false is stored in b1
        boolean b2 = 20>10;//10 is not greater than 20 so true is stored in b2
        System.out.println(b1&&b2);//false
        System.out.println("b1||b2");//true
        System.out.println("!b2");//false

        //4) Increment & Decrement operators ++ --

        /* ++ is a increment operator : pre and post
        int a = 10;
        a=a+1
        */
        int i = 20;//there is no difference between pre- and post-increment in this scenario
        //i++;
        //++i;
        //Sytem.out.println("TOTAL"+1);

        int total =i++;
            System.out.println(total); //Here first I value is storing in the 'total' variable and incrimination happen later
        System.out.println(1);//If i is printed then we can see I value is incremented
        int total1 =++i;
        System.out.println(total1); //Here incrimination happen first then I value is storing in the 'total' variable


        // decrement operator
        int aq = 100;
        //aq--;
        //--aq;
        int dec1 = --aq;
        //System.out.println(aq);
        System.out.println(dec1);


        //5) Assignment = += -= *= /= %= [except '=' all other operators are called short hand operators]
        //increment more value +=
        int a1 =10;
        a1+=5;
        System.out.println(a1);

        //increment more value +=
        int a2 = 10;
        a2-=5;
        System.out.println(a2);

        //6) Conditional / ternary operator-- ? : Ternary operators are specially for checking the condition. Mostly used with relational operators.
        //var=exp ? result1: result2;
        int p=200,q=200;

        int r=p>q ? p:q;
        System.out.println(r);//200

        int r1=p<q ? p:q;
        System.out.println(r1);//100

        int pp=(1==1)? 100:200;//we can directly declare the numbers instead of variable
        System.out.println(pp);



        int age=19;
        String outcome= (age>=19) ? "Eligible for vote" : "Not Eligible for vote";
        System.out.println(outcome);


    }
}
