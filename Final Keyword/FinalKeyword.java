class Account
{
	final int roi=7;
	final void disp()
	{
		System.out.print(roi);
	}
}
class FinalKeyword
{
	public static void main(String args[])
	{
		Account obj=new Account();
		obj.disp();
	}
}