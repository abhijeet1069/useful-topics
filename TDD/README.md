# Test Driven Development

TDD is analogous to double entry book-keeping in software, both production code and test code should execute and  
have 0 tests failed. Zero on both sides, is double entry book keeping.

## TDD Algorithm

- Write a test for the next bit of functionality you want to add.
- Write the functional code until it passes
- Refactor both new and old code to make it well structured

## When not to use TDD

We can not use TDD if

- we don't have clear expectations for the code we are about to implement
- testing does not make sense or does not bring any benefit
- the tests run very slow, allowing only long feedback loops
- the design requires visual verification such as UI layout or UX concerns

## F.I.R.S.T principle

The tests we write should be

- Fast : A test should be as fast as possible, as application grows and we write more tests. And faster our tests the
         shorter is our feedback loop.
- Independent : A tests should not depend on the state of any other tests or an external services. It should be 
                standalone to be able to execute it individually and efficiently.
- Repeatable : A test should be repeatable in any environment.Each tests should set up its own data and should not 
               depend on any external factors to run its test. A clean test should be deterministic that always results
               in the same tests succeeding.
- Self-validating : A test should validate itself whether the test execution is passed or failed. The self validating 
                    test can avoid the need to do an evaluation manually by us.
- Thorough : The tests we write
    - should cover all happy paths
    - should cover negative test cases
    - should cover edge/corner/boundary cases
    - should cover security and illegal issue

## My Take

- TDD is a great way to write specifications. Also, it can perform regression testing too, when I run all the tests
  I know my new feature hasn't broken old features.
- I can know in advance how much time my code takes to execute. Thus, I push only the faster code in production.
- When I know the tests, I can update my code to a new faster algorithm, and everything will just work fine.
- My code will automatically be decoupled because I have to make it decoupled to run the test.
- I have confidence when I push code in production that this is fast and correct code, an I have proof of that. If it
  fails in production, I can add that failing case, test fast and ship in production fast, and have minimum outage.
