public class StackTester {
  
  public static void main(String[] args) {
    MyStack<Integer> intStack = new MyStack<>(10);
    intStack.push(10);
    intStack.push(20);
    System.out.println(intStack.pop());   // should print 20
    System.out.println(intStack.peek());  // should print 10
  
    MyStack<String> stringStack = new MyStack<>(10);
    stringStack.push("Alice");
    stringStack.push("Bob");
    System.out.println(stringStack.pop());  // should print "Bob"
  }

  public static boolean checkBalanced(String expr) {
    MyStack<Character> stack = new MyStack<>(expr.length());
    for (char c : expr.toCharArray()) {
        if (c == '(') {
            // TODO: push
        } else if (c == ')') {
            // TODO: check isEmpty, then pop
        }
    }
    // TODO: return whether stack is empty
}

  
}
