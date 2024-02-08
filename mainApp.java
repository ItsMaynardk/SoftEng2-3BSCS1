public class OrderDemo{
    public static void main(String[] args){

        Order order = new Order (new Knight());

            System.out.println(order.calculatePayment());
        }
    }