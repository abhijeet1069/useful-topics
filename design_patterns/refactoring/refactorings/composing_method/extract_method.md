# Long Method

A method can be heavily long and nested.

## Solution : De-nesting

### Extraction

Pull out part of the function to a new function

### Inversion

Flipping conditions and switching to an early return

## Never nest your code beyond 3 deep

Always try to reduce the nesting in your code.

```java

bool contains(int array[10], int value)
{ //1 deep
    for(int number : array)
    { //2 deep
        if(number == value)
        { //3 deep
            return true;
        }
    }
    return false; 
}

```

## Linux kernel style guide

If you need more than 3 levels of indentation, you're screwed anyway and should fix your program.
