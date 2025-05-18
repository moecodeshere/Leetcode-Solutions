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

import java.util.*;

/**
 * LeetCode 271: Encode and Decode Strings
 *
 * Problem:
 * Design an algorithm to encode a list of strings into a single string,
 * and then decode it back to the original list.
 *
 * Use Case:
 * This is useful when you want to send or store multiple strings as one compact format,
 * such as saving a list of messages, usernames, or words into a single database field.
 */
public class EncodeDecodeStrings {

    /**
     * This class provides methods to encode and decode a list of strings.
     * The strategy is to prefix each string with its length and a separator (like '#'),
     * which allows us to safely extract strings later even if they contain special characters.
     */
    static class Codec {

        /**
         * Encodes a list of strings to a single string.
         *
         * Encoding Format:
         * Each string is encoded as: length_of_string + '#' + string
         * For example:
         * ["leet", "code"] -> "4#leet4#code"
         *
         * Time Complexity: O(N), where N is the total length of all strings
         * Space Complexity: O(N)
         */
        public String encode(List<String> strs) {
            StringBuilder encoded = new StringBuilder();
            for (String str : strs) {
                encoded.append(str.length()).append('#').append(str);
            }
            return encoded.toString();
        }

        /**
         * Decodes a single string to a list of strings.
         *
         * It reads the number before each '#' to know how many characters to read next.
         * For example:
         * "4#leet4#code" -> ["leet", "code"]
         *
         * Time Complexity: O(N), where N is the length of the encoded string
         * Space Complexity: O(N)
         */
        public List<String> decode(String s) {
            List<String> result = new ArrayList<>();
            int i = 0;

            while (i < s.length()) {
                int j = i;

                // Step 1: Read until we find the '#'
                while (s.charAt(j) != '#') {
                    j++;
                }

                // Step 2: Extract the length of the next string
                int length = Integer.parseInt(s.substring(i, j));

                // Step 3: Extract the string of the specified length
                j++; // skip '#'
                String word = s.substring(j, j + length);
                result.add(word);

                // Step 4: Move to the start of the next encoded string
                i = j + length;
            }

            return result;
        }
    }

    /**
     * Driver code to test the Codec class.
     */
    public static void main(String[] args) {
        Codec codec = new Codec();

        // Example test case 1
        List<String> input1 = Arrays.asList("neet", "code", "love", "you");
        String encoded1 = codec.encode(input1);
        List<String> decoded1 = codec.decode(encoded1);

        System.out.println("Original: " + input1);
        System.out.println("Encoded : " + encoded1);
        System.out.println("Decoded : " + decoded1);

        // Example test case 2
        List<String> input2 = Arrays.asList("we", "say", ":", "yes");
        String encoded2 = codec.encode(input2);
        List<String> decoded2 = codec.decode(encoded2);

        System.out.println("\nOriginal: " + input2);
        System.out.println("Encoded : " + encoded2);
        System.out.println("Decoded : " + decoded2);

        // Edge case: empty string and list
        List<String> input3 = Arrays.asList("", "a", "");
        String encoded3 = codec.encode(input3);
        List<String> decoded3 = codec.decode(encoded3);

        System.out.println("\nOriginal: " + input3);
        System.out.println("Encoded : " + encoded3);
        System.out.println("Decoded : " + decoded3);
    }
}

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



