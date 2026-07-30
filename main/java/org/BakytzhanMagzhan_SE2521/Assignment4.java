import java.util.*;

public class Assignment4 {

    static Map<Character, List<Character>> graph = new HashMap<>();
    static Set<Character> visited = new HashSet<>();

    public static void dfs(char node) {
        visited.add(node);
        System.out.print(node + " ");

        for (char next : graph.get(node)) {
            if (!visited.contains(next)) {
                dfs(next);
            }
        }
    }

    public static void bfs(char start) {

        Queue<Character> queue = new LinkedList<>();
        Set<Character> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {

            char current = queue.poll();
            System.out.print(current + " ");

            for (char next : graph.get(current)) {
                if (!visited.contains(next)) {
                    visited.add(next);
                    queue.add(next);
                }
            }
        }
    }

    public static void main(String[] args) {

        // Task 3

        graph.put('A', Arrays.asList('C', 'B', 'D'));
        graph.put('B', Arrays.asList('A', 'C', 'E', 'G'));
        graph.put('C', Arrays.asList('A', 'B', 'D'));
        graph.put('D', Arrays.asList('C', 'A'));
        graph.put('E', Arrays.asList('G', 'F', 'B'));
        graph.put('F', Arrays.asList('G', 'E'));
        graph.put('G', Arrays.asList('F', 'B'));

        System.out.println("Task 3");

        System.out.print("DFS: ");
        dfs('A');

        System.out.println();

        System.out.print("BFS: ");
        bfs('A');

        System.out.println();
        System.out.println();

        // Task 5

        String[] city = {
                "Glasgow",
                "Stirling",
                "Edinburgh",
                "Perth",
                "Dundee"
        };

        int[][] road = {
                {0, 50, 70, 0, 0},
                {50, 0, 50, 40, 0},
                {70, 50, 0, 100, 0},
                {0, 40, 100, 0, 60},
                {0, 0, 0, 60, 0}
        };

        int n = road.length;
        int[] distance = new int[n];
        boolean[] used = new boolean[n];

        Arrays.fill(distance, Integer.MAX_VALUE);

        int start = 2;
        distance[start] = 0;

        for (int i = 0; i < n - 1; i++) {

            int min = Integer.MAX_VALUE;
            int current = -1;

            for (int j = 0; j < n; j++) {
                if (!used[j] && distance[j] < min) {
                    min = distance[j];
                    current = j;
                }
            }

            used[current] = true;

            for (int j = 0; j < n; j++) {
                if (!used[j] &&
                        road[current][j] != 0 &&
                        distance[current] + road[current][j] < distance[j]) {

                    distance[j] = distance[current] + road[current][j];
                }
            }
        }

        System.out.println("Task 5");
        System.out.println("Shortest path Edinburgh to Dundee: " + distance[4]);
    }
}