# Substitute Algorithm

So you want to replace an existing algorithm with a new one?

Replace the body of the method that implements the algorithm with a new algorithm.
When all tests are successfully completed, delete the old algorithm for good!

```java

//Problem: Cluttered method, too much repitition of equals()
String foundPerson(String[] people){
  for (int i = 0; i < people.length; i++) {
    if (people[i].equals("Don")){
      return "Don";
    }
    if (people[i].equals("John")){
      return "John";
    }
    if (people[i].equals("Kent")){
      return "Kent";
    }
  }
  return "";
}

//Total new algorithm for foundPerson()
String foundPerson(String[] people){
  List candidates =
    Arrays.asList(new String[] {"Don", "John", "Kent"});
  for (int i=0; i < people.length; i++) {
    if (candidates.contains(people[i])) {
      return people[i];
    }
  }
  return "";
}

```