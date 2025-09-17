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

    System.out.println(checkBalanced("((()))")); //true
    System.out.println(checkBalanced("((())")); //false
    System.out.println(checkBalanced("(sakldf())d)")); //false
    System.out.println(checkBalanced("(df((as)dsf))")); //true
  }

  public static boolean checkBalanced(String expr) {
    MyStack<Character> stack = new MyStack<>(expr.length());
    for (char c : expr.toCharArray()) {
      if (c == '(') {
        stack.push('(');
      } else if (c == ')') {
        if (stack.isEmpty()) {
          return false;
        }
        stack.pop();
      }
    }
    return stack.isEmpty();
  }

  
}
