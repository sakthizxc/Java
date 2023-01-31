class Kid extends Mother{
String name="Suman";
public static void main(String []args)
{
Kid kid=new Kid();
kid.work();
kid.study();
}
void study()
{
System.out.println(name+" "+super.name);
}
}

