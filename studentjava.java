class StudentDemo
{
    int rollno;
    void get()
    {
        rollno = 101;
    }
    void display()
    {
        System.out.println("Roll No: " + rollno);
    }
}
public class studentjava {
    public static void main(String a[]) {
        StudentDemo obj;
        obj = new StudentDemo();
        obj.get();
        obj.display();
    }
}
// ...existing code...