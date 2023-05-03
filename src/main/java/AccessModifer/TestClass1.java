package AccessModifer;

public class TestClass1 {
    int t=50;
    void displayraiana(){
        System.out.println(t);
    }
    private void displayraianaprivate(){
        System.out.println(t);
    }
    protected void displayraianaprotected(){
        System.out.println(t);
    }

    public void displayraianapublic(){
        System.out.println(t);
    }
    public static void main (String[] args){

        TestClass1 tc1 = new TestClass1();




    }




}
