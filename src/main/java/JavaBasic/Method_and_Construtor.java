package JavaBasic;

public class Method_and_Construtor {
/*METHOD- is block or group of statement which perform certain task
We have call method through object
1. No params No return value
2. No params Return value
3. Take params No Return value
4. Take param Return value
 */
// No params No return value
    void greeting (){
        System.out.println("Hello I'm a method that has no returns and no parameters");
    }

    //No params Return value
    String greeting02 (){
        return "Hello I'm a method with return value and no parameters";
    }

    //Take params No Return value
    void greeting03 (String name){
        System.out.println("Hello I'm a method that has no returns and no parameters " + name);
    }

    //Take param Return value
    String greeting04 (String Name){
        return "Hello I'm a method with return value and parameters "+ Name;
    }
}
