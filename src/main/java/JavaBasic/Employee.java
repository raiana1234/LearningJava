package JavaBasic;

public class Employee {


    int eid;
    String eName;
    String job;
    int eSal;

    void display(){
        System.out.println(eid);
        System.out.println(eName);
        System.out.println(job);
        System.out.println(eSal);

    }

    public static void main(String[] args){
        Employee employee1 = new Employee();
        employee1.eid=100;
        employee1.eName="Raiana";
        employee1.job="HR";
        employee1.eSal=1000;

        Employee employee2 = new Employee();
        employee2.eid=102;
        employee2.eName="Raquib";
        employee2.job="Accountent";
        employee2.eSal=5000;

        employee1.display();
        employee2.display();

    }
}
