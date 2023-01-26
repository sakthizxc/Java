package Encapsulation;
class School{
int mark;
private int salary;
static String school_name="St.Antony's Primary School";
public static void main(String []args)
{
School teacher=new School();
teacher.conduct_exams();
teacher.publish_results(75);
}
void conduct_exams()
{
System.out.println(school_name);
}
void publish_results(int mark)
{
System.out.println(school_name);
}
}






