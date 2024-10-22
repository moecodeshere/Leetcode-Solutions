Looking at a keyboard reveals three distinct rows of letters. A natural solution emerges from this simple observation.
The keyboard presents these three rows before us:

Top row with "qwertyuiop"
Middle row with "asdfghjkl"
Bottom row with "zxcvbnm"

A beautiful insight appears - if a word belongs to one row, every single letter must come from that same row! We can turn this insight into a counting game.
Taking each word like "Hello" or "Alaska", the first step turns them lowercase because 'A' and 'a' mean the same thing. Then we start counting:
CopyLooking at "Hello":
- Where does 'h' live?
- Which row houses 'e'?
- Where can we find 'l'?
And so the counting goes...
The magic happens in the checking part. If a word truly belongs to one row, the count from that row should match perfectly with the word's length. Consider "dad":

Each letter lives in the middle row
Middle row count shows 3
Word length equals 3
Perfect match! "dad" makes the cut!

As valid words appear, we collect them in a growing list. At the very end, this list transforms into an array, delivering exactly what was needed.
This solution flows like water - no complex tricks, just simple counting and matching. We watch as each word reveals its keyboard row story!