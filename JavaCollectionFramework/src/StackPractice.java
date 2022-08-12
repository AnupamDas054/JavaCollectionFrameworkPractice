import java.util.Stack;

public class StackPractice {

    public static  void main(String[] arg)
     {
          Stack<Integer> myStack= new Stack();
          myStack.push(2);
          myStack.push(4);

          System.out.println(myStack);
          System.out.println(myStack.peek());
         // myStack.pop();
          System.out.println("The stack is : ");
          while(!myStack.empty())
          {
               System.out.println(myStack.peek());
               myStack.pop();

          }

     }








}
