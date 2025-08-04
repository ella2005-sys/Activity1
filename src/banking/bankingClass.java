
package banking;
public class bankingClass {
    int accountNo = 10011;
    String name;
    float Balance;
    int pin = 1000;
    
    public boolean verifyAccount(int acc, int pn){
        
            if(acc == accountNo && pn == pin){
                return true;
            }else{
                return false;
            }
    }
    
    public int setAccount(){
        return accountNo;
    }
    
    public void viewBalance(){
    
    
    }
}
