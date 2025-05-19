# 📄 CharFrequency.java

A simple Java program that demonstrates how to count the frequency of each character in a string using a `HashMap`.

---

## 🧠 Problem Statement

> Given a string, count how many times each character appears and store that information in a map.

---

## 🛠️ Key Concepts Covered

- `HashMap<Character, Integer>` usage
- Iterating over a string using `charAt(i)`
- Using `getOrDefault()` for safe map lookups
- Basic character counting (frequency analysis)

---

## 📌 Example Input/Output

### Input:
```java
String str = "banana";
Output:
Copy
Edit
{a=3, b=1, n=2}
🔍 Code Overview
java
Copy
Edit
HashMap<Character, Integer> map = new HashMap<>();

for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);
    map.put(ch, map.getOrDefault(ch, 0) + 1);
}
What it does:
str.charAt(i) extracts one character at a time.

map.getOrDefault(ch, 0) retrieves the current count or returns 0 if the character hasn’t been seen yet.

map.put(...) updates the count in the map.

📚 How to Run
Save the code in a file named CharFrequency.java.

Compile it:

bash
Copy
Edit
javac CharFrequency.java
Run it:

bash
Copy
Edit
java CharFrequency
✅ Output
Copy
Edit
{a=3, b=1, n=2}
🚀 Possible Extensions
Count only alphabetic characters, ignore digits or symbols.

Make it case-insensitive by converting to lowercase.

Count word frequencies instead of characters.

Find the most frequent character.

Return sorted frequencies.

📦 Dependencies
Pure Java (java.util.HashMap)

No external libraries

