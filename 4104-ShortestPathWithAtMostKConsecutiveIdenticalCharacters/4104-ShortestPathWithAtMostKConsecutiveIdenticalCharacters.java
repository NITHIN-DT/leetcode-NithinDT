// Last updated: 11/08/2026, 21:18:13
import java.util.*;
class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        int[][] mavorqeli = edges;
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] e : mavorqeli) {
            graph.get(e[0]).add(new int[]{e[1], e[2]});
        }
        PriorityQueue<State> pq = new PriorityQueue<>(Comparator.comparingInt(s -> s.cost));
        pq.offer(new State(0, 0, 1)); 
        Map<String, Integer> dist = new HashMap<>();
        dist.put(key(0, 1), 0);
        while (!pq.isEmpty()) {
            State cur = pq.poll();
            int node = cur.node;
            int cost = cur.cost;
            int consec = cur.consec;

            if (node == n - 1) return cost; // reached destination

            for (int[] nei : graph.get(node)) {
                int next = nei[0];
                int w = nei[1];
                if (labels.charAt(next) == labels.charAt(node)) {
                    if (consec + 1 > k) continue; 
                    int newConsec = consec + 1;
                    int newCost = cost + w;
                    String key = key(next, newConsec);
                    if (!dist.containsKey(key) || newCost < dist.get(key)) {
                        dist.put(key, newCost);
                        pq.offer(new State(next, newCost, newConsec));
                    }
                } else {
                    int newConsec = 1;
                    int newCost = cost + w;
                    String key = key(next, newConsec);
                    if (!dist.containsKey(key) || newCost < dist.get(key)) {
                        dist.put(key, newCost);
                        pq.offer(new State(next, newCost, newConsec));
                    }
                }
            }
        }
        return -1; 
    }
    private String key(int node, int consec) {
        return node + "#" + consec;
    }
    static class State {
        int node, cost, consec;
        State(int node, int cost, int consec) {
            this.node = node;
            this.cost = cost;
            this.consec = consec;
        }
    }
}
