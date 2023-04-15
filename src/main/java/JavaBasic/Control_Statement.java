package JavaBasic;

public class Control_Statement {


    /* Control Statements - Control the execution of code
    1. Conditional Statements
    2. Looping Statements/iterative statements
    Jumping Statements
     */
    /* Conditional Statements - if match then run, if it doesn't then skip the set of condition and move to the next
    1. If
    2. If else
    3. nested if else
    4. Switch case
     */
    /*
     *Return true or false [relational or logical operators or ]
     * if (condition) {
     * statement
     * }
     */

    public static void main(String[] args) {

        Control_Statement cs = new Control_Statement();
        cs.ifCondition();
        cs.ifElseCondition();
        cs.nestedIfElse();
        cs.po();
        cs.switchCase();
       // cs.whileLoopCon();
        cs.dowhileLoop();
        cs.forLoop();
        //cs.enchanedForLoop();
    }

    public static void ifCondition() {

        int person_age = 10;

        if (person_age >= 18) {
            System.out.println("Eligible for vote");
        }
    }

    public static void ifElseCondition() {
        int person_age1 = 17;
        if (person_age1 >= 18) {
            System.out.println("This person is eligible for vote");
        } else {
            System.out.println("This person is not eligible for vote");
        }
    }


    //Even or odd
    // int xx = 111;
    // if(xx%2==0){
    // System.out.println("This is an even number");
    // }
    // else{

    // System.out.println("This is an odd number"):

    // }


    //Largest number of 3
    // int x = 300, y = 200, z = 1000;
    //
    // if (x  > y && y > z) {
    //System.out.println("x is the largest number");
    //}
    //else if (y>x && y>z) {
    //System.out.println("y is the largest number");
    //}
    //else(
    //System.out.println("z is the largest number");
    //}}



    public static void nestedIfElse(){


        if (false) {

            if (true) {
               System.out.println("this is abc");
            } else {
                System.out.println("This is pqr");
            }
        } else {
            System.out.println("This is xyz");
        }
    }





    public static void po(){

        int weekday=10;

        if(weekday==1){
            System.out.println("Sunday");
        }
        else if (weekday==2){
            System.out.println("Monday");
        }
        else if (weekday==3){
            System.out.println("Tuesday");
        }
        else {
            System.out.println("not valid");
        }
    }





//Switch (variable){
// case "VALUE1" : STATEMENT;
//                 BREAK;
// case "VALUE2" : STATEMENTS;
//                 BREAK
//
//
// DEFAULT:STATEMENT
//
// Will not support Strings, Boolean, Characters,Long
// 'break' should be used in each case
//}


    public static void switchCase(){

        int weekday=0;

        switch (weekday){

            case 1: System.out.println("Sunday");break;
            case 2: System.out.println("Monday");break;
            case 3: System.out.println("Tuesday");break;
            case 4: System.out.println("Wednesday");break;
            default: System.out.println("Invalid");
        }
    }


    /*Looping Statement
    while loop [while (condition){
    statements;
    inc/doc
    }]
    do while loop
    for loop
    enhanced for loop
     */
    // while (condition) {
    // statements;
    // inc/dec
    //}

 public static void whileLoopCon(){

//     int i=1; //initialization
//     while (i<=25){
//         System.out.println(i);
//     }
 }

 public static void dowhileLoop(){

     int x = 5;
     do {
         System.out.println(x);

     }while(x>10);
 }

 //for (variable; condition; change)
 //    statement
 //for (variable; condition; change) {
 //    statement
 //}
 //The statement(s) will keep evaluates as long as the condition evaluates to true.
 //'i' can be accessed only within the loop.
 //The variable can be declared outside and set inside:
 public static void forLoop(){

     for(int i=1; i<=5; i++) {
         System.out.println(i);

     for(int i2=5; i2>=1; i2--){
         System.out.println(i2);
     }
 }

 // public static void enchanedForLoop(){
//    int home[]={3,4,5,6,7};
//     int total=0;
//
//     for(int x: home){
//         total+=x;
//     }
//
//     System.out.println(total);
 }

}
