interface PaymentMethod{
    void pay();
}

class DebitCard implements PaymentMethod{
    @Override
    public void pay(){
        System.out.println("Paying using debit card");
    }
}

class CreditCard implements PaymentMethod{
    @Override
    public void pay(){
        System.out.println("Paying using credit card");
    }
}

public class Interfaces{
    
    static void makePayment(PaymentMethod pm){
        pm.pay();
    }

    public static void main(String[] args) {
        DebitCard dc= new DebitCard();
        dc.pay();
        makePayment(dc);
        
        makePayment(new CreditCard());

        //more general approach
        PaymentMethod pm = new DebitCard();
        makePayment(pm);
    }
}