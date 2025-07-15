class Bank {
    long[] balance;
    int n;
    
    public Bank(long[] balance) {
        n = balance.length;
        this.balance = new long[n + 1];

        for(int i = 0; i < n; i++)
            this.balance[i + 1] = balance[i];
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(account1 > n || account2 > n 
        || balance[account1] < money)
            return false;
        
        balance[account1] -= money;
        balance[account2] += money;
        return true;
    }
    
    public boolean deposit(int account, long money) {
        if(0 <= account && account <= n){
            balance[account] += money;
            return true;
        }

        return false;
    }
    
    public boolean withdraw(int account, long money) {
        if(account > n || balance[account] < money){
            return false;
        }
        
        balance[account] -= money;
        return true;
    }
}