# Split temporary variable

You have a local variable that’s used to store various intermediate values inside a method
**(except for cycle variables).**

Use different variables for different values. Each variable should be responsible for only one particular thing.

```java

double temp = 2 * (height + width);
System.out.println(temp);
temp = height * width;
System.out.println(temp);

final double perimeter = 2 * (height + width);
System.out.println(perimeter);
final double area = height * width;
System.out.println(area);

```
