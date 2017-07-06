/**
 * Created by krishan on 6/20/2017.
 */
class Bank {

    void getDetails() {
        System.out.println("Super Class Bank Details:");

    }
}

class SBI extends Bank{
    void getDetails() {
        System.out.println("Bank Details:");
        System.out.println("State Bank of India");
        System.out.println("Rate of Interest: 10%");
    }

}

class BOI extends Bank {
    void getDetails() {
        System.out.println("Bank Details:");
        System.out.println("Bank of India");
        System.out.println("Rate of Interest: 8%");
    }

}

class ICICI extends Bank {
    void getDetails() {
        System.out.println("Bank Details:");
        System.out.println("ICICI");
        System.out.println("Rate of Interest: 12%");
    }

}

class Exercise12 {
    public static void main(String args[]) {
        Bank obj = new SBI();
        obj.getDetails();

        obj = new BOI();
        obj.getDetails();

        obj = new ICICI();
        obj.getDetails();


    }
}