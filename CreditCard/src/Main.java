public class Main {
    public static void main(String[]args){
        CreditCard myCreditCard = new CreditCard();
        myCreditCard.name = "Jesse Osei";
        myCreditCard.issuerName = "VISA";
        myCreditCard.bankName = "Halifax";
        myCreditCard.issueDate = "12th May 2012";
        myCreditCard.expiryDate = "12th May 2020";
        myCreditCard.securityCode = 282;


        CreditCard myCreditCard2 = new CreditCard();
        myCreditCard2.name = "Sam Osei";
        myCreditCard2.issuerName = "Mastercard";
        myCreditCard2.bankName = "NATWEST";
        myCreditCard2.issueDate = "30th May 2012";
        myCreditCard2.expiryDate = "30th May 2020";
        myCreditCard2.securityCode = 872;

        System.out.println(myCreditCard2.bankName);

    }
}
