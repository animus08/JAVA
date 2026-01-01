// Create a custom exception InsufficientBalanceException to handle cases 
// where the account balance is not enough to perform a withdrawal.


class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class InsufficientBalanceCheck {
    static void BalanceCheck(double balance, double withdrawalAmount) throws InsufficientBalanceException {
        if (withdrawalAmount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance for withdrawal");
        } 
        else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal Successful. Remaining Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        double balance = 5000.0;
        double withdrawalAmount = 6000.0;
        try {
            BalanceCheck(balance, withdrawalAmount);
        } 
        catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}



// class InsufficientBalanceException extends Exception{
//     public InsufficientBalanceException(String msg){
//         super(msg);
//     }
// }

// public class Assignment3SectionCQ1 {
//     public static void main(String [] args){
//         double balance = 5000.0;
//         double withdrawalAmount = 6000.0;
//         try{
//             if(withdrawalAmount > balance){
//                 throw new InsufficientBalanceException("Insufficient Balance for withdrawal");
//             }
//             else{
//                 balance -= withdrawalAmount;
//                 System.out.println("Withdrawal Successful. Remaining Balance: " + balance);
//             }
//         }
//         catch(Exception e){
//             System.out.println("Error: " + e.getMessage());
//         }
//     }   
// }

