import java.util.Stack;
import java.util.Scanner;

public class Postfix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String exp[] = in.split(" ");
		Stack<Integer> stk = new Stack<Integer>();
		int n;
		for (int i = 0; i < exp.length; i++) {
			String ch = exp[i];
			switch (ch) {
				case "+":
					stk.push(stk.pop() + stk.pop());
					break;
				case "-":
					if (stk.isEmpty() == true) {
						n = 0;
					} else {
						n = stk.pop();
					}
					stk.push(stk.pop() - n);
					break;
				case "*":
					stk.push(stk.pop() * stk.pop());
					break;
				case "/":
					n = stk.pop();
					stk.push(stk.pop() / n);
					break;
				default:
					stk.push(Integer.parseInt(ch));
			}
		}
		System.out.println(stk.pop());
		sc.close();
	}
}
