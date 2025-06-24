import java.util.Stack;
public class ReverseStack {
    public static void main(String[] args) {
  int[] arr = {10, 20, 30, 40,50,};
  Stack<Integer> stack = new Stack<Integer>();
  for(int i = 0; i < arr.length;i++ ){
      stack.push(arr[i]);
  }
  while(!stack.isEmpty()){
      System.out.println(stack.pop());

  }
  //OutPut
        /*
        50
        40
        30
        20
        10

         */

    }
}