package JavaBasic;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Method_Overloading {

    /*


   Shape- circle, triangle, oval, squire
   STATE- NY, Cal, Texas, Florida, Ohio, Atlanta
   Raiana- Women. Daughter, Sister, Sister in law

   add(10,20);
   add(10,20,30);
   add(10,20,30,40);

   3000000000000.00

     */
    /*Method Overloading Rules
    *Methods names should/must be same
    * Numbers of parameters should / must be different
    * Data type must be different(if parameters count is same)
    * Order of parameters must be different
    */
    //This means it's the class variable since it's inside the class


        int x, y;
        double d;
        //this means it's a local variable

        void sum(){
            x = 20;
            y = 50;
            System.out.println(x + y);
        }

        void sum(int a, int b){

            x = a;
            y = b;
            System.out.println(x + y);
        }

        void sum(int a, double b){

            x = a;
            d = b;
            System.out.println(x + d);
        }

        void sum(double b, int a){

            x = a;
            d = b;
            System.out.println(d + y);
        }

    }

