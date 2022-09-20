// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack Tshirt = new Stack(5);
  
      // Insert new elements into the stack
      Tshirt.push("Blue Shirt");
      Tshirt.push("Green Shirt");
      Tshirt.push("Black Shirt");
      Tshirt.push("Pink Shirt");
  
      // Show the size of the stack
      System.out.println("The size of the stack is: " + Tshirt.size());
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + Tshirt.peek());
  
      // Remove top element in the stack
      Tshirt.pop();
  
      System.out.println("After pop");
  
      // Show all elements in Stack
      Tshirt.printStack();
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + Tshirt.peek());
    }
  }
