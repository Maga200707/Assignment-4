# Assignment-4
Bakytzhan Magzhan: SE-2521 Group 3
Texted Tasks:
Task 1:
A: C, B, D
B: A, C, E, G
C: A, B, D
D: C, A
E: G, F, B
F: G, E
G: F, B

Order visiting:
A -> C -> B -> E -> G -> F -> D

Detailed Trace DFS:
1. Start with A
2. Visit to C (first neighbor A)
3. From C to B
4. From B to E
5. From E to G
6. From G to F
7. F has no neighbors so back to G
8. Return to E
9. Return to B
10. All neighbors of B visited so return to C
11. From C to D
12. D has no neighbors so return to C
13. Return to A
14. All neighbors A are visited


Task: 2
Detailed Trace BFS:
A:
Queue: C, B, D
C:
Queue: B, D
B:
Queue: D, E, G
D:
Queue: E, G
E:
Queue: G, F
G:
Queue: F
F is empty

so BFS Final Answer: A, C, B, D, E, G, F

Task: 4
Shortest Path:
Edinburgh -> Stirling -> Perth -> Dundee
50 + 40 + 60 = 150
