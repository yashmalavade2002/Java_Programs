package bank;

  class Account{
    private double balance;

    public void setBalance(double balance){
   if(balance>=0){
       this.balance=balance;
   } else  {
       System.out.println("Invalid balance ");
   }
    }

    double  getBalance(){
        return  balance;
    }

}
 class Main {
    public static void main(String[] args) {
  Account account = new Account();
account.setBalance(5000);
        System.out.println(account.getBalance());
    }
}
