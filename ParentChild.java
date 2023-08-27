import java.util.Scanner;
class Parent
{
    public void home()
    {
        System.out.println("Existing home");
    }
    public void car()
    {
        System.out.println("Existing car");
    }
}
class Child extends Parent
{
    public void car()
    {
        System.out.println("New Car");
    }
}
public class ParentChild
{
    public static void main(String[] args)
    {
        Child c1 = new Child();
        c1.home();
        c1.car();
    }
}