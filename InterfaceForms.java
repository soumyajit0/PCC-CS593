import java.util.Scanner;
interface Form1
{
    public String base = "Form 1.";
	abstract public void display1();
}
interface Form2 extends Form1
{
	public String base = "Form 2.";
	abstract public void display2();
}
class FormGen implements Form2
{
	public String base = "Form 3.";
    public void display1()
    {
        System.out.println("What? Form 1.");
    }
    public void display2()
    {
        System.out.println("What? Form 2.");
    }
} 
public class InterfaceForms
{
	public static void main(String[] args)
    {
		FormGen form = new FormGen();
		form.display1();
		form.display2();
	}
}