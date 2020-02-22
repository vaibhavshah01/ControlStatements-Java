package Scannerclass;

public class ConstructorEmployee
{
    String name;
    int emp_id;
    ConstructorEmployee(String name,int emp_id)
    {
        this.name = name;
        this.emp_id = emp_id;
    }

    public static void main(String[]args)
    {
        ConstructorEmployee e1=new ConstructorEmployee("Krishna",8);
        ConstructorEmployee e2= new ConstructorEmployee("Laxmiji",10);
        System.out.println("Employee 1:"+e1.name+"e1.emp_id:8");
        System.out.println("Employee 2:"+e2.name+"e2.emp_id:10");
    }
}

