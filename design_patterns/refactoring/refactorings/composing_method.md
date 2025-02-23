# Composing Methods

Much of refactoring is devoted to correctly composing methods. In most cases, excessively long methods are the root of
all evil. The vagaries of code inside these methods conceal the execution logic and make the method extremely hard to
understand—and even harder to change.

## Extract Method

[Extract method](./composing_method/extract_method.md)

Problem: You have a code fragment that can be grouped together.

Solution: Move this code to a separate new method (or function) and replace the old code with a call to the method.

## Inline Method

[Inline method](./composing_method/inline_method.md)

Problem: When a method body is more obvious than the method itself, use this technique.

Solution: Replace calls to the method with the method’s content and delete the method itself.

## Extract Variable

[Extract Variable](./composing_method/extract_variable.md)

Problem: You have an expression that’s hard to understand

Solution: Place the result of the expression or its parts in separate variables that are self-explanatory

## Inline Temp

[Inline Method](./composing_method/inline_method.md)

Problem: You have a temporary variable that’s assigned the result of a simple expression and nothing more

Solution: Replace the references to the variable with the expression itself.
          The problem is benign. We can use the temporary variable for logging purpose.

## Replace Temp with Query

[Replace temp with Query](./composing_method/replace_temp_with_query.md)

Problem: You place the result of an expression in a local variable for later use in your code.

Solution: Move the entire expression to a separate method and return the result from it. Query the method instead of 
          using a variable. Incorporate the new method in other methods, if necessary.

## Split Temporary Variable

[Split temporary variable](./composing_method/split_temporary_variable.md)

Problem: You have a local variable that’s used to store various intermediate values inside a method 
        *** (except for cycle variables) ***

Solution: Use different variables for different values. Each variable should be responsible for only one particular 
          thing.

## Remove Assignments to Parameters

Couldn't get this refactoring, what's the point of creating one more copy?

Problem: Some value is assigned to a parameter inside method’s body.

Solution: Use a local variable instead of a parameter.

## Replace Method with Method Object

[Replace method with method](./composing_method/replace_method_with_method_object.md)

Problem: You have a long method in which the local variables are so intertwined that you can’t apply Extract Method.

Solution: Transform the method into a separate class so that the local variables become fields of the class. Then you 
          can split the method into several methods within the same class.

## Substitute Algorithm

[Substitute Algorithm](./composing_method/substituting_algorithm.md)

Problem: So you want to replace an existing algorithm with a new one?

Solution: Replace the body of the method that implements the algorithm with a new algorithm.