package Encapsulation;
class Teacher{
public static void main(String []args)
{
School teacher=new School();
teacher.conduct_exams();
teacher.publish_results(75);
System.out.println(teacher);
System.out.println(teacher.salary);
}
}
