package bank.creditcard;
import bank.chennai.Sbi;
class Account_holder{
public static void main(String []arrgs)
{
Sbi manager=new Sbi();
System.out.println(manager.branch_name);
System.out.println(manager.emp_name);
System.out.println(manager.emp_id);
manager.get_loan(50);
manager.create_account();
}
}


