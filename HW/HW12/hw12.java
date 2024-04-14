import java.util.*;
public class hw12 {
    public static int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        int min = 0;
        //importing priorityqueue because I didn't want to make my own minheap.
        PriorityQueue<Integer> lowestWellCost = new PriorityQueue<>(); //min heap
        PriorityQueue<int[]> q = new PriorityQueue<>(new Comparator<int[]>(){ //min heap for pipe cost
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[2], b[2]); //to compare the 3rd element in the array (pipe cost)
            }
        });
        /* Idea
            Using a MST, add all the pipes to a queue (min heap), then because it greedy just take pipes
            and ignore those pipes that have both pipes[i][0] and pipes[i][1] visited,
            after queue is empty, just add the min cost of wells and return min
         */

        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) { //init visited and pipes
            visited[i] = false;
            q.offer(pipes[i]);
            lowestWellCost.add(wells[i]);
        }

        while (!q.isEmpty()) {
            if (visited[q.peek()[0] - 1] && visited[q.peek()[1] - 1]) { //if both are visited then don't add
                q.poll();
            } else { //take the edge
                min += q.peek()[2];
                visited[q.peek()[0] - 1] = true;
                visited[q.peek()[1] - 1] = true;
                q.poll();
            }
        }
        min += lowestWellCost.poll(); //lowest cost is the first element of min heap
        return min;
    }
}
