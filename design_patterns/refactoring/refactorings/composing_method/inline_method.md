# Inline Method

When a method body is more obvious than the method itself, use this technique.

Replace calls to the method with the method’s content and delete the method itself.

```java

//Problem : moreThanFiveLateDeliveries is returning a boolean which is unnecessary.
// Here a moreThanFiveLateDeliveries() is redundant as, numberOfLateDeliveries>5 is self obvious. 

class PizzaDelivery {
  int getRating() {
    return moreThanFiveLateDeliveries() ? 2 : 1;
  }
  boolean moreThanFiveLateDeliveries() {
    return numberOfLateDeliveries > 5;
  }
}

//Solution
class PizzaDelivery {
  int getRating() {
    return numberOfLateDeliveries > 5 ? 2 : 1;
  }
}
```
