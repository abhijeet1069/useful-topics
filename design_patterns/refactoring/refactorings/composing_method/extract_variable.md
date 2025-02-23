# Extract Variable

You have an expression that's hard to understand.

Place the result of the expression or its parts in separate variables that are self explanatory.

```java

// problem : complicated if
void renderBanner() {
  if ((platform.toUpperCase().indexOf("MAC") > -1) &&
       (browser.toUpperCase().indexOf("IE") > -1) &&
        wasInitialized() && resize > 0 )
  {
    // do something
  }
}

// solution : if with more context
void renderBanner() {
  final boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1;
  final boolean isIE = browser.toUpperCase().indexOf("IE") > -1;
  final boolean wasResized = resize > 0;

  if (isMacOs && isIE && wasInitialized() && wasResized) {
    // do something
  }
}

```

## DrawBack

When refactoring conditional expressions, remember that the compiler will most likely optimize it to minimize the amount
of calculations needed to establish the resulting value. 
  Say you have a following expression if (a() || b()) .... 
  The program won’t call the method b if the method a returns true because the resulting value will still be true, 
  no matter what value returns b.

However, if you extract parts of this expression into variables, both methods will always be called, which might hurt
performance of the program, especially if these methods do some heavyweight work.

