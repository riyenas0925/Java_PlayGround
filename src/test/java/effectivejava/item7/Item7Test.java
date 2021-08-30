package effectivejava.item7;

public class Item7Test {
    public static void main(String[] args) {
        StackOld stack = new StackOld();
        for(int i = 0; i < 200_000_000_0; i++) {
            String str = "Test Sequence : " + i;
            stack.push(str);
            System.out.println(stack.pop());
        }
    }
}
