# 📄 ContainsDuplicate.java

A Java program that determines whether a given array of integers contains any duplicates.  
Uses a `HashSet` for optimal performance.

---

## 🧠 Problem Statement

> Given an array of integers, return `true` if any value appears at least twice in the array.  
> Return `false` if every element is distinct.

---

## 🛠️ Key Concepts Covered

- Use of `HashSet<Integer>` to track u nique elements.
- Efficient loop-based approach to check for duplicates.
- Time vs. space trade-offs in algorithm design.

---

## ✅ Example Input/Output

### Input:
```java
int[] nums = {1, 2, 3, 1};
Output:
arduino
Copy
Edit
true
🔍 Code Overview
java
Copy
Edit
import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // Duplicate found
            }
            seen.add(num);
        }

        return false; // All elements are unique
    }
}
How It Works:
We iterate over each number.

If the number already exists in the HashSet, it's a duplicate → return true.

If not, add it to the set.

After the loop, if no duplicates are found, return false.

📈 Time & Space Complexity
Operation	Complexity
Time	O(n)
Space	O(n)

We traverse the array once.

HashSet provides average O(1) insert and lookup.

📚 How to Run
Save the code in a file named ContainsDuplicate.java.

Make sure it includes a main method to call the containsDuplicate function.

Compile it:

bash
Copy
Edit
javac ContainsDuplicate.java
Run it:

bash
Copy
Edit
java ContainsDuplicate
🧪 Sample main Method for Testing
java
Copy
Edit
public class ContainsDuplicate {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4, 1};

        System.out.println(sol.containsDuplicate(nums)); // Output: true
    }
}
