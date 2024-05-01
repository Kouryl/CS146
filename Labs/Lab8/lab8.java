import java.util.*;
public class lab8 {
    public static int coinChange(int[] coins, int amount) {
        int coinAmount = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        Stack<Integer> s  = new Stack<>();

        for (int i = 0; i < coins.length; i++) { //nlogn to sort
            q.offer(coins[i]);
        }

        for (int i = 0; i < coins.length; i++) {//constant time to add to stack
            s.push(q.poll());
        }

        while (amount > 0) { //should be linear time (the size of the stack)
            if (s.size() == 0 && amount > 0) {
                coinAmount = -1;
                break;
            }
            if (s.peek() <= amount) {
                amount -= s.peek();
                coinAmount += 1;
            } else {
                s.pop();
            }
        }
        return coinAmount;
    }
}
