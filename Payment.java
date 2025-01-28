public class Payment {
    public void pay() {
        System.out.println("payment method not specified");
    }
}

static class CreditCard extends Payment {
        @Override
        public void pay(){
            System.out.println("paid using creditcard");
        }
    }

    static class Upi extends Payment {
        @Override
        public void pay() {
            System.out.println("paid using upi");
        }
    }
     
    public class Main{
        public static void main (String[] args){
            Payment payment1 = new Payment.CreditCard();
            payment1.pay();
            Payment payment2 = new Payment.Upi();
            payment2.pay();
        }
    }