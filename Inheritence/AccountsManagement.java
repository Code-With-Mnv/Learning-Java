package Inheritence;

class Account {
    private String AcNum;
    private String Name;
    private String Address;
    private String PhNo;
    private String DoB;
    protected long Balance;

    public Account(String acnum, String name, String address, String phno, String dob){
        AcNum = acnum;
        Name = name;
        Address = address;
        PhNo = phno;
        DoB = dob;
        Balance = 0;
    }

    public String getAcNum(){return AcNum;}
    public String getName(){return Name;}
    public String getAddress(){return Address;}
    public String getPhNo(){return PhNo;}
    public String getDoB(){return DoB;}
    public long getBalance(){return Balance;}

    public void setAddress(String add){
        Address = add;
    }
    public void setPhNo(String phno){
        PhNo = phno;
    }
}

class SavingsAccount extends Account{
    public SavingsAccount(String acnum, String name, String address, String phno, String dob) {
        super(acnum, name, address, phno, dob);
    }

    public void deposite(long amount){
        Balance += amount;
    }
    public void withdraw(long amount){
        Balance -= amount;
    }
}

class LoanAccount extends Account{
    public LoanAccount(String acnum, String name, String address, String phno, String dob) {
        super(acnum, name, address, phno, dob);
    }

    public void payEMI(long amount){
        Balance -= amount;
    }
    public void repay(long amount){
        Balance -= amount;
    }
}

public class AccountsManagement {
    public static void main(String[] args){}
}
