package labquestions;

public class BankCustomer {
	BankCustomer(int acc_no,String acc_type,double amt){
		 System.out.println("Account No:"+acc_no+"  Account Type:"+acc_type+"  Amount:"+amt);
		 System.out.println();
	 }


	public static void main(String[] args) {
		BankCustomer bk= new BankCustomer(101,"Current",10000);
		BankCustomer bk1=new BankCustomer(102,"Current",8000);
		BankCustomer bk2=new BankCustomer(103,"FD",20000);

	}

}
