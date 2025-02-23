# Replace Method with Method Object

You have a long method in which the local variables are so intertwined that you can’t apply Extract Method.

Transform the method into a separate class so that the local variables become fields of the class. Then you can split 
the method into several methods within the same class.

```java

//Problem : calculateTotalPrice() having a long list of local variables with lengthy computation
class Order {
    double calculateTotalPrice(double price, int quantity, double discount) {
        double subtotal = price * quantity;
        double discountAmount = subtotal * (discount / 100);
        double tax = (subtotal - discountAmount) * 0.15;
        return subtotal - discountAmount + tax;
    }
}

class OrderPriceCalculator {
    private double price;
    private int quantity;
    private double discount;

    OrderPriceCalculator(double price, int quantity, double discount) {
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    double compute() {
        double subtotal = calculateSubtotal();
        double discountAmount = calculateDiscount(subtotal);
        double tax = calculateTax(subtotal, discountAmount);
        return subtotal - discountAmount + tax;
    }

    private double calculateSubtotal() {
        return price * quantity;
    }

    private double calculateDiscount(double subtotal) {
        return subtotal * (discount / 100);
    }

    private double calculateTax(double subtotal, double discountAmount) {
        return (subtotal - discountAmount) * 0.15;
    }
}

class Order {
    double calculateTotalPrice(double price, int quantity, double discount) {
        return new OrderPriceCalculator(price, quantity, discount).compute();
    }
}

```