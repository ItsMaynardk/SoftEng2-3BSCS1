public class GCash implements PaymentType{
    public String calculatePayment(){
        String output = new String();
        output += "Gcash is your payment type\n" + "You have 1% additional interest";
        return output;
    }
}