package dip;

public class ShoppingMall {
    private BankCard bankcard;
    public ShoppingMall(BankCard bankcard){
        this.bankcard = bankcard;
    }

    public void doPurchaseSomething(long amount){
        bankcard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard = new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(5000);
    }
}
