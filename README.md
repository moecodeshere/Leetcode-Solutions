<h1 align="center">📘 LeetCode Java Solutions</h1>

<p align="center">
  🚀 Mastering coding interviews through <strong>patterns</strong>, <strong>data structures</strong>, and <strong>clean code</strong><br/>
  📚 Curated solutions with full explanations, categorized for learning and revision
</p>

---

## 🧠 Patterns & Techniques

| 🔍 Pattern              | 💡 Description                                    |
|------------------------|---------------------------------------------------|
| 🧭 Two Pointers         | Fast & slow pointer logic for traversal           |
| 🪟 Sliding Window       | Dynamic window resizing for subarray problems     |
| 🔁 Prefix Sum / Diff    | Preprocessing arrays for quick queries            |
| 📦 Stack & Queue        | Monotonic structures, BFS/DFS                     |
| 🌲 Recursion & Backtracking | Explore all combinations, decision trees      |
| 🧩 Dynamic Programming  | Memoization, tabulation (1D & 2D)                 |
| 🧮 Binary Search        | Arrays, rotated arrays, and binary search on answer |
| 🧠 Bit Manipulation     | XOR tricks, subsets, masks                        |
| 📐 Greedy Algorithms    | Local optimal = global optimal                    |

---

## 🧰 Data Structures Covered

| Structure       | Examples                             |
|----------------|---------------------------------------|
| ✅ Arrays       | Sorting, Prefix Sum, Kadane’s         |
| ✅ HashMap / Set| Frequency maps, grouping, lookup      |
| ✅ Stack / Queue| Monotonic stack, min stack, deque     |
| ✅ Linked List  | Reversal, merging, fast/slow pointer  |
| ✅ Trees        | DFS, BFS, binary search trees         |
| ✅ Graphs       | Union-Find, Topological Sort, Dijkstra|
| ✅ Heap / PQ    | K largest, sliding window max         |
| ✅ DP Arrays    | Fibonacci, knapsack, grid paths       |

---

## 📂 Folder Structure

```bash
leetcode-java/
├── arrays/
│   └── two_sum.java
├── hashmap/
│   └── group_anagrams.java
├── sliding_window/
├── stack_queue/
├── linked_list/
├── trees_graphs/
├── dynamic_programming/
├── math_geometry/
└── notes/
    └── patterns.md
✨ Sample Problem: Group Anagrams
java
Copy
Edit
public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for (String s : strs) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String key = new String(chars);
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
    }
    return new ArrayList<>(map.values());
}
⏱ Time: O(n * k log k) | 📦 Space: O(n * k)
🔑 Technique: HashMap + Sorting
💡 Intuition: Use sorted string as unique key for anagram grouping

🗺️ Visual Roadmap
<p align="center"> <img src="assets/leetcode_roadmap.png" width="80%" alt="LeetCode Roadmap"> </p>
🧑‍💻 About This Repo
This repo is built for:

📌 Consistent practice & tracking

📘 Learning by patterns, not just problems

👨‍🏫 Explaining solutions like you're teaching others

