class StockSpanner {

    Stack<Integer> s = new Stack<>();
    ArrayList<Integer> prices = new ArrayList<>();

    public StockSpanner() {
    }

    public int next(int price) {

        int i = prices.size();
        prices.add(price);

        while (!s.isEmpty() && prices.get(s.peek()) <= price) {
            s.pop();
        }

        int ans;

        if (s.isEmpty()) {
            ans = i + 1;
        } else {
            ans = i - s.peek();
        }

        s.push(i);

        return ans;
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */