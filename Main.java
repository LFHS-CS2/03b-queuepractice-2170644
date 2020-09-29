import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args)  {
       TestMain test = new TestMain();
       test.main(null);
    }
    
    /**
     * See Readme.md
     * IMPORTANT: You may use only a single Stack as auxiliary storage. 
     */

    public static void reorder(Queue<Integer> q) 
    {
        Stack<Integer> stack = new Stack<Integer>();
        while(!q.isEmpty()){
          if(!stack.isEmpty()){
            if(q.peek() < stack.peek()){
              stack.push(q.remove());
            } else {
              while(!stack.isEmpty() && q.peek() > stack.peek()){
                q.add(stack.pop());
              }
              stack.push(q.remove());
            }
          } else {
            stack.push(q.remove());
          }
        }
        while(!stack.isEmpty()){
          q.add(stack.pop());
        }

    }


}
