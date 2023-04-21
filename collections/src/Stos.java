import java.util.Stack;
public class Stos {
    public static void main(String[] args) {
        System.out.println("------------Stack--------------");
        Stack<String> stack = new Stack<>();
        stack.add("Jeden");
        stack.add("Dwa");
        stack.add("Trzy");
        stack.add("Cztery");
        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
}
