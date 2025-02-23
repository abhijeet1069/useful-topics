# Replace temp with query

You place the result of an expression in a local variable for later use in your code.

Move the entire expression to a separate method and return the result from it. Query the method instead of using a 
variable. Incorporate the new method in other methods, if necessary.

```java

//problem
double calculateTotal() {
  double basePrice = quantity * itemPrice;
  if (basePrice > 1000) {
    return basePrice * 0.95;
  }
  else {
    return basePrice * 0.98;
  }
}

//solution
double calculateTotal() {
  if (basePrice() > 1000) {
    return basePrice() * 0.95;
  }
  else {
    return basePrice() * 0.98;
  }
}
double basePrice() {
  return quantity * itemPrice;
}

```