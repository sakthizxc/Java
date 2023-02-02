public class Branch extends Branch_plan{
public static void main(String []args)
{
Branch branch=new Branch();
branch.pay_tax(2000);
branch.check_accounts(1000);
branch.do_interview();
branch.receive_Customers();
}
public void receive_Customers()
{
System.out.println("Customer");
}
}




