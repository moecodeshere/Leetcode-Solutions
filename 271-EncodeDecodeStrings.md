# 🧩 Encode and Decode Strings

## 🧠 Problem Statement

Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.

---

## 📌 LeetCode Info

- **Platform**: [LeetCode](https://leetcode.com/problems/encode-and-decode-strings/)
- **Problem Number**: 271
- **Difficulty**: Medium
- **Tags**: String, Design

---

## 💡 Intuition (Easy Language)

When you join strings, a natural idea is to separate them with a character (like comma `,`), but what if the original strings contain that character? It becomes hard to tell what's part of the string and what’s a separator.

Instead, we encode each string with its **length** followed by a **separator character** (like `#`) and then the string itself.

**Example:**

Original list:  
```["neet", "code", "love", "you"]```

Encoded string:  
```"4#neet4#code4#love3#you"```

The decoder reads the length first (until `#`), and then reads the next `length` characters to get the original string.

---

## 🛠 Java Implementation

```java
import java.util.*;

public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            encoded.append(s.length()).append('#').append(s);
        }
        return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            // Find the position of the '#' to extract the length
            while (s.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(s.substring(i, j));
            j++; // skip the '#'
            decoded.add(s.substring(j, j + length));
            i = j + length;
        }
        return decoded;
    }
}
🧪 Example
java
Copy
Edit
public class Test {
    public static void main(String[] args) {
        Codec codec = new Codec();
        List<String> input = Arrays.asList("neet", "code", "love", "you");
        String encoded = codec.encode(input);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = codec.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}
Output:

yaml
Copy
Edit
Encoded: 4#neet4#code4#love3#you
Decoded: [neet, code, love, you]
⏱ Time and Space Complexity
Operation	Time Complexity	Space Complexity
Encode	O(N)	O(N)
Decode	O(N)	O(N)

Where N is the total number of characters across all strings.

❓ Interview Follow-Ups
Q: What if a string contains the # character?
✅ No issue — since we’re not using # as a separator but as a boundary after a number, we always parse using the length first.

Q: Can you encode an empty list or list with empty strings?
✅ Yes. Empty list returns empty string. For empty strings, "0#" is stored.

Q: What if strings are very large?
✅ This approach handles any size up to input constraints because parsing is based on string length.

Q: Can you implement this in a different language like Python?
✅ See below.

🐍 Python Version (for comparison)
python
Copy
Edit
class Codec:
    def encode(self, strs):
        return ''.join(f"{len(s)}#{s}" for s in strs)

    def decode(self, s):
        res, i = [], 0
        while i < len(s):
            j = i
            while s[j] != '#':
                j += 1
            length = int(s[i:j])
            j += 1
            res.append(s[j:j+length])
            i = j + length
        return res
📘 Concepts Covered
✅ Custom string serialization and parsing

✅ Length prefix encoding

✅ Edge case handling (empty strings, special characters)

✅ Time & space analysis

✅ Iterating and parsing strings in-place

🧠 Prerequisites for Understanding
Basics of Strings (substring, charAt, length)

Understanding of List/Array operations

Integer parsing from substrings

StringBuilder for efficient string concatenation

🎯 Useful for Interview Topics
String Manipulation

Encoding/Decoding

Custom Serialization

Data Transfer Formats

✅ Summary
This problem is a great test of string manipulation and custom encoding. It teaches you how to preserve structure in a flat format while avoiding ambiguity and how to reverse that process accurately.

It’s also very real-world relevant — this is how data is often serialized for transmission or storage in systems like messaging apps or network protocols.


