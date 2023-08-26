import java.util.Scanner;
public class CourseTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String code,name;
        code = sc.nextLine();
        name = sc.nextLine();
        Course c1 = new Course(code, name);

        code = sc.nextLine();
        name = sc.nextLine();
        Course c2 = new Course();
        c2.setCourse(code, name);

        System.out.printf("Courses:\n%s\n%s\n", c1.getCourse(), c2.getCourse());
    }
}
class Course
{
    String code;
    String name;
    Course()
    {
        code = "";
        name = "";
    }
    Course(String c, String n)
    {
        code = c;
        name = n;
    }
    String getCourse()
    {
        return (code + " | " + name);
    }
    void setCourse(String c, String n)
    {
        code = c;
        name = n;
    }
}