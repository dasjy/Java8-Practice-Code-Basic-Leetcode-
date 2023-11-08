package Constructor;

class test1
{
    String empName;
    String id;

    public test1(String empName, String id)
    {
        this.empName = empName;
        this.id = id;
    }
    void dusplay()
    {
        System.out.println(empName+id);

    }
}
class test4 extends test1
{

int salary;
public test4(String empName, String id, int salary)
{
    super(empName,id);
    this.salary=salary;
}

public void display()
{

    System.out.println(empName+id+salary);
    super.dusplay();
}
}
public class SuperMethod2 {
    public static void main(String[] args)
    {
        test4 t4=new test4("asa","12",33333);
    }
}
