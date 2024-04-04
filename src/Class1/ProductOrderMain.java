package Class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder dubu = new ProductOrder();
        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder coke = new ProductOrder();
        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;

        ProductOrder[] productOrders = {dubu, kimchi, coke};

        int totalAmount = 0;

        for (ProductOrder productOrder : productOrders) {
            totalAmount += productOrder.price * productOrder.quantity;
            System.out.println("상품명: "+productOrder.productName+", 가격: "+productOrder.price+", 수량: "+productOrder.quantity);
        }

        System.out.println("총 결제금액: "+totalAmount);

    }
}
