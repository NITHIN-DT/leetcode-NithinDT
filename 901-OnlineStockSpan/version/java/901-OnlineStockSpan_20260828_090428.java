// Last updated: 28/08/2026, 09:04:28
1import java.util.Stack;
2class StockSpanner {
3    private Stack<int[]> stack;
4    public StockSpanner() {
5        stack = new Stack<>();
6    }
7    public int next(int price) {
8        int span = 1;
9        while (!stack.isEmpty() && stack.peek()[0] <= price) {
10            span += stack.pop()[1];
11        }
12        stack.push(new int[]{price, span});
13        return span;
14    }
15}